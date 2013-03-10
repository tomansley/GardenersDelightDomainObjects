package com.gdelight.domain.response;

import java.util.List;

import com.gdelight.domain.base.BaseRequestBean;
import com.gdelight.domain.base.BaseResponseBean;
import com.gdelight.domain.item.AvailableItem;

public class FindAvailableResponseBean extends BaseResponseBean {

	private List<AvailableItem> items = null;
	
	public FindAvailableResponseBean() {
		this.setTransactionType(BaseRequestBean.TRANSACTION_TYPE.FIND_AVAILABLE);
	}

	public List<AvailableItem> getItems() {
		return items;
	}

	public void setItems(List<AvailableItem> items) {
		this.items = items;
	}
}
