package s6.frameop.test;

import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;
import s6.frameop.dao.UtilisateurDaoImpl;
import s6.frameop.object.Utilisateur;

public class UtilisateurDaoImplTest extends TestCase{

	@Test
	public void testSave() {
		UtilisateurDaoImpl dao = new UtilisateurDaoImpl();
		Utilisateur u = new Utilisateur();
		u.setId(50);
		u.setEmail("baliaka.iriana@gmail.com");
		u.setNom("Baliaka Iriana");
		u.setPrivilege(1);
		u.setPassword("blk");
		try {
			dao.save(u);
			List<Utilisateur> utilisateurList = dao.all();
			for (Utilisateur utilisateur : utilisateurList) {
				System.out.println(utilisateur);
			}
			u.setPrivilege(0);
			dao.update(u);
			utilisateurList = dao.all();
			for (Utilisateur utilisateur : utilisateurList) {
				System.out.println(utilisateur);
			}
			dao.delete(u);
			utilisateurList = dao.all();
			for (Utilisateur utilisateur : utilisateurList) {
				System.out.println(utilisateur);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
