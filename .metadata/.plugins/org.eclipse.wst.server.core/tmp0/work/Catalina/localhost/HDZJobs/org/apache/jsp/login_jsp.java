/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-07-27 18:02:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>Login</title>\n");
      out.write("<!-- Latest compiled and minified CSS -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- jQuery library -->\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("<script src=\"javascripts/home.js\"></script>\n");
      out.write("<!-- Latest compiled JavaScript -->\n");
      out.write("<script\n");
      out.write("\tsrc=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"http://mymaplist.com/js/vendor/TweenLite.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" />\n");
      out.write("<title>Login</title>\n");
      out.write("<script>\n");
      out.write("\tfunction validateLogin() {\n");
      out.write("\t\tvar email = $('#email').val();\n");
      out.write("\t\t// http://stackoverflow.com/a/46181/11236\n");
      out.write("\n");
      out.write("\t\t// check the email\n");
      out.write("\t\tvar re = /^(([^<>()[\\]\\\\.,;:\\s@\\\"]+(\\.[^<>()[\\]\\\\.,;:\\s@\\\"]+)*)|(\\\".+\\\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$/;\n");
      out.write("\t\tvar goodemail = re.test(email);\n");
      out.write("\t\tif (goodemail == false)\n");
      out.write("\t\t\talert(\"Invalid Email! \" + email);\n");
      out.write("\n");
      out.write("\t\t// check the password and restrict the length to 4 - 15 characters\n");
      out.write("\t\t// the passsword must be lower case, upper case or a number\n");
      out.write("\t\tvar password = $('#password').val();\n");
      out.write("\t\tvar pword = new RegExp(/^[a-zA-Z0-9]{4,15}$/)\n");
      out.write("\t\tgoodpassword = pword.test(password)\n");
      out.write("\t\tif (!goodpassword) {\n");
      out.write("\t\t\talert(\"Invalid Password! \" + password);\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\treturn (goodpassword && goodemail);\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class =\"loginBody\">\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('	');
      out.write('	');
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div class=\"row vertical-offset-100\">\n");
      out.write("\t\t\t<div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\" style=\"background-color: white;\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row-fluid user-row\" style=\"background-color: white;\"\n");
      out.write("\t\t\t\t\t\t\talign=\"center\">\n");
      out.write("\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t<h3>HDZ Jobs Portal</h3>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t<div role=\"form\" class=\"form-signin\">\n");
      out.write("\t\t\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"panel-login\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"login_result\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t\t<form class=\"form-signin\" onsubmit=\"return validateLogin()\"\n");
      out.write("\t\t\t\t\t\t\t\t\taction=\"Login\" method=\"get\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"inputEmail\" class=\"sr-only\">Email address</label> <input\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"text\" id=\"email\" name=\"email\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"Email address\" required autofocus> <label\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfor=\"inputPassword\" class=\"sr-only\">Password</label> <input\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"password\" id=\"password\" name=\"password\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" placeholder=\"password\" required>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<br/>\n");
      out.write("\t\t\t\t\t\t\t\t\t<select id=\"loginrole\" name=\"loginrole\" style=\"width: 320px;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"applicant\">Applicant</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"employee\">Employee</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t</select> <br/><br/>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-lg btn-success btn-block\" type=\"submit\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"login\" value=\"Login »\">\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"login-help\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"./newapplicant.jsp\">Create New Applicant Account</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- <div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-sm-3\"></div>\n");
      out.write("\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t<form class=\"form-signin\" onsubmit=\"return validateLogin()\"\n");
      out.write("\t\t\t\t\taction=\"Login\" method=\"get\">\n");
      out.write("\t\t\t\t\t<h3 class=\"form-signin-heading\">Please sign in</h3>\n");
      out.write("\t\t\t\t\t<label for=\"inputEmail\" class=\"sr-only\">Email address</label> <input\n");
      out.write("\t\t\t\t\t\ttype=\"text\" id=\"email\" name=\"email\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Email address\" required autofocus> <label\n");
      out.write("\t\t\t\t\t\tfor=\"inputPassword\" class=\"sr-only\">Password</label> <input\n");
      out.write("\t\t\t\t\t\ttype=\"password\" id=\"password\" name=\"password\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\tplaceholder=\"password\" required>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<h4>Select from below</h4>\n");
      out.write("\t\t\t\t\t<select id=\"loginrole\" name=\"loginrole\">\n");
      out.write("\t\t\t\t\t\t<option value=\"applicant\">Applicant</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"employee\">Employee</option>\n");
      out.write("\t\t\t\t\t</select> <br />\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Sign\n");
      out.write("\t\t\t\t\t\tin</button>\n");
      out.write("\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t<br />\n");
      out.write("\t\t\t\t<h2>\n");
      out.write("\t\t\t\t\t<a href=\"./newapplicant.jsp\">Create New Applicant Account</a>\n");
      out.write("\t\t\t\t</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-sm-3\"></div>\n");
      out.write("\t\t</div> -->\n");
      out.write("\t</div>\n");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /login.jsp(51,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("mesL");
    // /login.jsp(51,2) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setScope("session");
    // /login.jsp(51,2) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /login.jsp(52,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mesL != null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t<div class=\"alert alert-success\">\n");
        out.write("\t\t\t\t<strong>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</strong> <span id=\"showSearchTerm\"></span>\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
