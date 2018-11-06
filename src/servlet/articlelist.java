package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.articledao;
import entity.article;

@WebServlet("/articlelist")
public class articlelist extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public articlelist() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		articledao articledao = new articledao();
		List<article> list = articledao.findInfoAll();
		request.setAttribute("articleList", list);
		request.getRequestDispatcher("/users.jsp").forward(request, response);
	
	}

	

}
