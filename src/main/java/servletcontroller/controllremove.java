package servletcontroller;

import java.io.IOException;
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

import org.apache.catalina.connector.Response;

import servletDao.servletDao;
import servletDto.servletDto;

@WebServlet("/remove")
public class controllremove extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		String sid = req.getParameter("id");
		int sid1 = Integer.parseInt(sid);

		servletDao dao = new servletDao();
		String std = dao.remove(sid1);
		List<servletDto> l1 = dao.fetchAll();

		resp.getWriter().print(std);
		req.setAttribute("studentlist", l1);
		RequestDispatcher rd = req.getRequestDispatcher("download.jsp");
		rd.include(req, resp);
	}
}
