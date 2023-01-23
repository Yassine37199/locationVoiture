package net.tekup.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Voiture")
public class Voiture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "matricule", nullable = false)
	private String matricule;
	
	@Column(name = "modele")
	private String modele;
	
	@Column(name = "couleur")
	private String couleur;


	public Voiture() {
		
	}
	
	public Voiture(String matricule, String modele, String couleur) {
		super();
		this.matricule = matricule;
		this.modele = modele;
		this.couleur = couleur;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getmatricule() {
		return matricule;
	}
	public void setmatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getmodele() {
		return modele;
	}
	public void setmodele(String modele) {
		this.modele = modele;
	}
	public String getcouleur() {
		return couleur;
	}
	public void setcouleur(String couleur) {
		this.couleur = couleur;
	}
}
