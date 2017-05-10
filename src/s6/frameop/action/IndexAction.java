package s6.frameop.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String index(){
		Map<String,Object> session = ActionContext.getContext().getSession();
		if(session.get("logged") == null){
			return "redirect";
		}
		return "ok";
	}

}
