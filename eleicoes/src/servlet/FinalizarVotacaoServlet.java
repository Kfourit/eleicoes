package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CandidatoDao;
import entity.Candidato;

@WebServlet("/FinalizarVotacaoServlet")
public class FinalizarVotacaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		CandidatoDao candidatoDao = new CandidatoDao();
		Integer id = null;
		
		if(request.getParameter("presidente") != null){
			id = Integer.valueOf(request.getParameter("presidente"));
			Candidato candidato = candidatoDao.retrieve(id);
			Integer numeroDeVotos = candidato.getNumeroDeVotos();
			numeroDeVotos++;
			candidato.setNumeroDeVotos(numeroDeVotos);
			candidatoDao.saveOrUpdate(candidato);
		}
		
		if(request.getParameter("governador") != null){
			id = Integer.valueOf(request.getParameter("governador"));
			Candidato candidato = candidatoDao.retrieve(id);
			Integer numeroDeVotos = candidato.getNumeroDeVotos();
			numeroDeVotos++;
			candidato.setNumeroDeVotos(numeroDeVotos);
			candidatoDao.saveOrUpdate(candidato);
		}
		
		if(request.getParameter("prefeito") != null){
			id = Integer.valueOf(request.getParameter("prefeito"));
			Candidato candidato = candidatoDao.retrieve(id);
			Integer numeroDeVotos = candidato.getNumeroDeVotos();
			numeroDeVotos++;
			candidato.setNumeroDeVotos(numeroDeVotos);
			candidatoDao.saveOrUpdate(candidato);
		}
		
		if(request.getParameter("senador") != null){
			id = Integer.valueOf(request.getParameter("senador"));
			Candidato candidato = candidatoDao.retrieve(id);
			Integer numeroDeVotos = candidato.getNumeroDeVotos();
			numeroDeVotos++;
			candidato.setNumeroDeVotos(numeroDeVotos);
			candidatoDao.saveOrUpdate(candidato);
		}
		
		if(request.getParameter("vereador") != null){
			id = Integer.valueOf(request.getParameter("vereador"));
			Candidato candidato = candidatoDao.retrieve(id);
			Integer numeroDeVotos = candidato.getNumeroDeVotos();
			numeroDeVotos++;
			candidato.setNumeroDeVotos(numeroDeVotos);
			candidatoDao.saveOrUpdate(candidato);
		}
		
		if(request.getParameter("deputadoEstadual") != null){
			id = Integer.valueOf(request.getParameter("deputadoEstadual"));
			Candidato candidato = candidatoDao.retrieve(id);
			Integer numeroDeVotos = candidato.getNumeroDeVotos();
			numeroDeVotos++;
			candidato.setNumeroDeVotos(numeroDeVotos);
			candidatoDao.saveOrUpdate(candidato);
		}
		
		if(request.getParameter("deputadoFederal") != null){
			id = Integer.valueOf(request.getParameter("deputadoFederal"));
			Candidato candidato = candidatoDao.retrieve(id);
			Integer numeroDeVotos = candidato.getNumeroDeVotos();
			numeroDeVotos++;
			candidato.setNumeroDeVotos(numeroDeVotos);
			candidatoDao.saveOrUpdate(candidato);
		}
		
		// redirecionando pra pagina de sucesso
		response.sendRedirect(request.getContextPath() + "/excecoes/success.jsp");
	}
}
