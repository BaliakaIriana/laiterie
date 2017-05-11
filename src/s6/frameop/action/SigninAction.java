package s6.frameop.action;

import java.util.List;

import s6.frameop.object.Utilisateur;
import s6.frameop.object.UtilisateurModel;
import s6.frameop.service.SingletonService;
import s6.frameop.service.UtilisateurService;

public class SigninAction extends BaseAction {
	UtilisateurService service = SingletonService.getUserservice();
	public UtilisateurModel user = new UtilisateurModel();
	List<Utilisateur> inscriptionList;
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
	
	public String listinsc(){
		setPage("activate-account-list");
		try {
			setInscriptionList(service.getAccountLocked());
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
	}
	
	private int idinscription;
	public String activate(){
		
		try {
			System.out.println(idinscription+" est activé");
			service.activateAccount(idinscription);
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}

	public List<Utilisateur> getInscriptionList() {
		return inscriptionList;
	}

	public void setInscriptionList(List<Utilisateur> inscriptionList) {
		this.inscriptionList = inscriptionList;
	}

	public int getIdinscription() {
		return idinscription;
	}

	public void setIdinscription(int idinscription) {
		this.idinscription = idinscription;
	}
	
	
	
	
}
