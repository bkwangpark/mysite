package com.sds.icto.mysite.servlet.action.member;

import com.sds.icto.mysite.servlet.action.main.IndexAction;
import com.sds.icto.web.action;

public class ActionFactory {
	private static ActionFactory instance;
	static{		
		instance=new ActionFactory();
	}
	private ActionFactory(){
		
	}
	public static ActionFactory getInstance(){
		return instance;
	}
	public action getAction(String a){
		action action=null;
		if("joinform".equals(a)){
			action = new JoinFormAction();
		}else if("join".equals(a)){
			action = new JoinAction();
		}else if("joinsuccess".equals(a)){
			action = new JoinSuccessAction();
		}else if("loginform".equals(a)){
			action = new LoginFormAction();
		}else if("login".equals(a)){
			action = new LoginAction();
		}else if("logout".equals(a)){
			action = new LogoutAction();
		}else if("uinfo".equals(a)){
			action = new UInfoAction();
		}
		if(action==null){
			action = new IndexAction();
		}
		return action;
	}
}
