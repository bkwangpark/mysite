package com.sds.icto.mysite.servlet.action.guestbook;

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
		/*if(instance==null){
			instance=new ActionFactory();
		}*/
		return instance;
	}
	public action getAction(String a){
		
		return null;
	}
}
