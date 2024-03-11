package com.ranim.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Supermarche implements Serializable {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idSupermarche;
	
	
	private String nomSupermarche;
	private String type;
	
	public Long getIdSupermarche() {
		return idSupermarche;
	}
	public void setIdSupermarche(Long idSupermarche) {
		this.idSupermarche = idSupermarche;
	}
	public String getNomSupermarche() {
		return nomSupermarche;
	}
	public void setNomSupermarche(String nomSupermarche) {
		this.nomSupermarche = nomSupermarche;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
