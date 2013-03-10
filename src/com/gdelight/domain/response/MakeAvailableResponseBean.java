package com.gdelight.domain.response;

import com.gdelight.domain.base.BaseRequestBean;
import com.gdelight.domain.base.BaseResponseBean;

public class MakeAvailableResponseBean extends BaseResponseBean {

	public MakeAvailableResponseBean() {
		this.setTransactionType(BaseRequestBean.TRANSACTION_TYPE.MAKE_AVAILABLE);
	}
}
