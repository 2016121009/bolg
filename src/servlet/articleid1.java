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

@WebServlet("/articleid1")
public class articleid1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public articleid1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		articledao articledao = new articledao();
		List<article> list = articledao.findid1();
		request.setAttribute("list1", list);
	}

	

}
