package com.ensup.master.metier;

/**
 * Classe Person
 * Représente une personne dans la base de données.
 * @author DANON
 *
 */
public class Person {

	private int id;
	private String firstName;
	private String lastName;
	private String mailAdresse;
	private String adress;
	private String numberPhone;
	
	public Person() {}
	
	public Person(int id, String firstName, String lastName, String mailAdresse, String adress, String numberPhone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mailAdresse = mailAdresse;
		this.adress = adress;
		this.numberPhone = numberPhone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMailAdresse() {
		return mailAdresse;
	}

	public void setMailAdresse(String mailAdresse) {
		this.mailAdresse = mailAdresse;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mailAdresse="
				+ mailAdresse + ", adress=" + adress + ", numberPhone=" + numberPhone + "]";
	}
	
}
