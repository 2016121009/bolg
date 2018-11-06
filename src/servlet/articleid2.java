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

@WebServlet("/articleid2")
public class articleid2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public articleid2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		articledao articledao = new articledao();
		List<article> list = articledao.findid2();
		request.setAttribute("list2", list);
	}


}
