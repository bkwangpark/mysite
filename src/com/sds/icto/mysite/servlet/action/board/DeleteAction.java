package com.sds.icto.mysite.servlet.action.board;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.mysite.dao.GuestBookDao;
import com.sds.icto.mysite.dao.MemberDao;
import com.sds.icto.mysite.vo.GuestBookVo;
import com.sds.icto.mysite.vo.MemberVo;
import com.sds.icto.web.WebUtil;
import com.sds.icto.web.action;

public class DeleteAction implements action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		Long no = Long.parseLong(request.getParameter("no"));
		String password = request.getParameter("password");
		
		GuestBookVo vo = new GuestBookVo();
		vo.setNo(no);
		vo.setPassword(password);
		
		GuestBookDao dao = new GuestBookDao();
		dao.delete(vo);
		response.sendRedirect("/mysite/guestbook");
	}

}
