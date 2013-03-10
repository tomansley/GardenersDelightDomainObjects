package com.gdelight.domain.response;

import java.util.List;

import com.gdelight.domain.base.BaseRequestBean;
import com.gdelight.domain.base.BaseResponseBean;
import com.gdelight.domain.item.ItemGroup;

public class LoginResponseBean extends BaseResponseBean {

	private List<ItemGroup> available = null;

	public LoginResponseBean() {
		this.setTransactionType(BaseRequestBean.TRANSACTION_TYPE.LOGIN);
	}
	
	public List<ItemGroup> getAvailable() {
		return available;
	}

	public void setAvailable(List<ItemGroup> available) {
		this.available = available;
	}
	

}
