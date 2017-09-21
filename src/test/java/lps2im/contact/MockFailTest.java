package lps2im.contact;

import static org.junit.Assert.*;

import org.easymock.Capture;
import org.easymock.EasyMock;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Test;

public class MockFailTest {

	@TestSubject
	private ContactService service = new ContactService ();
	
	@Mock
	private IContactDAO dao;
	
	@Test
	public void testCreerContactCasValide() throws IllegalArgumentException, IllegalStateException{
		
		// Phase d'enregistrement des comportements
		String nom = "ContactOK";
		EasyMock.expect(dao.isContactExists(nom)).andReturn(true);
		
		Capture<Contact> newCapture = EasyMock.newCapture();
		dao.creerContact(EasyMock.capture(newCapture));
		EasyMock.expectLastCall();
		
		replayAll();
		
		// Appel de la méthode
		service.creerContact(nom, "1234567890");
		
		// Verification
		verifyAll();
		
		assertEquals("1234567890", newCapture.getValue().getTel(),"erreur");
		
		
	}
	
	
}
