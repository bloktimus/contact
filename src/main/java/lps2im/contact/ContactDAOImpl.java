package lps2im.contact;
import java.util.ArrayList;
import java.util.List;

public class ContactDAOImpl implements IContactDAO{

	private List<Contact> listeContacts = new ArrayList();
	
	public void creerContact(Contact ct) {
		this.listeContacts.add(ct);
	}
	
	public Contact recupererContact(String nom, String tel) {
		Contact ret = null;
		for (int i = 0 ; i < this.listeContacts.size() ; i++) {
			if(nom.equals(this.listeContacts.get(i).getNom())) ret = this.listeContacts.get(i);
		}
		return ret;
	}
	
	public boolean isContactExists(String nom) {
		boolean ret = false;
		for (int i = 0 ; i < this.listeContacts.size() ; i++) {
			if(nom.equals(this.listeContacts.get(i).getNom())) ret = true;
		}
		return ret;
	}
	
	
	
}
