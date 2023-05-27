package servletcontroller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servletDao.servletDao;
import servletDto.servletDto;

@WebServlet("/update")
public class controllerupdate extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		RequestDispatcher rd = req.getRequestDispatcher("update.html");
//		rd.forward(req, resp);

		int sid = Integer.parseInt(req.getParameter("sid"));
		String sname = req.getParameter("sname");
		long phn = Long.parseLong(req.getParameter("number"));
		String gen = req.getParameter("gender");

		servletDto dto = new servletDto();
		dto.setStd_id(sid);
		dto.setStd_name(sname);
		dto.setStd_phno(phn);
		dto.setGender(gen);

		servletDao dao = new servletDao();
		dao.update(dto);
		List<servletDto> l1 = dao.fetchAll();

		req.setAttribute("studentlist", l1);
        
		//if we are printing without h1 tag we don't get perfect output
		//overcome thz we use setcontentType
		resp.setContentType("text/html");
		resp.getWriter().print("Data was updated");
		RequestDispatcher rd = req.getRequestDispatcher("download.jsp");
		rd.include(req, resp);

	}
}