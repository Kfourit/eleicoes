package servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CandidatoDao;
import entity.Candidato;
import entity.DeputadoEstadual;
import entity.DeputadoFederal;
import entity.Governador;
import entity.Prefeito;
import entity.Presidente;
import entity.Senador;
import entity.Vereador;

/**
 * Servlet implementation class SalvarCandidatoServlet
 */
@WebServlet("/salvarCandidato")
public class SalvarCandidatoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// coletando id
		Integer id = null;
		if (request.getParameter("id") != null
				&& !request.getParameter("id").isEmpty()) {
			id = Integer.valueOf(request.getParameter("id"));
		}
		// coletando data de nascimento
		String dataString = request.getParameter("data");
		Date data = null;
		try {
			data = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
		} catch (ParseException e) {
			try {
				data = new SimpleDateFormat("dd-MM-yyyy").parse(dataString);
			} catch (ParseException e2) {
				try {
					data = new SimpleDateFormat("yyyy-MM-dd").parse(dataString);
				} catch (ParseException e3) {
					e3.printStackTrace();
				}
			}
		}
		// coletando o resto
		String nome = request.getParameter("nome");
		String partido = request.getParameter("partido");
		Integer numero = Integer.valueOf(request.getParameter("numero"));
		String escolaridade = request.getParameter("escolaridade");
		String coligacao = request.getParameter("coligacao");
		String naturalidade = request.getParameter("naturalidade");
		String estadoCivil = request.getParameter("estado_civil");
		String cargo = request.getParameter("cargo");

		// criando o objeto
		Candidato candidato = new Candidato();
		candidato.setId(id);
		candidato.setNome(nome);
		candidato.setDataNascimento(data);
		candidato.setPartido(partido);
		candidato.setNumero(numero);
		candidato.setEscolaridade(escolaridade);
		candidato.setColigacao(coligacao);
		candidato.setNaturalidade(naturalidade);
		candidato.setEstadoCivil(estadoCivil);
		candidato.setNumeroDeVotos(0);

		// criando cargo
		if (cargo.equals("Presidente")) {
			Presidente presidente = new Presidente();
			presidente.setSigla("PR");
			presidente.setVicePresidente(".");
			presidente.setCandidato(candidato);
			List<Presidente> presidentes = new ArrayList<Presidente>();
			presidentes.add(presidente);
			candidato.setPresidentes(presidentes);
		} else if (cargo.equals("Governador")) {
			Governador governador = new Governador();
			governador.setSigla("GV");
			governador.setUf("DF");
			governador.setViceGovernador(".");
			governador.setCandidato(candidato);
			List<Governador> governadores = new ArrayList<Governador>();
			governadores.add(governador);
			candidato.setGovernadores(governadores);
		} else if (cargo.equals("Prefeito")) {
			Prefeito prefeito = new Prefeito();
			prefeito.setCidade("Brasilia");
			prefeito.setSigla("PF");
			prefeito.setUfPrefeito("DF");
			prefeito.setVicePrefeito(".");
			prefeito.setCandidato(candidato);
			List<Prefeito> prefeitos = new ArrayList<Prefeito>();
			prefeitos.add(prefeito);
			candidato.setPrefeitos(prefeitos);
		} else if (cargo.equals("Senador")) {
			Senador senador = new Senador();
			senador.setSiglaSenador("SN");
			senador.setUfSenador("DF");
			senador.setCandidato(candidato);
			List<Senador> senadores = new ArrayList<>();
			senadores.add(senador);
			candidato.setSenadores(senadores);
		} else if (cargo.equals("Vereador")) {
			Vereador vereador = new Vereador();
			vereador.setCidadeVereador("Brasilia");
			vereador.setSiglaVereador("VR");
			vereador.setUfVereador("DF");
			vereador.setCandidato(candidato);
			List<Vereador> vereadores = new ArrayList<>();
			vereadores.add(vereador);
			candidato.setVereadores(vereadores);
		} else if (cargo.equals("Deputado Estadual")) {
			DeputadoEstadual deputadoEstadual = new DeputadoEstadual();
			deputadoEstadual.setSigla("DE");
			deputadoEstadual.setUf("DF");
			deputadoEstadual.setCandidato(candidato);
			List<DeputadoEstadual> deputadosEstaduais = new ArrayList<>();
			deputadosEstaduais.add(deputadoEstadual);
			candidato.setDeputadosEstaduais(deputadosEstaduais);
		} else if (cargo.equals("Deputado Federal")) {
			DeputadoFederal deputadoFederal = new DeputadoFederal();
			deputadoFederal.setSigla("DF");
			deputadoFederal.setUf("DF");
			deputadoFederal.setCandidato(candidato);
			List<DeputadoFederal> deputadosFederais = new ArrayList<>();
			deputadosFederais.add(deputadoFederal);
			candidato.setDeputadosFederais(deputadosFederais);
		}

		// salvando o objeto no banco de dados
		CandidatoDao candidatoDao = new CandidatoDao();
		candidatoDao.saveOrUpdate(candidato);

		// redirecionando pra pagina de sucesso
		response.sendRedirect(request.getContextPath()
				+ "/excecoes/success.jsp");
	}

}
