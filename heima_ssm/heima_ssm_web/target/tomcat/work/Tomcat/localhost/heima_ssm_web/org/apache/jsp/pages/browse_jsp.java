/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-05-27 04:19:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class browse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html >\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,user-scalable=no\" >\r\n");
      out.write("    <title>邮鱼</title>\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        .login {\r\n");
      out.write("            display: block;\r\n");
      out.write("            float: right;\r\n");
      out.write("            margin: 0 20px;\r\n");
      out.write("        }\r\n");
      out.write("        .paddtop{\r\n");
      out.write("            padding-top:20px ;\r\n");
      out.write("        }\r\n");
      out.write("        .search-btn{\r\n");
      out.write("            float: left;\r\n");
      out.write("            border: 1px solid #ffc900;\r\n");
      out.write("            width: 90px;\r\n");
      out.write("            height: 35px;\r\n");
      out.write("            background-color: #ffc900;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            line-height: 35px;\r\n");
      out.write("            margin-top: 55px;\r\n");
      out.write("        }\r\n");
      out.write("        .search-input {\r\n");
      out.write("            float: left;\r\n");
      out.write("            border: 2px solid #ffc900;\r\n");
      out.write("            width: 500px;\r\n");
      out.write("            height: 35px;\r\n");
      out.write("            padding-left: 5px;\r\n");
      out.write("            margin-top: 55px;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar {\r\n");
      out.write("            margin-top: 30px;\r\n");
      out.write("            background-color: lightgray;\r\n");
      out.write("        }\r\n");
      out.write("        .nav li{\r\n");
      out.write("            float: left;\r\n");
      out.write("            list-style: none;\r\n");
      out.write("            margin: 0 50px;\r\n");
      out.write("            width: 130px;\r\n");
      out.write("        }\r\n");
      out.write("        .nav a{\r\n");
      out.write("            float:left;\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("            color: black;\r\n");
      out.write("            width: 130px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        .more{\r\n");
      out.write("            float: right;\r\n");
      out.write("            padding-top: 25px;\r\n");
      out.write("        }\r\n");
      out.write("        .jx{\r\n");
      out.write("            border-bottom:5px solid #ffc900 ;\r\n");
      out.write("            padding: 15px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--页眉-->\r\n");
      out.write("<header class=\"container-fluid\">\r\n");
      out.write("    <div>\r\n");
      out.write("        <div class=\"paddtop\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <a class=\"login\" href=\"main.jsp\">个人中心</a>\r\n");
      out.write("                <a class=\"login\" href=\"../register.jsp\">注册</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row paddtop\"></div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-3\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/4.jpg\" class=\"img-responsive\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6\" >\r\n");
      out.write("                <input class=\"search-input\" placeholder=\"请输入商品名称\">\r\n");
      out.write("                <a class=\"search-btn\" href=\"#\">搜索</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--导航栏-->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <nav class=\"navbar\" >\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li><a href=\"browse.jsp\">首 页</a></li>\r\n");
      out.write("                        <li><a href=\"kande.jsp\">看 的</a></li>\r\n");
      out.write("                        <li><a href=\"chuande.jsp\">穿 的</a></li>\r\n");
      out.write("                        <li><a href=\"caide.jsp\">踩 的</a></li>\r\n");
      out.write("                        <li><a href=\"yongde.jsp\">用 的</a></li>\r\n");
      out.write("                        <li><a href=\"other.jsp\">其 他</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--轮播图-->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                <!-- Indicators -->\r\n");
      out.write("                <ol class=\"carousel-indicators\">\r\n");
      out.write("                    <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                    <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\r\n");
      out.write("                    <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\r\n");
      out.write("                </ol>\r\n");
      out.write("\r\n");
      out.write("                <!-- Wrapper for slides -->\r\n");
      out.write("                <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("                    <div class=\"item active\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/5.jpg\" alt=\"...\">\r\n");
      out.write("                        <div class=\"carousel-caption\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/9.jpg\" alt=\"...\">\r\n");
      out.write("                        <div class=\"carousel-caption\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/10.jpg\" alt=\"...\">\r\n");
      out.write("                        <div class=\"carousel-caption\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Controls -->\r\n");
      out.write("                <a class=\"left carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("                    <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a class=\"right carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("                    <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("                    <span class=\"sr-only\">Next</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>\r\n");
      out.write("<!--主体-->\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"row jx\">\r\n");
      out.write("        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/12.jpg\">\r\n");
      out.write("        <span>精选商品</span>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row paddtop\">\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/13.JPG\" alt=\"\"></a>\r\n");
      out.write("                <p>全新Evisu EVISUKURO 女士T恤</p>\r\n");
      out.write("                <span style=\"color: red; \">¥500</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/14.JPG\" alt=\"\"></a>\r\n");
      out.write("                <p>NIKE ZOOM 2K 黑色 九成新</p>\r\n");
      out.write("                <span style=\"color: red; \">¥500</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/15.JPG\" alt=\"\"></a>\r\n");
      out.write("                <p>《软件工程》教材 全新</p>\r\n");
      out.write("                <span style=\"color: red; \">¥20</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/16.JPG\" alt=\"\"></a>\r\n");
      out.write("                <p>CHANEL丝绒系列哑光58 仅试色</p>\r\n");
      out.write("                <span style=\"color: red; \">¥200</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row jx\">\r\n");
      out.write("        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/21.jpg\">\r\n");
      out.write("        <span>看的</span>\r\n");
      out.write("        <a class=\"more\">>>发现更多</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row paddtop\">\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/17.jpg\" alt=\"\"></a>\r\n");
      out.write("                <p>牛津高阶词典</p>\r\n");
      out.write("                <span style=\"color: red; \">¥50</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/18.jpg\" alt=\"\"></a>\r\n");
      out.write("                <p>高等数学 第七册 下</p>\r\n");
      out.write("                <span style=\"color: red; \">¥10</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/19.jpg\" alt=\"\"></a>\r\n");
      out.write("                <p>三体全套 九成新</p>\r\n");
      out.write("                <span style=\"color: red; \">¥50</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/20.jpg\" alt=\"\"></a>\r\n");
      out.write("                <p>人间失格 太宰治</p>\r\n");
      out.write("                <span style=\"color: red; \">¥10</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row jx\">\r\n");
      out.write("        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/26.jpg\">\r\n");
      out.write("        <span>穿的</span>\r\n");
      out.write("        <a class=\"more\">>>发现更多</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row paddtop\">\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/22.jpg\" alt=\"\"></a>\r\n");
      out.write("                <p>麻将女孩松紧长裤 全新</p>\r\n");
      out.write("                <span style=\"color: red; \">¥200</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/24.jpg\" alt=\"\"></a>\r\n");
      out.write("                <p>ACE绿色破洞牛仔裤 穿过几次</p>\r\n");
      out.write("                <span style=\"color: red; \">¥30</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/23.jpg\" alt=\"\"></a>\r\n");
      out.write("                <p>DesignerPlus假两件灯芯绒衬衫 仅试穿</p>\r\n");
      out.write("                <span style=\"color: red; \">¥50</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/25.jpg\" alt=\"\"></a>\r\n");
      out.write("                <p>Athief短袖T恤</p>\r\n");
      out.write("                <span style=\"color: red; \">¥50</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row jx\">\r\n");
      out.write("        <img src=\"img/27.jpg\">\r\n");
      out.write("        <span>踩的</span>\r\n");
      out.write("        <a class=\"more\">>>发现更多</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row paddtop\">\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/28.jpg\" alt=\"\"></a>\r\n");
      out.write("                <p>NewBalance NB608 36码</p>\r\n");
      out.write("                <span style=\"color: red; \">¥250</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/29.jpg\" alt=\"\"></a>\r\n");
      out.write("                <p>夏季单鞋高跟鞋中粗跟 35码</p>\r\n");
      out.write("                <span style=\"color: red; \">¥40</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/30.jpg\" alt=\"\"></a>\r\n");
      out.write("                <p>马丁靴 38码</p>\r\n");
      out.write("                <span style=\"color: red; \">¥100</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/31.jpg\" alt=\"\"></a>\r\n");
      out.write("                <p>PUMAStormRaySneakers 37码</p>\r\n");
      out.write("                <span style=\"color: red; \">¥50</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row jx\">\r\n");
      out.write("        <img src=\"img/32.jpg\">\r\n");
      out.write("        <span>用的</span>\r\n");
      out.write("        <a class=\"more\">>>发现更多</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row paddtop\">\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/33.jpg\" alt=\"\"></a>\r\n");
      out.write("                <p>祖马龙青柠罗勒与柑橘 30ML 仅试香</p>\r\n");
      out.write("                <span style=\"color: red; \">¥250</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/34.jpg\" alt=\"\"></a>\r\n");
      out.write("                <p>AHC男士洗面奶</p>\r\n");
      out.write("                <span style=\"color: red; \">¥20</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/35.jpg\" alt=\"\"></a>\r\n");
      out.write("                <p>PF粉底液 LW2/暖白 余量2/3</p>\r\n");
      out.write("                <span style=\"color: red; \">¥45</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/36.jpg\" alt=\"\"></a>\r\n");
      out.write("                <p>植物医生白茶洁面乳 未拆封</p>\r\n");
      out.write("                <span style=\"color: red; \">¥30</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row jx\">\r\n");
      out.write("        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/37.jpg\">\r\n");
      out.write("        <span>其他</span>\r\n");
      out.write("        <a class=\"more\">>>发现更多</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row paddtop\">\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/38.jpg\" alt=\"\"></a>\r\n");
      out.write("                <p>百花蜂蜜 全新未拆 25</p>\r\n");
      out.write("                <span style=\"color: red \">¥25</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/39.jpg\" alt=\"\"></a>\r\n");
      out.write("                <p>床上电脑桌</p>\r\n");
      out.write("                <span style=\"color: red \">¥15</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/40.jpg\" alt=\"\"></a>\r\n");
      out.write("                <p>青蛙针织毛线帽</p>\r\n");
      out.write("                <span style=\"color: red\">¥5</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <a href=\"detail.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/41.jpg\" alt=\"\"></a>\r\n");
      out.write("                <p>韩国三养火鸡面 4包</p>\r\n");
      out.write("                <span style=\"color: red\">¥20</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!--页脚-->\r\n");
      out.write("\r\n");
      out.write("<br><br><br><br><br><br><br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
