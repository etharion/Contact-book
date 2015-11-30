	package interfaces;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import exceptions.ExsistingContactException;

public interface ContactMapping {
	/**
	 * Denne metode tjekker om der er en eksisterende kontakt i persistens laget med de angivne parameter.
	 * @param birthday LocalDate 
	 * @param name String
	 * @param address String
	 * @param zipnumber String
	 * @param city String
	 * @param picture String
	 * @param phonenumber String
	 * @param email String
	 * @throws ExsistingContactException
	 */
	boolean addContact(LocalDate birthday, String name, String address, String zipnumber, String city, String picture, 
			String phonenumber, String email);
	
	/**
	 * Denne matode ændre den angivne kontatkt og gemmer den i persistenens laget.
	 * @param contact Contact
	 */
	void editContact(Contact contact);
	
	/**
	 * Denne metode sletter den angivne kontakt fra persistens laget.
	 * @param contact
	 */
	void deleteContact(Contact contact);
	
	/**
	 * Denne metode søger efter og returnerer en List af kontakter, som indeholder den angivne keyword.
	 * @param keyword
	 * @return List Returnerer en List af Contact instanser.
	 */
	List searchContact(String keyword);
	
	/**
	 * 
	 * @return Map Returnerer en Map som indeholder alle Contact instanser i systemet.
	 */
	Map fetchAllContacts();
	
	/**
	 * Denne metode tjekker om en Contact med attributer som den angivne parameter findes i persistens laget. 
	 * @param birthday LocalDate
	 * @param name String
	 * @param adress String 
	 * @param zipnumber String
	 * @param city String 
	 * @param picture String
	 * @param phonenumber String
	 * @param email String
	 * @return
	 */
	boolean contactExists(LocalDate birthday, String name, String adress, String zipnumber, String city, 
			String picture, String phonenumber, String email);
}