package com.sip.ams.entities;

public class Etudiant {
	
	private String nom ;
	private int age ;
	private String tel ;
	private String adresse ;
	
	public Etudiant(String nom,int age , String tel,String adresse) {
		this.nom=nom;
		this.age=age;
		this.tel=tel;
		this.adresse=adresse;
	}


	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", age=" + age + ", tel=" + tel + ", adresse=" + adresse + "]";
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	
}
