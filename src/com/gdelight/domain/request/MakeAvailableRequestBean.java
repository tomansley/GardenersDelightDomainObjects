package com.gdelight.domain.request;

import java.util.List;

import com.gdelight.domain.item.ItemGroup;

public class MakeAvailableRequestBean extends SpatialRequestBean {

	private List<ItemGroup> available = null;

	public List<ItemGroup> getAvailable() {
		return available;
	}

	public void setAvailable(List<ItemGroup> available) {
		this.available = available;
	}
	

}
