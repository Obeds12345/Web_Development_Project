/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-04-18 15:21:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.parts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/parts/../css/style.css", Long.valueOf(1587172210421L));
    _jspx_dependants.put("/parts/../css/contact.css", Long.valueOf(1587172983145L));
  }

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

      out.write("  <main>\r\n");
      out.write("        <div class=\"text-white d-flex align-middle\"\r\n");
      out.write("            style=\"align-items:center;background-image: url(images/image5.jpg);height: 200px;\">\r\n");
      out.write("            <div class=\"p-5\">\r\n");
      out.write("                <h6>\r\n");
      out.write("                 <ol class=\"breadcrumb mb-0\">\r\n");
      out.write("                   <li class=\"breadcrumb-item\"><a href=\"index\" id=\"link\">Home</a></li>\r\n");
      out.write("                   <li class=\"breadcrumb-item active\" aria-current=\"page\">Contact us</li>\r\n");
      out.write("                 </ol>\r\n");
      out.write("                </h6>\r\n");
      out.write("                <h1> CONTACT US </h1>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row py-4\">\r\n");
      out.write("                <div class=\"col-6\">\r\n");
      out.write("                    <h2> HOW TO FIND US </h2>\r\n");
      out.write("                    <span class=\"text-muted\">\r\n");
      out.write("                        Our goal is to provide the best customer service and to answer all of your questions in a timely\r\n");
      out.write("                        manner. If you have any concern regarding your terms,\r\n");
      out.write("                        please contact Barbs Beaver lodge using the contact information on this page.\r\n");
      out.write("                    </span>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-6\">\r\n");
      out.write("                    <h2>LEAVE US A MESSAGE </h2>\r\n");
      out.write("                    <span class=\"text-muted\">Got a question, need to adopt, we do love to hear from you.\r\n");
      out.write("                        please leave me a message that includes your name email, and telephone number,\r\n");
      out.write("                          I will return your call as soon as possible. Thank you.\r\n");
      out.write("                    </span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row py-4\">\r\n");
      out.write("                <div class=\"col-6\">\r\n");
      out.write("                    <div class=\"row py-2\">\r\n");
      out.write("                        <div class=\"col-sm-3 col-lg-6 hidden-md-down\">\r\n");
      out.write("                            <a class=\"bg-circle bg-info\" href=\"# \">\r\n");
      out.write("                                <i class=\"fas fa-phone fa-2x fa-fw\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <span>(312)-394-9286</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-3 col-lg-6 hidden-md-down\">\r\n");
      out.write("                            <a class=\"bg-circle bg-info\" href=\"# \">\r\n");
      out.write("                                <i class=\"fas fa-fax fa-2x fa-fw\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <span>(312)-394-3030</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row py-2\">\r\n");
      out.write("                        <div class=\"col-sm-3 col-lg-6 hidden-md-down\">\r\n");
      out.write("                            <a class=\"bg-circle bg-info\" href=\"# \">\r\n");
      out.write("                                <i class=\"fab fa-skype fa-2x fa-fw\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <span>BeaverSkype</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-3 col-lg-6 hidden-md-down\">\r\n");
      out.write("                            <a class=\"bg-circle bg-info\" href=\"# \">\r\n");
      out.write("                                <i class=\"fab fa-instagram fa-2x fa-fw \"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <span>#BeaverCare</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row py-2\">\r\n");
      out.write("                        <div class=\"col-sm-3 col-lg-12 hidden-md-down\">\r\n");
      out.write("                            <a class=\"bg-circle bg-info\" href=\"# \">\r\n");
      out.write("                                <i class=\"fas fa-envelope-open-text fa-2x fa-fw\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <span>beaver_care@gmail.com</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row py-2\">\r\n");
      out.write("                        <div class=\"col-sm-3 col-lg-12 hidden-md-down\">\r\n");
      out.write("                            <a class=\"bg-circle bg-info\" href=\"# \">\r\n");
      out.write("                                <i class=\"fas fa-map-marker-alt fa-2x fa-fw\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <span>2031 South Clark, Chicago-IL</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-6\">\r\n");
      out.write("                    <form action=\"contact\" method=\"post\">\r\n");
      out.write("                    <div style=\"color:green\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contactMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <textarea class=\"form-control\" name=\"message\" placeholder=\"Your message\" id=\"contactMessage\"\r\n");
      out.write("                                rows=\"3\"></textarea>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <input class=\"form-control form-control-lg\" name=\"name\" placeholder=\"Your name\" type=\"text\"\r\n");
      out.write("                                id=\"contactName\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <input class=\"form-control form-control-lg\" name=\"email\" placeholder=\"Your email\" type=\"email\"\r\n");
      out.write("                                id=\"contactEmail\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <select class=\"form-control form-control-lg\" name=\"reason\" id=\"contactReason\">\r\n");
      out.write("                                <option>Reason of contact</option>\r\n");
      out.write("                                <option>I did not receive my order</option>\r\n");
      out.write("                                <option>Return my item</option>\r\n");
      out.write("                                <option>Cancel my appointment</option>\r\n");
      out.write("                                <option>Other</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"form-group d-flex justify-content-end\">\r\n");
      out.write("                            <button class=\"btn btn-info\" type=\"submit\" name=\"contact\" >Submit</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- <div class=\"container center_xy\">\r\n");
      out.write("            <img src=\"images/location.JPG\">\r\n");
      out.write("        </div> -->\r\n");
      out.write("\r\n");
      out.write("    </main>\r\n");
      out.write("    <style>");
      out.write(".center_xy {\r\n");
      out.write("  display: flex;\r\n");
      out.write("  align-items:center;\r\n");
      out.write("  justify-content: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sticky {\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  top: 0;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  z-index: 1039;\r\n");
      out.write("}\r\n");
      out.write(".fw700{\r\n");
      out.write("  font-weight: 700;\r\n");
      out.write("}\r\n");
      out.write(".bg-dark {\r\n");
      out.write("  background-color: #000 !important;\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write(".u:hover{\r\n");
      out.write("   text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("a:hover{\r\n");
      out.write("  color: #007bff;\r\n");
      out.write("  text-decoration: underline\r\n");
      out.write("}\r\n");
      out.write(".pointer{\r\n");
      out.write("cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-continue {\r\n");
      out.write("    background-color: #ef6c00;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    border: .1rem solid #ef6c00;\r\n");
      out.write("    font-weight: 700;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("textarea:focus,\r\n");
      out.write("textarea.form-control:focus,\r\n");
      out.write("input.form-control:focus,\r\n");
      out.write("select:focus,\r\n");
      out.write("button:focus,\r\n");
      out.write(".form-control:focus,\r\n");
      out.write("input[type=text]:focus,\r\n");
      out.write("input[type=password]:focus,\r\n");
      out.write("input[type=email]:focus,\r\n");
      out.write("input[type=number]:focus,\r\n");
      out.write("[type=text].form-control:focus,\r\n");
      out.write("[type=password].form-control:focus,\r\n");
      out.write("[type=email].form-control:focus,\r\n");
      out.write("[type=tel].form-control:focus,\r\n");
      out.write("[contenteditable].form-control:focus {\r\n");
      out.write("  box-shadow: inset 0 -1px 0 #ddd;\r\n");
      out.write("}");
      out.write("</style>\r\n");
      out.write("    <style>");
      out.write("\r\n");
      out.write(" .bg-circle\r\n");
      out.write(" {\r\n");
      out.write("   display: inline-block;\r\n");
      out.write("   width: 60px;\r\n");
      out.write("   height: 60px;\r\n");
      out.write("   padding: 14px 4px;\r\n");
      out.write("   color: #ececec;\r\n");
      out.write("   text-align: center;\r\n");
      out.write("   border-radius: 50%;\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write(" .bg-circle-outline\r\n");
      out.write(" {\r\n");
      out.write("   width: 50px;\r\n");
      out.write("   height: 50px;\r\n");
      out.write("   color:smoke;\r\n");
      out.write("   padding: 8px 2px;\r\n");
      out.write("   border: 2px solid;\r\n");
      out.write("   border-color: smoke;\r\n");
      out.write("   border-radius: 50%;\r\n");
      out.write(" }\r\n");
      out.write(" .breadcrumb li a:hover{\r\n");
      out.write("    color:black\r\n");
      out.write("    text-decoration:underline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bg-circle:hover, .media:focus\r\n");
      out.write("{\r\n");
      out.write("  text-decoration: none !important;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  color: #ececec;\r\n");
      out.write("}\r\n");
      out.write(".bg-circle-outline :hover, .media:focus\r\n");
      out.write("{\r\n");
      out.write("  text-decoration: none !important;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  color: #ececec;\r\n");
      out.write("}");
      out.write("</style>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
