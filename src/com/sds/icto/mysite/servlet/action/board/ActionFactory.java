package com.sds.icto.mysite.servlet.action.board;

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
		}else if("update".equals(a)){
			action = new UpdateAction();
		}else if("modify".equals(a)){
			action = new ModifyAction();
		}else if("show".equals(a)){
			action = new ShowAction();
		}else if("find".equals(a)){
			action = new FindAction();
		}
		if(action==null){
			action = new IndexAction();
		}
		return action;
	}
}
