package servletcontroller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servletDao.servletDao;
import servletDto.servletDto;

@WebServlet("/fetch")
public class controllerfetch extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String sid = req.getParameter("sid");
		int sid1 = Integer.parseInt(sid);

		servletDao dao = new servletDao();
		String re = dao.fetch(sid1);
		res.getWriter().print(re);
	}

}
