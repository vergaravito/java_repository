package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.print(" DispatchServlet!");
		String nextJSP = request.getParameter("jspUrl");
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        String out="";
        
		try{
			if((nextJSP!=null||!nextJSP.equals(""))&&(!nextJSP.equals("getImages"))){
				response.sendRedirect(request.getContextPath() + "/web/"+nextJSP);
//				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/web/"+nextJSP);
//		        dispatcher.forward(request, response);
			}else{
				if(nextJSP.equals("getImages")){
					out = getImages();
					pr.println(out);
				}				
			}
		}catch(NullPointerException e){
			nextJSP = "/web/Init.jsp";
	        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
	        dispatcher.forward(request, response);
		}
	}
	
	protected String getImages() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String out="";
		
		try {
//			ArrayList list = new ArrayList();
			
			conn = Connessione.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM foto");
			while (rs.next()) {
				foto new_foto = new foto();
				new_foto.setNomefoto(rs.getString("nomefoto"));
				new_foto.setDescfoto(rs.getString("descfoto"));
//				list.add(new_foto);
				out +=new_foto.getNomefoto()+";";
			}
			
		} catch (ClassNotFoundException ex) {
			ex.getMessage();
		} catch (SQLException ex) {
			ex.getMessage();
		} finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException ex) {
				ex.getMessage();
			}
		}
		return out;
	}
}