package s6.frameop.service;

import s6.frameop.dao.UtilisateurDaoImpl;

public class SingletonService {
	static UtilisateurService userservice;
	static{
		UtilisateurDaoImpl dao = new UtilisateurDaoImpl();
		userservice = new UtilisateurService();
		userservice.setDao(dao);
	}
	public static UtilisateurService getUserservice() {
		return userservice;
	}
	
}
