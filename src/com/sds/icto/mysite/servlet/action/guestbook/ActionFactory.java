package com.sds.icto.mysite.servlet.action.guestbook;

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
		if("insert".equals(a)){
			action = new InsertAction();
		}else if("delete".equals(a)){
			action = new DeleteAction();
		}
		if(action==null){
			action = new IndexAction();
		}
		return action;
	}
}
