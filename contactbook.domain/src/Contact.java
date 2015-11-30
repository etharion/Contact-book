package domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Contact {

	int contactid;
	LocalDate birthday;
	String name, adress, zipnumber, city, picture, phonenumber, email, age;
	
	public Contact(LocalDate birthday, String name){
		this.birthday = birthday;
		this.name = name;
	}
	
	public int getContactId (int contactid){
		return contactid;
	}
	
	public void setContactId (int contactid){
		this.contactid = contactid;
	}
	
	public LocalDate getBirthday (LocalDate birthday){
		return birthday;
	}	
	
	public String getName (String name){
		return name;
	}
	
	public String getAdress (String adress){
		return adress;
	}
	
	public void setAdress (String adress){
		this.adress = adress;
	}
	
	public String getZipnumber (String zipnumber){
		return zipnumber;
	}
	
	public void setZipnumber (String zipnumber){
		this.zipnumber = zipnumber;
	}
	
	public String getCity (String city){
		return city;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public String getPicture (String picture){
		return picture;
	}
	
	public void setPicture (String picture){
		this.picture = picture;
	}
	
	public String getPhonenumber (String phonenumber){
		return phonenumber;
	}
	
	public void setPhonenumber (String phonenumber){
		this.phonenumber = phonenumber;
	}
	
	public String getEmail (String email){
		return email;
	}
	
	public void setEmail (String email){
		this.email = email;
	}

	public int getAge (int age){
		LocalDate today = LocalDate.now();

		int yearsBetween = (int) ChronoUnit.YEARS.between(birthday, today);
			
		return yearsBetween;
	}
	
	public void setAge (String age){
		this.age = age;
	}
	
	public boolean matches (Contact contact) {
		if(this.name == contact.name && this.birthday == contact.birthday){
			return true;
		}
		
		return false;
	}
}
