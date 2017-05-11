package s6.frameop.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class IndexAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String index(){
		Map<String,Object> session = ActionContext.getContext().getSession();
		if(session.get("logged") == null){
			return "redirect";
		}
		setPage("index");
		return "ok";
	}
	public String test(){
		setPage("test");
		System.out.println(getPage());
		return SUCCESS;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	
}
