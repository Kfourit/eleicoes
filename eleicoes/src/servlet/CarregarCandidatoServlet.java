package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CandidatoDao;
import entity.Candidato;

@WebServlet("/CarregarCandidatoServlet")
public class CarregarCandidatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.valueOf(request.getParameter("id"));
		
		CandidatoDao candidatoDao = new CandidatoDao();
		Candidato candidato = candidatoDao.retrieve(id);
		
		request.setAttribute("candidato", candidato);
		
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/jsp/AlterarCandidato.jsp");
		dispatcher.forward(request, response);
	}
}
