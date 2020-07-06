package com.ensup.master;

public class Student {
private int id;
private String name;
private String first_name;
private String adresse;
private String adresse_mail;
private int phone_number;
private String birth;
private String type;
public Student(int id, String name, String first_name, String adresse, String adresse_mail, int phone_number,
		String birth, String type) {
	super();
	this.id = id;
	this.name = name;
	this.first_name = first_name;
	this.adresse = adresse;
	this.adresse_mail = adresse_mail;
	this.phone_number = phone_number;
	this.birth = birth;
	this.type = type;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", first_name=" + first_name + ", adresse=" + adresse
			+ ", adresse_mail=" + adresse_mail + ", phone_number=" + phone_number + ", birth=" + birth + ", type="
			+ type + "]";
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getAdresse_mail() {
	return adresse_mail;
}
public void setAdresse_mail(String adresse_mail) {
	this.adresse_mail = adresse_mail;
}
public int getPhone_number() {
	return phone_number;
}
public void setPhone_number(int phone_number) {
	this.phone_number = phone_number;
}
public String getBirth() {
	return birth;
}
public void setBirth(String birth) {
	this.birth = birth;
}
}
