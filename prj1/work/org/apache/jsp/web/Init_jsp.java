/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.62
 * Generated at: 2015-06-28 21:19:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Init_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

 String msg = (String) request.getAttribute("message"); 
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction imgUploader() {\r\n");
      out.write("\t\t\twindow.open(\"/prj1/DispatchServlet?jspUrl=imguploader.jsp\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction imgViewer()  {\r\n");
      out.write("\t\t\twindow.open(\"/prj1/DispatchServlet?jspUrl=imgviewer.jsp\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\th1 {\r\n");
      out.write("\t\t\tfont-family: cursive;\r\n");
      out.write("\t\t\tfont-variant: small-caps;\r\n");
      out.write("\t\t\tfont-size: 50px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tbody{\r\n");
      out.write("\t\t\tmargin: 0;\r\n");
      out.write("\t\t\tbackground-color: rgba(6, 255, 0, 0.34);\r\n");
      out.write("\t\t\tbackground-image: linear-gradient(to left, rgba(74, 255, 0, 1) 0%, rgba(8, 66, 16, 1) 98%);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.container{\r\n");
      out.write("\t\t\ttext-align: center;\r\n");
      out.write("\t\t\tmargin: 1%;\r\n");
      out.write("\t\t\tpadding: 5%;\r\n");
      out.write("\t\t\tbackground-color: rgb(127, 147, 147);\r\n");
      out.write("\t\t\theight: auto;\r\n");
      out.write("\t\t\tmin-height: 100%;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.btn {\r\n");
      out.write("\t\t\tmargin-top: 50px;\r\n");
      out.write("\t\t\tborder-radius: 25px;\r\n");
      out.write("\t\t\tpadding: 5px 20px;\r\n");
      out.write("\t\t\tbackground-color: lime;\r\n");
      out.write("\t\t\tcursor: pointer;\r\n");
      out.write("\t\t\tborder: 0px;\r\n");
      out.write("\t\t\tcolor: rgb(86, 86, 86);\r\n");
      out.write("\t\t\ttransition: background-color 0.2s ease-in-out;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.btn:hover {\r\n");
      out.write("\t\t\tbackground-color: rgba(0, 255, 0, 0.30);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\t<body>\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<h1> Welcome Gianpaolo! </h1>\r\n");
      out.write("\t\t\t\t<button class=\"btn\" onClick=\"javascript:imgUploader();\">Images Uploader</button>\r\n");
      out.write("\t\t\t\t<button class=\"btn\" onClick=\"javascript:imgViewer();\">Images Viewer</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
