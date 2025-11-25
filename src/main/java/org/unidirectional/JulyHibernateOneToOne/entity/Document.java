package org.unidirectional.JulyHibernateOneToOne.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Document {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private long adharCardNo;
	
	private String panCard;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAdharCardNo() {
		return adharCardNo;
	}

	public void setAdharCardNo(long adharCardNo) {
		this.adharCardNo = adharCardNo;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	@Override
	public String toString() {
		return "Document [id=" + id + ", adharCardNo=" + adharCardNo + ", panCard=" + panCard + "]";
	}
	
	
}
