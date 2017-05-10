package s6.frameop.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.criterion.Restrictions;

import s6.frameop.entities.Data;
import s6.frameop.object.Utilisateur;

public class UtilisateurDaoImpl implements IUtilisateurDao {
	static HibernateDao dao;
	static{
		dao = new HibernateDao();
	}
	@Override
	public void save(Utilisateur user) throws Exception {
		dao.save(user);
	}

	@Override
	public List<Utilisateur> all() throws Exception {
		List<Data> entityList = dao.findAll(new Utilisateur());
		List<Utilisateur> utilisateurList = new ArrayList<Utilisateur>();
		for (Data entity : entityList) {
			utilisateurList.add((Utilisateur)entity);
		}
		return utilisateurList;
	}

	@Override
	public List<Utilisateur> get(Map<String,Object> critere) throws Exception {
		
		List<Data> entityList = dao.find(new Utilisateur(),Restrictions.allEq(critere));
		List<Utilisateur> utilisateurList = new ArrayList<Utilisateur>();
		for (Data entity : entityList) {
			utilisateurList.add((Utilisateur)entity);
		}
		System.out.println(utilisateurList);
		return utilisateurList;
	}

	@Override
	public void delete(Utilisateur critere) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Utilisateur critere) {
		// TODO Auto-generated method stub

	}

	@Override
	public Utilisateur get(int id) throws Exception {
		HibernateDao dao = new HibernateDao();
		Utilisateur u = new Utilisateur(id);
		dao.findById(u);
		return u;
	}

}
