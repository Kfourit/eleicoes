package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EleitorDao;
import entity.Eleitor;

@WebServlet("/CarregarEleitorServlet")
public class CarregarEleitorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Integer id = Integer.valueOf(request.getParameter("id"));

		EleitorDao eleitorDao = new EleitorDao();
		Eleitor eleitor = eleitorDao.retrieve(id);

		request.setAttribute("eleitor", eleitor);

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/jsp/AlterarEleitor.jsp");
		dispatcher.forward(request, response);
	}

}
