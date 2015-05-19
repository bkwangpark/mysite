package com.sds.icto.mysite.servlet.action.board;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.mysite.dao.BoardDao;
import com.sds.icto.mysite.vo.BoardVo;
import com.sds.icto.web.WebUtil;
import com.sds.icto.web.action;

public class FindAction implements action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		// TODO Auto-generated method stub
		String key = request.getParameter("key");
		
		BoardDao dao = new BoardDao();
		List<BoardVo> list = dao.findList(key);
		
		request.setAttribute("list", list);
		
		WebUtil.forward("/views/board/list.jsp", request, response);
	}

}
