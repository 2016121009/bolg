package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.userdao;
import entity.user;


@WebServlet("/login.do")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		userdao userDao = new userdao();
		String name = request.getParameter("userName");
		String pwd = request.getParameter("pwd");
		user user = new user();
		user = userDao.checkUser(name, pwd);
		if(user!=null){
			HttpSession session = request.getSession();
			session.setAttribute("login",user);
			request.getRequestDispatcher("/blog.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("/logins.jsp").forward(request, response);
		}
	}
	

}
