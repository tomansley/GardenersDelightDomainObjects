package com.gdelight.domain.request;

import java.util.List;

import com.gdelight.domain.item.Item;

public class FindAvailableRequestBean extends SpatialRequestBean {

	private List<Item> findItems = null;
	private Integer radius = null;

	public FindAvailableRequestBean() {
		this.setTransactionType(TRANSACTION_TYPE.FIND_AVAILABLE);
	}
	
	public List<Item> getFindItems() {
		return findItems;
	}

	public void setFindItems(List<Item> findItems) {
		this.findItems = findItems;
	}

	public Integer getRadius() {
		return radius;
	}

	public void setRadius(Integer radius) {
		this.radius = radius;
	}
	

}
