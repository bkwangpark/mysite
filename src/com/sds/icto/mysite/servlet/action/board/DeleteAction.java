package com.sds.icto.mysite.servlet.action.board;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.mysite.dao.BoardDao;
import com.sds.icto.mysite.vo.BoardVo;
import com.sds.icto.web.action;

public class DeleteAction implements action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		Long no = Long.parseLong(request.getParameter("no"));
		Long mem_no = Long.parseLong(request.getParameter("mem_no"));
		
		BoardVo vo = new BoardVo();
		vo.setNo(no);
		vo.setMem_no(mem_no);
		
		BoardDao dao = new BoardDao();
		dao.delete(vo);
		response.sendRedirect("/mysite/board");
	}

}
