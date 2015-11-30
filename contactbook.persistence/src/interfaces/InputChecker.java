package interfaces;

import java.time.LocalDate;

public interface InputChecker {

	/**
	 * Tjekker om fødselsdatoen er gyldig. 
	 * @param birthday
	 */
	public void checkBirthday(LocalDate birthday);
	
	/**
	 * Tjekker om navnet er gyldigt.
	 * @param name
	 */
	public void checkName(String name);
	
	/**
	 * Tjekker om zipnummeret er gyldigt.
	 * @param zipnumber
	 */
	public void checkZipnumber(String zipnumber);
	
	/**
	 * Tjekker om bynavnet er gyldigt.
	 * @param city
	 */
	public void checkCity(String city);
	

	/**
	 * Tjekker om billedet er gyldigt.
	 * @param picture
	 */
	public void checkPicture(String picture);
	
	/**
	 * Tjekker om telefonnummeret er gyldigt.
	 * @param phonenumber
	 */
	public void checkPonenumber(String phonenumber);
	
	/**
	 * Tjekker om email'en er gyldig.
	 * @param email
	 */
	public void checkEmail(String email);
	
}
