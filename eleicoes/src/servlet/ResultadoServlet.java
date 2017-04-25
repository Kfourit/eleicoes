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

/**
 * Servlet implementation class ResultadoServlet
 */
@WebServlet("/ResultadoServlet")
public class ResultadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		CandidatoDao candidatoDao = new CandidatoDao();
		List<Candidato> presidentes = candidatoDao.retrievePresidentes();
		List<Candidato> governadores = candidatoDao.retrieveGovernadores();
		List<Candidato> prefeitos = candidatoDao.retrievePrefeitos();
		List<Candidato> senadores = candidatoDao.retrieveSenadores();
		List<Candidato> vereadores = candidatoDao.retrieveVereadores();
		List<Candidato> deputadosEstaduais = candidatoDao.retrieveDeputadosEstaduais();
		List<Candidato> deputadosFederais = candidatoDao.retrieveDeputadosFederais();
		
		request.setAttribute("presidentes", presidentes);
		request.setAttribute("governadores", governadores);
		request.setAttribute("prefeitos", prefeitos);
		request.setAttribute("senadores", senadores);
		request.setAttribute("vereadores", vereadores);
		request.setAttribute("deputadosEstaduais", deputadosEstaduais);
		request.setAttribute("deputadosFederais", deputadosFederais);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/Resultado.jsp");
		dispatcher.forward(request, response);
	}

}
