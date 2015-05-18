package com.sds.icto.mysite.servlet.action.board;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sds.icto.mysite.dao.BoardDao;
import com.sds.icto.mysite.vo.BoardVo;
import com.sds.icto.mysite.vo.MemberVo;
import com.sds.icto.web.action;

public class InsertAction implements action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		// TODO Auto-generated method stub
		String title = request.getParameter("title");
		String context = request.getParameter("content");
		
		HttpSession session = request.getSession();
		MemberVo vo1 = (MemberVo)session.getAttribute("authMember");
		
		Long no= vo1.getNo();
		String name= vo1.getName();
	
		
		BoardVo vo = new BoardVo();
		vo.setTitle(title);
		vo.setContext(context);
		vo.setMem_no(no);
		vo.setMem_name(name);
		
		
		BoardDao dao = new BoardDao();
		dao.insert(vo);
		
		response.sendRedirect("/mysite/board");
	}
}
