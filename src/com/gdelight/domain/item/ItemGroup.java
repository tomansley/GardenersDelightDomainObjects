package com.gdelight.domain.item;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ItemGroup implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name = "";
	private List<Item> items = new ArrayList<Item>();
	private String location = "";

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
	
}
