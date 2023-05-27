package servletcontroller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servletDao.servletDao;
import servletDto.servletDto;

@WebServlet("/fetchall")
public class controllerFetchALL extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// super.doGet(req, resp);

		servletDao dao = new servletDao();
		List<servletDto> a1 = dao.fetchAll();

		req.setAttribute("studentlist", a1);

		RequestDispatcher rd = req.getRequestDispatcher("download.jsp");
		rd.forward(req, resp);
	}

}
