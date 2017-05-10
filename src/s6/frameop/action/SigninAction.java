package s6.frameop.action;

import com.opensymphony.xwork2.ActionSupport;

import s6.frameop.object.UtilisateurModel;
import s6.frameop.service.SingletonService;
import s6.frameop.service.UtilisateurService;

public class SigninAction extends ActionSupport {
	UtilisateurService service = SingletonService.getUserservice();
	public UtilisateurModel user = new UtilisateurModel();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String signinview(){
		return SUCCESS;
	}
	
	public String signin(){
		try {
			service.register(user);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		
	}
}
