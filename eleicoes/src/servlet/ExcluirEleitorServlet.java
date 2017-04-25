package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EleitorDao;

@WebServlet("/ExcluirEleitorServlet")
public class ExcluirEleitorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.valueOf(request.getParameter("id"));
		
		EleitorDao eleitorDao = new EleitorDao();
		eleitorDao.delete(id);
		
		// redirecionando pra pagina de sucesso
		response.sendRedirect(request.getContextPath() + "/excecoes/success.jsp");
	}

}
