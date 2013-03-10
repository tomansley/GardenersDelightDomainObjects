package com.gdelight.json;

import java.util.Date;

import com.gdelight.domain.base.BaseRequestBean.STATUS_TYPE;
import com.gdelight.domain.base.BaseRequestBean.TRANSACTION_TYPE;
import com.gdelight.domain.base.StarterRequestBean;
import com.gdelight.tools.json.JsonUtils;

public class JsonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonTest.createJsonTest();
	}
	
	public static void createJsonTest() {
		
		StarterRequestBean bean = new StarterRequestBean();
		
		bean.setLastRequestTime(new Date());
		bean.setRequestTime(new Date());
		bean.setStatus(STATUS_TYPE.INITIAL);
		bean.setTransactionType(TRANSACTION_TYPE.LOGIN);
		
		String json = JsonUtils.getJSonDocument(bean);
		
		System.out.println(json);
		
		StarterRequestBean bean2 = (StarterRequestBean) JsonUtils.parseJSonDocument(json, StarterRequestBean.class);
		
		System.out.println("Last Request Time = " + bean2.getLastRequestTime());
		System.out.println("Request Time      = " + bean2.getRequestTime());
		System.out.println("Status            = " + bean2.getStatus());
		System.out.println("Transaction Type  = " + bean2.getTransactionType());
		
	}

}
