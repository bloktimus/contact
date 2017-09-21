package lps2im.contact;

public class ContactService {
	
	private IContactDAO contacts = new ContactDAOImpl();
	
	
	public void creerContact(String nom, String tel) {
		if(nom == null) {
			throw new IllegalArgumentException("Le nom doit etre saisi.");
		}
		if(3 > nom.length() || nom.length() > 40 ) {
			throw new IllegalArgumentException("La taille du nom n'est pas acceptable.");
		}
		if(contacts.isContactExists(nom)){
			throw new IllegalStateException("Le nom est déjà présent dans la liste.");
		}
		if(tel == null){
			throw new IllegalArgumentException("Le num de tel est null.");
		}
		if(tel.length() != 10){
			throw new IllegalArgumentException("Le num de tel est incorrect.");
		}
		
		Contact contact = new Contact(nom,tel);
		contacts.creerContact(contact);
		
	}

	

}
