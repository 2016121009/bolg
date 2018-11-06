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

@WebServlet("/findname")
public class findname extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public findname() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		articledao articledao = new articledao();
		List<article> list = articledao.findtitle();
		request.setAttribute("articleList", list);
		request.getRequestDispatcher("/content.jsp").forward(request, response);
	}

}
