package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.userdao;


@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public register() {
        super();
    }
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html;charset=utf-8");
		userdao userDao = new userdao();
		String name = request.getParameter("userName");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String qq = request.getParameter("qq");
		String info = request.getParameter("info");
		if (userDao.regeistUser(name, pwd, email,phone,qq,info)) {

			request.getRequestDispatcher("/blog.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/register.jsp").forward(request, response);
		}
	
	}

}
