package servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EleitorDao;
import entity.Eleitor;

@WebServlet("/salvarEleitor")
public class SalvarEleitorServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
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
				try{
					data = new SimpleDateFormat("yyyy-MM-dd").parse(dataString);
				} catch(ParseException e3){
					e3.printStackTrace();
				}
			}
		}
		// coletando o resto
		String nome = request.getParameter("nome");
		Integer cpf = Integer.valueOf(request.getParameter("cpf"));
		Integer rg = Integer.valueOf(request.getParameter("rg"));
		String nomeMae = request.getParameter("nome da mae");
		String naturalidade = request.getParameter("naturalidade");
		Integer titulo = Integer.valueOf(request.getParameter("titulo"));
		String estadoCivil = request.getParameter("estado_civil");

		// criando o objeto e salvando no banco de dados
		Eleitor eleitor = new Eleitor();
		eleitor.setId(id);
		eleitor.setDataNascimento(data);
		eleitor.setNome(nome);
		eleitor.setCpfEleitor(cpf);
		eleitor.setRg_eleitor(rg);
		eleitor.setNomeMaeEleitor(nomeMae);
		eleitor.setNaturalidade(naturalidade);
		eleitor.setInscricao(titulo);
		eleitor.setEstadoCivil(estadoCivil);

		EleitorDao eleitorDao = new EleitorDao();
		eleitorDao.saveOrUpdate(eleitor);

		// redirecionando pra pagina de sucesso
		response.sendRedirect(request.getContextPath() + "/excecoes/success.jsp");
	}

}
