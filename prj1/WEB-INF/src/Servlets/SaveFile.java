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

		
//		String FileName = (String) request.getParameter("file");
//		String AppPath = getServletContext().getRealPath("/");
//		try {
//			int lenght = request.getContentLength();
//			InputStream is = (InputStream) request.getAttribute("file");
//			byte[] ByteArray = (request.getParameter("file")).getBytes();
//			File newFile = new File(AppPath+"File\\", FileName);
//			FileOutputStream fos = new FileOutputStream(AppPath+"File\\"+FileName);
//			fos.write(ByteArray);
//			fos.close();
//			
//			File newFile = new File(AppPath+"File\\", FileName);
//			newFile.setReadable(true);
//			newFile.setWritable(true);
//			OutputStream os = new FileOutputStream(AppPath+"File\\"+FileName);
//	        byte[] buffer = new byte[1];
//			int len = -1;
//			long tot = 0;
//			while ((len = is.read(buffer)) > 0) {
//				os.write(buffer, 0, buffer.length);
//				tot += buffer.length;
//			}
//			is.close();
//			os.flush();
//			os.close();
			
//			File fOUT = new File(AppPath+"File\\",FileName);
//			InputStreamReader fr = new InputStreamReader(is);
//			BufferedReader br = new BufferedReader(fr);
//			FileWriter fw = new FileWriter(fOUT);
//			BufferedWriter bw = new BufferedWriter(fw);
//			String temp = br.readLine();
//			while(temp != null) {
//				bw.write(temp);
//				temp = br.readLine();
//			}
//			bw.flush();
//			bw.close();
//			br.close();
//		} catch (Exception e1) {
//			e1.printStackTrace();
//		}


