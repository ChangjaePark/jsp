package ch03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ch08.RegisterMgr;


@WebServlet("/ch03/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=EUC-KR");
		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		/*PrintWriter out = response.getWriter();
		 out.println("id : " + id + "<br/>");
		out.println("pwd : " + pwd + "<br/>");*/
		RegisterMgr mgr = new RegisterMgr();
		boolean result = mgr.loginRegister(id, pwd);
		HttpSession session = request.getSession();
		if(result) 
		{//로그인성공
			session.setAttribute("idKey", id);
			
		}
		else 
		{
			session.setAttribute("msg", "id와 pwd를 다시 입력하시오");
		}
		response.sendRedirect("login.jsp");
		
	
	}

}
