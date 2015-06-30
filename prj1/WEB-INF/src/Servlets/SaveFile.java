package Servlets;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.servlet.*;


public class SaveFile extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String NomeFoto = "";
		String DescFoto = request.getParameter("desc");
		
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		
		if(isMultipart){
			ServletFileUpload upload = new ServletFileUpload();
			try{
				FileItemIterator itr = upload.getItemIterator(request);
				while(itr.hasNext()){
					FileItemStream item = itr.next();
					if(item.isFormField()){
						
					}else{
						String path = getServletContext().getRealPath("/");
						File newFile = new File(path+File.separator+"File\\"+item.getName());
						FileOutputStream fos = new FileOutputStream(newFile);
						InputStream is = item.openStream();
						byte[] buffer = new byte[1024];
						int len = 0;
						while ((len = is.read(buffer)) != -1) {
							fos.write(buffer, 0, len);
						}
						fos.flush();
						fos.close();
						NomeFoto = item.getName();
					}
				}
			}catch(Exception ex){
				ex.printStackTrace();
			}
			try{
				conn = Connessione.getConnection();
				
				String query = "INSERT INTO foto (nomefoto, descfoto) VALUES (?,?)";
				PreparedStatement dbStatement = conn.prepareStatement(query);
				dbStatement.setString(1, NomeFoto);
				dbStatement.setString(2, DescFoto);
				dbStatement.executeUpdate();
				dbStatement.close();
				conn.close();
				response.sendRedirect(request.getContextPath() + "/web/imgviewer.jsp");
				
			}catch(Exception ex){
				ex.printStackTrace();
			}
			
		}
		
	}

}

