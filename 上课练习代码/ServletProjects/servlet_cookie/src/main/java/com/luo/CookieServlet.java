package com.luo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/cookieServlet")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //演示对象
        // (page,request,response,session.application,exception,getServletContext,ServletContext,ServletConfig)
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        for (int i=0;i<3;i++){
            Cookie cookie=new Cookie("cookiekey-"+i,"cookieValue-"+i);
            response.addCookie(cookie);
            cookie=new Cookie("PersistentCookieKey-"+i,"PersistentCookieVslue-"+i);
            cookie.setMaxAge(36000);
            response.addCookie(cookie);
        }
        out.append("<html>")
                .append("<head><title>CookieSercletDemo</title></head>")
                .append("<body>")
                .append("<a href='showServlet'>Go To Show Cookie</a>")
                .append("</body>")
                .append("</html>");
    }
}
