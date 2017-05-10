package s6.frameop.dao;

import java.util.List;
import java.util.Map;

import s6.frameop.object.Utilisateur;

public interface IUtilisateurDao {
	public void save(Utilisateur user) throws Exception;
	public List<Utilisateur> all() throws Exception;
	public void delete(Utilisateur critere) throws Exception;
	public void update(Utilisateur critere) throws Exception;
	public Utilisateur get(int id) throws Exception;
	List<Utilisateur> get(Map<String, Object> critere) throws Exception;
}
