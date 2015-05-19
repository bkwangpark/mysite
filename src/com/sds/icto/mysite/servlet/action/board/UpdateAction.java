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

public class UpdateAction implements action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		
		
		String title = request.getParameter("title");
		String context = request.getParameter("content");
		Long no = Long.parseLong(request.getParameter("no"));
		Long mem_no = Long.parseLong(request.getParameter("member_no"));
		
		BoardVo vo = new BoardVo();
		vo.setTitle(title);
		vo.setContext(context);
		vo.setNo(no);
		vo.setMem_no(mem_no);
		
		BoardDao dao = new BoardDao();
		dao.update(vo);
		
		response.sendRedirect("/mysite/board?a=view&no="+no);

	}

}
