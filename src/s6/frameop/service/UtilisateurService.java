package s6.frameop.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import s6.frameop.dao.UtilisateurDaoImpl;
import s6.frameop.object.Utilisateur;
import s6.frameop.object.UtilisateurModel;

public class UtilisateurService {
	UtilisateurDaoImpl dao;
	
	
	public UtilisateurDaoImpl getDao() {
		return dao;
	}


	public void setDao(UtilisateurDaoImpl dao) {
		this.dao = dao;
	}


	public Utilisateur connect(String email,String password) throws Exception{
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("email", email);
		map.put("password", password);
		List<Utilisateur> loggerList = dao.get(map);
		if(loggerList.isEmpty() || loggerList.size() > 1){
			throw new Exception("Email ou mot de passe invalide!");
		}
		return loggerList.get(0);
	}
	
	public void register(UtilisateurModel model) throws Exception{
		model.checkConfirmation();
		Utilisateur vaovao = model.getUtilisateur();
		dao.save(vaovao);
	}
	
}
