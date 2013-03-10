package com.gdelight.domain.response;

import com.gdelight.domain.base.BaseRequestBean;
import com.gdelight.domain.base.BaseResponseBean;

public class SignupResponseBean extends BaseResponseBean {

	public SignupResponseBean() {
		this.setTransactionType(BaseRequestBean.TRANSACTION_TYPE.SIGNUP);
	}
}
