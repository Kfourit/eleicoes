package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CandidatoDao;
import entity.Candidato;

@WebServlet("/ListarCandidatoAlterarServlet")
public class ListarCandidatoAlterarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		CandidatoDao candidatoDao = new CandidatoDao();
		List<Candidato> candidatos = candidatoDao.retrieveAll();
		
		request.setAttribute("candidatos", candidatos);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/ListarCandidatosAlterar.jsp");
		dispatcher.forward(request, response);
	}
}
