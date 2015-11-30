package interfaces;

import java.time.LocalDate;

import domain.Contact;

public interface Controller {

	/**
	 * Denne metode videregiver brugerens input om brugernavn og kodeord til UserMapping.
	 * @param username
	 * @param password
	 */
	public void login(String username, String password);
	
	/**
	 * Denne metode videregiver brugerens input om kontaktoplysninger til ContactMapping.
	 * @param birthday
	 * @param name
	 * @param adress
	 * @param zipnumber
	 * @param city
	 * @param picture
	 * @param phonenumber
	 * @param email
	 * @throws ExistingContactException
	 */
	public void contactExists(LocalDate birthday,
			String name,
			String adress,
			String zipnumber,
			String city,
			String picture,
			String phonenumber,
			String email)
			throws ExistingContactException;
	
	public void sadfasdfContact();
	
	/**
	 * Denne metode giver besked til ContactMapping om at tilf�je den angivet kontakt.
	 * @param temporaryContact
	 */
	public void addContact(Contact temporaryContact);
	
	/**
	 * Denne metode giver besked til ContactMapping om at redigere den angivet kontakt.
	 * @param temporaryContact
	 */
	public void editContact(Contact temporaryContact);
	
	
	/**
	 * Denne metode sp�rger brugeren om han/hun vil bekr�fte sletningen af den valgte kontakt.
	 * @param contact
	 */
	public void deleteContact(Contact contact, boolean isConfirmed);
	
	/**
	 * Denne metode sletter den angivet kontakt efter godkendelse.
	 * @param contact
	 */
	public void removeContact(Contact contact);
	
	/**
	 * Denne metode videregiver den valgte kontakt til 
	 * @param contact
	 */
	public void showContact(Contact contact);
	
	/**
	 * Denne metode videregiver brugerens input on s�geord.
	 * @param keyword
	 */
	public void searchContact(String keyword);
	
	/**
	 * Denne metode henter alle kontakter ind til oversigten.
	 */
	public void fetchContacts();
}
