package com.gdelight.domain.response;

import com.gdelight.domain.base.BaseRequestBean;
import com.gdelight.domain.base.BaseResponseBean;

public class HaveAvailableResponseBean extends BaseResponseBean {

	public HaveAvailableResponseBean() {
		this.setTransactionType(BaseRequestBean.TRANSACTION_TYPE.HAVE_AVAILABLE);
	}
}
