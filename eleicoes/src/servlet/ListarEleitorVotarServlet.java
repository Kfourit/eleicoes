package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EleitorDao;
import entity.Eleitor;

@WebServlet("/ListarEleitorVotarServlet")
public class ListarEleitorVotarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		EleitorDao eleitorDao = new EleitorDao();
		List<Eleitor> eleitores = eleitorDao.retrieveAll();
		
		request.setAttribute("eleitores", eleitores);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/Votar.jsp");
		dispatcher.forward(request, response);
	}

}
