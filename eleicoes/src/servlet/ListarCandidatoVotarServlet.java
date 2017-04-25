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

@WebServlet("/ListarCandidatoVotarServlet")
public class ListarCandidatoVotarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		CandidatoDao candidatoDao = new CandidatoDao();
		
		List<Candidato> presidentes = candidatoDao.retrievePresidentes();
		request.setAttribute("presidentes", presidentes);
		
		List<Candidato> governadores = candidatoDao.retrieveGovernadores();
		request.setAttribute("governadores", governadores);
		
		List<Candidato> prefeitos = candidatoDao.retrievePrefeitos();
		request.setAttribute("prefeitos", prefeitos);
		
		List<Candidato> senadores = candidatoDao.retrieveSenadores();
		request.setAttribute("senadores", senadores);
		
		List<Candidato> vereadores = candidatoDao.retrieveVereadores();
		request.setAttribute("vereadores", vereadores);
		
		List<Candidato> deputadosEstaduais = candidatoDao.retrieveDeputadosEstaduais();
		request.setAttribute("deputadosEstaduais", deputadosEstaduais);
		
		List<Candidato> deputadosFederais = candidatoDao.retrieveDeputadosFederais();
		request.setAttribute("deputadosFederais", deputadosFederais);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/VotarII.jsp");
		dispatcher.forward(request, response);
	}
}
