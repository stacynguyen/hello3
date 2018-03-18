package com.alerta;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloWorldServlet2 extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException { 
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    out.println("<html><head><title>" +
                "Hello World!</title></head>");
    out.println("<body><h1>Hello World!</h1></body></html>");
  }

}