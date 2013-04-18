package com.gdelight.domain.response;

import java.util.List;

import com.gdelight.domain.base.BaseRequestBean;
import com.gdelight.domain.base.BaseResponseBean;
import com.gdelight.domain.item.ItemGroup;

public class FindAvailableResponseBean extends BaseResponseBean {

	private List<ItemGroup> groups = null;
	
	public FindAvailableResponseBean() {
		this.setTransactionType(BaseRequestBean.TRANSACTION_TYPE.FIND_AVAILABLE);
	}

	public List<ItemGroup> getItems() {
		return groups;
	}

	public void setItems(List<ItemGroup> groups) {
		this.groups = groups;
	}
}
