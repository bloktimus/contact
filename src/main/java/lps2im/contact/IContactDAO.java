package lps2im.contact;

public interface IContactDAO {
	
	
	public void creerContact(Contact ct);
	
	public Contact recupererContact(String nom, String tel);
	
	public boolean isContactExists(String nom);
	

}
