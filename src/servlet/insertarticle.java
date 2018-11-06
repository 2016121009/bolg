package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.articledao;


@WebServlet("/insertarticle")
public class insertarticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public insertarticle() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html;charset=utf-8");
		articledao articledao = new articledao();
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String date = request.getParameter("date");
		
		int userid=Integer.parseInt(request.getParameter("userid"));
		int atid=Integer.parseInt(request.getParameter("atid")); 
		if (articledao.addarticle(title, content, date, userid, atid)) {

			request.getRequestDispatcher("/blog.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/content.jsp").forward(request, response);
		}
	
	}
	

}
