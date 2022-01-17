package com.inti.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ferme {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idFerme;
	private String nom;
	private Date dateAchat;
	
	@OneToMany (mappedBy = "ferme")
	private List<Gerant> gerants = new ArrayList<>();
	
	@OneToMany (mappedBy = "ferme")
	private List<Animal> animaux = new ArrayList<>();
	
	public Ferme() {
		
	}

	public Ferme(String nom, Date dateAchat) {
		this.nom = nom;
		this.dateAchat = dateAchat;
	}

	public Ferme(String nom, Date dateAchat, List<Gerant> gerants, List<Animal> animaux) {
		this.nom = nom;
		this.dateAchat = dateAchat;
		this.gerants = gerants;
		this.animaux = animaux;
	}

	public Long getIdFerme() {
		return idFerme;
	}

	public void setIdFerme(Long idFerme) {
		this.idFerme = idFerme;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public List<Gerant> getGerants() {
		return gerants;
	}

	public void setGerants(List<Gerant> gerants) {
		this.gerants = gerants;
	}

	public List<Animal> getAnimaux() {
		return animaux;
	}

	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}

	@Override
	public String toString() {
		return "Ferme [idFerme=" + idFerme + ", nom=" + nom + ", dateAchat=" + dateAchat + "]";
	}
	
	
	

}
