package ch03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL mappings
//@WebServlet("/ch03/exampleServlet02")
public class ExampleServlet02 extends HttpServlet {
	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter out = response.getWriter();
		System.out.println("��Ĺ �ܼ� â ���");
		//html ����
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>URL amppings�� web.xml ����</h1>");
		out.println("</body>");
		out.println("</html>");
		//html ��
	}

}