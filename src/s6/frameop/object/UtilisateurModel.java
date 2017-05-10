package s6.frameop.object;

public class UtilisateurModel extends Utilisateur {
	String confirmation;

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}
	
	public void checkConfirmation() throws Exception{
		if(confirmation.compareTo(password) != 0) throw new Exception("Le mot de passe et sa confirmation ne sont équivalentes");
	}
	
	public Utilisateur getUtilisateur(){
		Utilisateur ret = new Utilisateur();
		ret.setEmail(getEmail());
		ret.setNom(getNom());
		ret.setPassword(getPassword());
		ret.setPrivilege(0);
		return ret;
	}
	
	
}
