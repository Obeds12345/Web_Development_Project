/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-04-18 14:45:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/parts/../css/nav.css", Long.valueOf(1586751736052L));
    _jspx_dependants.put("/parts/nav.jsp", Long.valueOf(1587194927943L));
    _jspx_dependants.put("/parts/footer.jsp", Long.valueOf(1587173121134L));
    _jspx_dependants.put("/parts/header.jsp", Long.valueOf(1586751626706L));
    _jspx_dependants.put("/parts/../css/footer.css", Long.valueOf(1587172764622L));
    _jspx_dependants.put("/parts/../css/style.css", Long.valueOf(1587172210421L));
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<title>Home Page</title>\n");
      out.write("\r\n");
      out.write(" <title>Beaver Lodge</title>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("   <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("       id=\"bootstrap-css\">\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.5.0/css/all.css\"\r\n");
      out.write("       integrity=\"sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU\" crossorigin=\"anonymous\">\r\n");
      out.write("       <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("     <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("     <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\" integrity=\"sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-light bg-info py-2\">\r\n");
      out.write("    <div class=\"container-fluid text-white d-flex justify-content-between\">\r\n");
      out.write("        <div class=\"\">\r\n");
      out.write("            <span class=\"mr-2\">\r\n");
      out.write("                <i class=\"fas fa-map-marker-alt\"></i>&nbsp;\r\n");
      out.write("                <small>2031 South Clark, Chicago-IL</small>\r\n");
      out.write("            </span>\r\n");
      out.write("            <span class=\"mr-2\">\r\n");
      out.write("                <i class=\"fas fa-phone-volume\"></i>&nbsp;\r\n");
      out.write("                <small>312 394 9286</small>\r\n");
      out.write("            </span>\r\n");
      out.write("            <span>\r\n");
      out.write("                <i class=\"fas fa-envelope\"></i>&nbsp;\r\n");
      out.write("                <small>beaver_care@gmail.com</small>\r\n");
      out.write("            </span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            <ul class=\"list-inline my-0\">\r\n");
      out.write("                <li class=\"list-inline-item border-left border-right mx-0 px-4\">\r\n");
      out.write("                  <a href=\"https://www.facebook.com/\" class=\"text-white\"><i class=\"fab fa-facebook-f\"></i> </a>\r\n");
      out.write("               </li>\r\n");
      out.write("                <li class=\"list-inline-item border-right mx-0 px-3\">\r\n");
      out.write("                   <a href=\"https://www.twitter.com/\" class=\"text-white\"><i class=\"fab fa-twitter\"></i> </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"list-inline-item border-right mx-0 px-3\">\r\n");
      out.write("                   <a href=\"https://www.youtube.com/\" class=\"text-white\"><i class=\"fab fa-youtube\"></i></a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-md navbar-white bg-white sticky-top py-0 border-bottom\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"index\"><img src=\"images/logo.jpg\" alt=\"\" style=\"height: 60px;\"></a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\r\n");
      out.write("            aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("            <ul class=\"navbar-nav ml-auto px-2 py-3\">\r\n");
      out.write("                <li class=\"nav-item active\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"index\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"nav-item dropdown\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\"\r\n");
      out.write("                        data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                        Service\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"workshop\">Training/Workshop</a>\r\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"shop\">Shop</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"contact\">Contact</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"about\">About Us</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("                <button class=\"btn btn-outline-info my-2 my-sm-0 mr-2\" data-toggle=\"modal\" data-target=\"#booknow\">\r\n");
      out.write("                    Book Now\r\n");
      out.write("                </button>\r\n");
      out.write("\r\n");
      out.write("                 <button class=\"btn btn-warning my-2 my-sm-0 text-white\"  onClick=\"javascript:window.location='");
      out.print("cart");
      out.write("';\">\r\n");
      out.write("                     <i class=\"fa fa-shopping-cart\"></i> (<span class=\"badge total-count\"></span>)\r\n");
      out.write("                 </button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"booknow\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"booknowTitle\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLongTitle\">Questions? Book an Appointment</h5>\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <div class=\"well-block\">\r\n");
      out.write("                        <form action=\"workshop\" method=\"post\">\r\n");
      out.write("                            <!-- Form start -->\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"control-label\" for=\"name\">Name</label>\r\n");
      out.write("                                        <input id=\"name\" name=\"name\" type=\"text\" placeholder=\"Name\"\r\n");
      out.write("                                            class=\"form-control input-md\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- Text input-->\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"control-label\" for=\"email\">Email</label>\r\n");
      out.write("                                        <input id=\"email\" name=\"email\" type=\"text\" placeholder=\"E-Mail\"\r\n");
      out.write("                                            class=\"form-control input-md\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- Text input-->\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"control-label\" for=\"date\">Preferred Date</label>\r\n");
      out.write("                                        <input id=\"date\" name=\"date\" type=\"text\" placeholder=\"Preferred Date\"\r\n");
      out.write("                                            class=\"form-control input-md\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- Select Basic -->\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"control-label\" for=\"time\">Preferred Time</label>\r\n");
      out.write("                                        <select id=\"time\" name=\"time\" class=\"form-control\">\r\n");
      out.write("                                            <option value=\"8:00 to 9:00\">8:00 to 9:00</option>\r\n");
      out.write("                                            <option value=\"9:00 to 10:00\">9:00 to 10:00</option>\r\n");
      out.write("                                            <option value=\"10:00 to 1:00\">10:00 to 1:00</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- Select Basic -->\r\n");
      out.write("                                <div class=\"col-md-12\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"control-label\" for=\"appointmentfor\">Appointment For</label>\r\n");
      out.write("                                        <select id=\"appointmentfor\" name=\"appointmentfor\" class=\"form-control\">\r\n");
      out.write("                                            <option value=\"Service#1\">Grooming</option>\r\n");
      out.write("                                            <option value=\"Service#2\">Beaver Yoga</option>\r\n");
      out.write("                                            <option value=\"Service#3\">Adoption Service</option>\r\n");
      out.write("                                            <option value=\"Service#4\">Exercise</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- Button -->\r\n");
      out.write("                                <div class=\"col-md-12\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <button id=\"singlebutton\" type=\"submit\" name=\"makeAppointment\" class=\"btn btn-default\">Make An\r\n");
      out.write("                                            Appointment</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <!-- form end -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"./javascript/index.js\"></script>\r\n");
      out.write("<style>");
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
      out.write("<style>");
      out.write("#navbarSupportedContent ul li {\r\n");
      out.write("    margin-right: 50px;\r\n");
      out.write("    border-bottom: 2px solid white;\r\n");
      out.write("}\r\n");
      out.write("#navbarSupportedContent ul li:hover {\r\n");
      out.write("    border-bottom: 2px solid #17a2b8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("  #navbarSupportedContent ul li .nav-link {\r\n");
      out.write("  color: black;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  #navbarSupportedContent ul li .nav-link:hover {\r\n");
      out.write("    color: #17a2b8;\r\n");
      out.write("    }");
      out.write("</style>");
      out.write("\n");
      out.write("    <div class=\"view\">\n");
      out.write("        <div class=\"pages\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "parts/home.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");
      out.write("<footer class=\" border-top\">\r\n");
      out.write("        <div class=\"container-fluid bg-faded mt-5\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row py-3\">\r\n");
      out.write("                    <!-- footer column 1 start -->\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <!-- row start -->\r\n");
      out.write("                        <div class=\"row py-2\">\r\n");
      out.write("                            <div class=\"col-sm-3 hidden-md-down\">\r\n");
      out.write("                                <a class=\"bg-circle bg-info\" href=\"https://twitter.com/ \">\r\n");
      out.write("                                    <i class=\"fab fa-2x fa-fw fa-twitter\" aria-hidden=\"true \"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-sm-9\">\r\n");
      out.write("                                <h4>Tweets</h4>\r\n");
      out.write("                               View Our Tweets.\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- row end -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- footer column 1 end -->\r\n");
      out.write("                    <!-- footer column 2 start -->\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <!-- row start -->\r\n");
      out.write("                        <div class=\"row py-2\">\r\n");
      out.write("                            <div class=\"col-sm-3 hidden-md-down\">\r\n");
      out.write("                                <a class=\"bg-circle bg-info\" href=\"contact\">\r\n");
      out.write("                                    <i class=\"fa fa-2x fa-fw fa-address-card\" aria-hidden=\"true \"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-sm-9\">\r\n");
      out.write("                                <h4>Contact us</h4>\r\n");
      out.write("                                <p>Why not?</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- row end -->\r\n");
      out.write("                        <!-- row start -->\r\n");
      out.write("                        <div class=\"row py-2\">\r\n");
      out.write("                            <div class=\"col-sm-3 hidden-md-down\">\r\n");
      out.write("                                <a class=\"bg-circle bg-info\" href=\"#\">\r\n");
      out.write("                                    <i class=\"fa fa-2x fa-fw fa-laptop\" aria-hidden=\"true \"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-sm-9\">\r\n");
      out.write("                                <h4>Cookie policy</h4>\r\n");
      out.write("                                <p class=\" \">We use <a class=\" \" href=\"#\">cookies </a></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- row end -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- footer column 2 end -->\r\n");
      out.write("                    <!-- footer column 3 start -->\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <!-- row starting  -->\r\n");
      out.write("                        <div class=\"row py-2\">\r\n");
      out.write("                            <div class=\"col-sm-3 hidden-md-down\">\r\n");
      out.write("                                <a class=\"bg-circle bg-danger\" href=\"policy.pdf\" download>\r\n");
      out.write("                                    <i class=\"fas fa-2x fa-fw fa-file-pdf\" aria-hidden=\"true \"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-sm-9\">\r\n");
      out.write("                                <h4>Download pdf</h4>\r\n");
      out.write("                                <p>Privacy Policy.</a></p>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- row ended -->\r\n");
      out.write("                        <!-- row starting  -->\r\n");
      out.write("                        <div class=\"row py-2\">\r\n");
      out.write("                            <div class=\"col-sm-3 hidden-md-down\">\r\n");
      out.write("                                <a class=\"bg-circle bg-info\" href=\"about\">\r\n");
      out.write("                                    <i class=\"fa fa-2x fa-fw fa-info\" aria-hidden=\"true \"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-sm-9\">\r\n");
      out.write("                                <h4>Info</h4>\r\n");
      out.write("                                About us.\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- row ended -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- footer column 3 end -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container-fluid bg-dark\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row py-2\">\r\n");
      out.write("                    <div class=\"col-md-9\">\r\n");
      out.write("                        <p class=\"text-white\">Copyright@ 2020 Barbs Beaver All Rights Reserved.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3\">\r\n");
      out.write("                        <div class=\"d-inline-block\">\r\n");
      out.write("                            <div class=\"bg-circle-outline d-inline-block\">\r\n");
      out.write("                                <a href=\"https://www.facebook.com/\" class=\"text-white\"><i\r\n");
      out.write("                                        class=\"fab fa-2x fa-fw fa-facebook-f\"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"bg-circle-outline d-inline-block\">\r\n");
      out.write("                                <a href=\"https://twitter.com/\" class=\"text-white\">\r\n");
      out.write("                                    <i class=\"fab fa-2x fa-fw fa-twitter\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"bg-circle-outline d-inline-block\">\r\n");
      out.write("                                <a href=\"https://www.linkedin.com/company/\" class=\"text-white\">\r\n");
      out.write("                                    <i class=\"fab fa-2x fa-fw fa-linkedin-in\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
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
      out.write(".bg-circle\r\n");
      out.write("{\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  width: 60px;\r\n");
      out.write("  height: 60px;\r\n");
      out.write("  padding: 14px 4px;\r\n");
      out.write("  color: #ececec;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  border-radius: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bg-circle-outline\r\n");
      out.write("{\r\n");
      out.write("  width: 50px;\r\n");
      out.write("  height: 50px;\r\n");
      out.write("  color:smoke;\r\n");
      out.write("  padding: 8px 2px;\r\n");
      out.write("  border: 2px solid;\r\n");
      out.write("  border-color: smoke;\r\n");
      out.write("  border-radius: 50%;\r\n");
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
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
