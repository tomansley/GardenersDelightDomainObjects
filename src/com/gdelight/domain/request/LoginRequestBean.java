package com.gdelight.domain.request;

import com.gdelight.domain.base.BaseRequestBean;

public class LoginRequestBean extends BaseRequestBean {
	
	public LoginRequestBean() {
		this.setTransactionType(BaseRequestBean.TRANSACTION_TYPE.LOGIN);
	}

}
