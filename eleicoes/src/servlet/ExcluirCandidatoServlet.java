package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CandidatoDao;

@WebServlet("/ExcluirCandidatoServlet")
public class ExcluirCandidatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.valueOf(request.getParameter("id"));
		
		CandidatoDao candidatoDao = new CandidatoDao();
		candidatoDao.delete(id);
		
		// redirecionando pra pagina de sucesso
		response.sendRedirect(request.getContextPath() + "/excecoes/success.jsp");
	}
}
