package com.sds.icto.mysite.servlet.action.main;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.web.WebUtil;
import com.sds.icto.web.action;

public class IndexAction implements action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		// TODO Auto-generated method stub
		WebUtil.forward("/views/main/index.jsp", request, response);
	}

}
