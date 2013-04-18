package com.gdelight.domain.item;

import java.io.Serializable;
import java.sql.Timestamp;

public class Item implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name = "";
	private String amount = "";
	private String subGroup = ""; //BRAEBURN, GRANNY SMITH, MCINTOSH
	private Timestamp dateCreated = null;
	private Boolean active = true;

	public String getSubGroup() {
		return subGroup;
	}

	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}
	
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
