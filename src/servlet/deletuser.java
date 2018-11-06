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

@WebServlet("/deletuser")
public class deletuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public deletuser() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html;charset=utf-8");
		
		userdao userDao = new userdao();

		int id = Integer.valueOf(request.getParameter("id"));
		if(userDao.deletUser(id)){
			List<user> list = userDao.findInfoAll();
			request.setAttribute("userList", list);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
		
	}
}
