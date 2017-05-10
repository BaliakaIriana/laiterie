package s6.frameop.object;

import s6.frameop.entities.Data;


public class Utilisateur extends Data{
	String nom;
	String email;
	String password;
	int privilege;
	
	
	
	public Utilisateur() {
	}
	public Utilisateur(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	public Utilisateur(int id, String nom, String email, String password, int privilege) {
		super(id);
		this.nom = nom;
		this.email = email;
		this.password = password;
		this.privilege = privilege;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPrivilege() {
		return privilege;
	}
	public void setPrivilege(int privilege) {
		this.privilege = privilege;
	}
	@Override
	public String toString() {
		return "Utilisateur [id= " + id + ", nom=" + nom + ", email=" + email + ", password=" + password + ", privilege=" + privilege
				+ "]";
	}
	
	
}
