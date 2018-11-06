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

@WebServlet("/deletarticle")
public class deletarticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public deletarticle() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
		
		articledao articledao = new articledao();

		int id = Integer.valueOf(request.getParameter("typeid"));
		if(articledao.delarticle(id)){
			List<article> list = articledao.findInfoAll();
			request.setAttribute("userList", list);
			request.getRequestDispatcher("/blog.jsp").forward(request, response);
		}
		
	
	}

}
