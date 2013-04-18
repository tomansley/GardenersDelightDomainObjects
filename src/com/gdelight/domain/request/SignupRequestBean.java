package com.gdelight.domain.request;

import com.gdelight.domain.base.BaseRequestBean;

public class SignupRequestBean extends SpatialRequestBean {
	
	private String firstName = "";

	public SignupRequestBean() {
		this.setTransactionType(BaseRequestBean.TRANSACTION_TYPE.SIGNUP);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


}
