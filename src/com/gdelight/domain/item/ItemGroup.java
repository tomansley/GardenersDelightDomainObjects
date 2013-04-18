package com.gdelight.domain.item;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ItemGroup implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name = "";
	private String username = "";
	private List<Item> items = new ArrayList<Item>();
	private String location = "";
	private Double latitude = new Double(-1);
	private Double longitude = new Double(-1);
	private Double distance = new Double(0);
	private Boolean organic = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public void addItem(Item item) {
		items.add(item);
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getReadableDistance() {
		return String.format("%.2f", distance);
	}

	public Double getLongitude() {
		return longitude;
	}
	
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}
	
	public Boolean getOrganic() {
		return organic;
	}

	public void setOrganic(Boolean organic) {
		this.organic = organic;
	}

}
