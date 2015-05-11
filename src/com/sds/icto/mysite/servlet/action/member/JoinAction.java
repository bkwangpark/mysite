package com.sds.icto.mysite.servlet.action.member;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.mysite.dao.MemberDao;
import com.sds.icto.mysite.vo.MemberVo;
import com.sds.icto.web.WebUtil;
import com.sds.icto.web.action;

public class JoinAction implements action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		// TODO Auto-generated method stub
		//사용자 정보뽑기
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		
		MemberVo vo = new MemberVo();
		vo.setName(name);
		vo.setEmail(email);
		vo.setPassword(password);
		vo.setGender(gender);
		
		MemberDao dao = new MemberDao();
		dao.insert(vo);
		response.sendRedirect("/mysite/member?a=joinsuccess");
	}

}
