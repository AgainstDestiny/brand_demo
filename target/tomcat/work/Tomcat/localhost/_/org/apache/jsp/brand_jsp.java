/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-11-04 15:06:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import cn.itaxu.pojo.Brand;
import java.util.ArrayList;

public final class brand_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>品牌数据</title>\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/jquery/3.6.1/jquery.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        .mask{\r\n");
      out.write("            display: none;\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            top: 0;\r\n");
      out.write("            right: 0;\r\n");
      out.write("            bottom: 0;\r\n");
      out.write("            left: 0;\r\n");
      out.write("            background: rgba(0,0,0,.5);\r\n");
      out.write("        }\r\n");
      out.write("        .inner{\r\n");
      out.write("            width: 500px;\r\n");
      out.write("            height: 500px;\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            left: 50%;\r\n");
      out.write("            top: 50%;\r\n");
      out.write("            transform: translate(-50%,-50%);\r\n");
      out.write("            background-color: #ffffff;\r\n");
      out.write("            border-radius: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        #serialNum{\r\n");
      out.write("            margin-left: 32px;\r\n");
      out.write("        }\r\n");
      out.write("        #ordered{\r\n");
      out.write("            margin-left: 48px;\r\n");
      out.write("        }\r\n");
      out.write("        #description{\r\n");
      out.write("            margin-left: 80px;\r\n");
      out.write("        }\r\n");
      out.write("        .cd{\r\n");
      out.write("            margin: 30px 0 0 170px;\r\n");
      out.write("            width: 150px;\r\n");
      out.write("            height: 50px;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: space-between;\r\n");
      out.write("        }\r\n");
      out.write("        .info{\r\n");
      out.write("            margin-left: 90px;\r\n");
      out.write("        }\r\n");
      out.write("        button{\r\n");
      out.write("            width: 60px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            border: none;\r\n");
      out.write("            outline: none;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            background-color: rgba(0,0,0,.3);\r\n");
      out.write("        }\r\n");
      out.write("        input{\r\n");
      out.write("            outline: none;\r\n");
      out.write("        }\r\n");
      out.write("        button:hover{\r\n");
      out.write("            color: #fff;\r\n");
      out.write("        }\r\n");
      out.write("        h2{\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        .add{\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<input type=\"button\" value=\"新增\" class=\"add\"><br>\r\n");
      out.write("<div class=\"mask\">\r\n");
      out.write("    <div class=\"inner\">\r\n");
      out.write("        <h2>添加品牌</h2>\r\n");
      out.write("        <div class=\"info\">\r\n");
      out.write("            <form action=\"/AddServlet\" method=\"post\">\r\n");
      out.write("        <label for=\"serialNum\">序号：</label><input type=\"text\" id=\"serialNum\" name=\"id\"><br>\r\n");
      out.write("        <label for=\"brandName\">品牌名称：</label><input type=\"text\" id=\"brandName\" name=\"brandName\"><br>\r\n");
      out.write("        <label for=\"companyName\">企业名称：</label><input type=\"text\" id=\"companyName\" name=\"companyName\"><br>\r\n");
      out.write("        <label for=\"ordered\">排序</label><input type=\"text\" id=\"ordered\" name=\"ordered\"><br>\r\n");
      out.write("        <label for=\"description\">品牌介绍：<br></label><textarea name=\"description\" id=\"description\" cols=\"20\"\r\n");
      out.write("                                                            rows=\"5\"></textarea>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"cd\">\r\n");
      out.write("            <button type=\"submit\">确定</button>\r\n");
      out.write("            <button class=\"cancel\">取消</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<hr>\r\n");
      out.write("<table border=\"1px solid #000\" cellspacing=\"0\" cellpadding=\"5px\">\r\n");
      out.write("    <tr align=\"center\">\r\n");
      out.write("        <th>序号</th>\r\n");
      out.write("        <th>品牌名称</th>\r\n");
      out.write("        <th>企业名称</th>\r\n");
      out.write("        <th>排序</th>\r\n");
      out.write("        <th>品牌介绍</th>\r\n");
      out.write("        <th>状态</th>\r\n");
      out.write("        <th>操作</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("  ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $('.cd').on('click','button',function () {\r\n");
      out.write("            $('.mask').hide()\r\n");
      out.write("        });\r\n");
      out.write("        $('.add').on('click',function () {\r\n");
      out.write("            $('.mask').show()\r\n");
      out.write("        })\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /brand.jsp(110,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/brand.jsp(110,2) '${brands}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${brands}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /brand.jsp(110,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("brand");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    <tr align=\"center\">\r\n");
          out.write("        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.getBrandName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.getCompanyName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.getOrdered()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.getDescription()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.getStatusStr()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("        <td><a href=\"#\">修改</a> <a href=\"#\">删除</a></td>\r\n");
          out.write("    </tr>\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
