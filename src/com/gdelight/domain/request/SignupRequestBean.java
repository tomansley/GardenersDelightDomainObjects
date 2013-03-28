package com.gdelight.domain.request;

import com.gdelight.domain.base.BaseRequestBean;

public class SignupRequestBean extends SpatialRequestBean {
	
	public SignupRequestBean() {
		this.setTransactionType(BaseRequestBean.TRANSACTION_TYPE.SIGNUP);
	}
}
