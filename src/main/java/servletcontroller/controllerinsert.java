package servletcontroller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servletDao.servletDao;
import servletDto.servletDto;

@WebServlet("/insert")
public class controllerinsert extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String sid = req.getParameter("sid");
		String sname = req.getParameter("sname");
		String gender = req.getParameter("gender");
		String sphno = req.getParameter("sphno");

		int sid1 = Integer.parseInt(sid);
		long sphno1=Long.parseLong(sphno);

		servletDto dto = new servletDto();
		dto.setStd_id(sid1);
		dto.setStd_name(sname);
		dto.setGender(gender);
		dto.setStd_phno(sphno1);

		servletDao dao = new servletDao();
		dao.create(dto);

	}
}