/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.19
 * Generated at: 2025-05-06 21:11:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class sign_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Sign up</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/main.css\">\r\n");
      out.write("<style>\r\n");
      out.write("/* 전체 폼 컨테이너 스타일 */\r\n");
      out.write(".signup-form {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    max-width: 400px;\r\n");
      out.write("    margin: 60px auto;\r\n");
      out.write("    padding: 40px;\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    font-family: 'Segoe UI', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 제목 */\r\n");
      out.write(".signup-form h2 {\r\n");
      out.write("    font-size: 26px;\r\n");
      out.write("    margin-bottom: 25px;\r\n");
      out.write("    color: #333;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 라벨용 p 태그 */\r\n");
      out.write(".signup-form p {\r\n");
      out.write("    margin: 10px 0 5px;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    color: #555;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 입력창 */\r\n");
      out.write(".signup-form input[type=\"text\"],\r\n");
      out.write(".signup-form input[type=\"password\"],\r\n");
      out.write(".signup-form input[type=\"email\"]{\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    margin-top: 3px;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    border-radius: 6px;\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    transition: border 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".signup-form input:focus {\r\n");
      out.write("    border-color: #3498db;\r\n");
      out.write("    outline: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 메시지 출력용 span */\r\n");
      out.write(".signup-form span {\r\n");
      out.write("    display: block;\r\n");
      out.write("    margin-top: 5px;\r\n");
      out.write("    font-size: 12px;\r\n");
      out.write("    color: #888;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 메시지 강조 색 (비밀번호 불일치 등) */\r\n");
      out.write("#pwMessage, #nameMessage, #idMsg {\r\n");
      out.write("    font-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 버튼 스타일 */\r\n");
      out.write(".signup-form button {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    padding: 12px;\r\n");
      out.write("    margin-top: 25px;\r\n");
      out.write("    background-color: #3498db;\r\n");
      out.write("    color: white;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 6px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    transition: background-color 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".signup-form button:hover {\r\n");
      out.write("    background-color: #2980b9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("$(function() {\r\n");
      out.write("    const idPattern = /^[a-z0-9!@#$%^&*]{6,14}$/;\r\n");
      out.write("\r\n");
      out.write("    // 아이디 검사\r\n");
      out.write("    $('#inputId').on('keyup', function() {\r\n");
      out.write("        const id = $(this).val().trim();\r\n");
      out.write("        if (!idPattern.test(id)) {\r\n");
      out.write("            $('#idMsg').css('color', 'red').text(\"유효하지 않은 아이디입니다.\");\r\n");
      out.write("        } else {\r\n");
      out.write("            $('#idMsg').css('color', 'green').text(\"사용 가능한 아이디입니다.\");\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // 비밀번호 일치 검사\r\n");
      out.write("    $('#inputPw2').on('keyup', function() {\r\n");
      out.write("        const pw = $('#inputPw').val();\r\n");
      out.write("        const pw2 = $(this).val();\r\n");
      out.write("        if (pw !== pw2) {\r\n");
      out.write("            $('#pwMessage').css('color', 'red').text(\"비밀번호가 일치하지 않습니다.\");\r\n");
      out.write("        } else {\r\n");
      out.write("            $('#pwMessage').css('color', 'green').text(\"비밀번호 일치!\");\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // 이메일 패턴 확인\r\n");
      out.write("    const emailPattern = /^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$/;\r\n");
      out.write("    $('#inputEmail').on('keyup', function() {\r\n");
      out.write("    	const email = $(this).val().trim();\r\n");
      out.write("        if (!emailPattern.test(email)) {\r\n");
      out.write("            $('#emailMessage').css('color', 'red').text(\"이메일 형식이 올바르지 않습니다.\");\r\n");
      out.write("        } else {\r\n");
      out.write("            $('#emailMessage').css('color', 'green').text(\"올바른 이메일입니다.\");\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // 최종 제출 시 한 번 더 확인\r\n");
      out.write("    $('.signup-form').on('submit', function(e) {\r\n");
      out.write("        if (\r\n");
      out.write("            !idPattern.test($('#inputId').val().trim()) ||\r\n");
      out.write("            $('#inputPw').val() !== $('#inputPw2').val() ||\r\n");
      out.write("            !emailPattern.test($('#inputEmail').val().trim())\r\n");
      out.write("        ) {\r\n");
      out.write("            alert(\"입력값을 다시 확인해주세요.\");\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/header.jsp", out, false);
      out.write("\r\n");
      out.write("	<main>\r\n");
      out.write("		<form action= \"/myReceipt2/signup\" method=\"post\" class=\"signup-form\">\r\n");
      out.write("			<h2>회원 가입</h2>\r\n");
      out.write("			<p>아이디</p>\r\n");
      out.write("			<input type=\"text\" name=\"inputId\" id=\"inputId\" autocomplete=\"off\" required> \r\n");
      out.write("			<span id=\"idMsg\">영어 소문자, 숫자, 특수문자 포함 6~14글자</span>\r\n");
      out.write("				\r\n");
      out.write("			<p>비밀번호</p>\r\n");
      out.write("			<input type=\"password\" name=\"inputPw\" id=\"inputPw\" required>\r\n");
      out.write("			\r\n");
      out.write("			<p>비밀번호 확인</p>\r\n");
      out.write("			<input type=\"password\" name=\"inputPw2\" id=\"inputPw2\" required>\r\n");
      out.write("			<span id=\"pwMessage\"></span>\r\n");
      out.write("			\r\n");
      out.write("			<p>이메일</p>\r\n");
      out.write("			<input type=\"email\" name=\"inputEmail\" id=\"inputEmail\" required>\r\n");
      out.write("			<span id=\"emailMessage\"></span>\r\n");
      out.write("			<br>\r\n");
      out.write("			\r\n");
      out.write("			<button>가입하기</button>\r\n");
      out.write("			\r\n");
      out.write("		</form>\r\n");
      out.write("	</main>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
