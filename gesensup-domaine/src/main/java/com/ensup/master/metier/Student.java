package com.ensup.master.metier;

import java.util.Date;

/**
 * Classe Student
 * Représente un étudiant dans la base de données.
 * @author Student
 *
 */
public class Student extends Person {

	private Date dateOfBirth;

	public Student(int id, String firstName, String lastName, String mailAdresse, String adress, String numberPhone,
			Date dateOfBirth) {
		super(id, firstName, lastName, mailAdresse, adress, numberPhone);
		this.dateOfBirth = dateOfBirth;
	}
	public Student() {
		super();
	}

	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	@Override
	public String toString() {
		return "Student [dateOfBirth=" + dateOfBirth + ", getId()=" + getId() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getMailAdresse()=" + getMailAdresse() + ", getAdress()="
				+ getAdress() + ", getNumberPhone()=" + getNumberPhone() + "]";
	}

}
