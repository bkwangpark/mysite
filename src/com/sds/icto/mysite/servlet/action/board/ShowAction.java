package com.sds.icto.mysite.servlet.action.board;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.mysite.dao.BoardDao;
import com.sds.icto.mysite.vo.BoardVo;
import com.sds.icto.web.WebUtil;
import com.sds.icto.web.action;

public class ShowAction implements action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		// TODO Auto-generated method stub
		Long no=Long.parseLong(request.getParameter("no"));
		
		BoardVo vo = new BoardVo();
		vo.setNo(no);
		
		BoardDao dao= new BoardDao();
		
		BoardVo vo1 = new BoardVo();
		vo1=dao.show(vo);
		
		request.setAttribute("vo", vo1);
		
		WebUtil.forward("/views/board/view.jsp", request, response);
	}

}
