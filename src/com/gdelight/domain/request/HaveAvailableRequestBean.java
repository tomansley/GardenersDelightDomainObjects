package com.gdelight.domain.request;

import java.util.ArrayList;
import java.util.List;

import com.gdelight.domain.item.ItemGroup;

public class HaveAvailableRequestBean extends SpatialRequestBean {

	private List<ItemGroup> available = null;

	public HaveAvailableRequestBean() {
		this.setTransactionType(TRANSACTION_TYPE.HAVE_AVAILABLE);
	}
	
	public List<ItemGroup> getAvailable() {
		return available;
	}

	public void setAvailable(List<ItemGroup> available) {
		this.available = available;
	}
	
	public void setAvailable(ItemGroup availGroup) {
		if (this.available == null) {
			this.available = new ArrayList<ItemGroup>();
		}
			
		this.available.add(availGroup);
	}
	

}
