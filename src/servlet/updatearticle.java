package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import dao.articledao;

@WebServlet("/updatearticle")
public class updatearticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public updatearticle() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		articledao articledao = new articledao();
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String date = request.getParameter("date");
		
		int userid=Integer.parseInt(request.getParameter("userid"));
		int atid=Integer.parseInt(request.getParameter("atid")); 
		
		try {
			articledao.updatea(title, content, date, userid, atid);
			request.getRequestDispatcher("/blog.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
