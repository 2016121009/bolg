package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.userdao;
import entity.user;


@WebServlet("/userlist")
public class userlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public userlist() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		userdao userDao = new userdao();
		List<user> list = userDao.findInfoAll();
		request.setAttribute("userList", list);
		request.getRequestDispatcher("/users.jsp").forward(request, response);
	}

}
