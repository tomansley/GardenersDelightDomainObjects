package com.gdelight.domain.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gdelight.domain.user.UserBean;
import com.gdelight.metrics.base.BaseRequestMetricBean;

public class BaseRequestBean {

	private TRANSACTION_TYPE transactionType = null;
	private String userId = ""; //need this here so that there is a place to initially put the data.
	private String token = "";
	private UserBean user = null;
	private STATUS_TYPE status = STATUS_TYPE.INITIAL;
	private Date lastRequestTime = new Date(0);
	private Date requestTime = new Date();
	private List<RequestErrorBean> errors = new ArrayList<RequestErrorBean>();
	private BaseRequestMetricBean metrics = new BaseRequestMetricBean();

	// -----------------------------------------
	// Available Transactions as an enumeration
	//------------------------------------------
	public static enum TRANSACTION_TYPE {
		LOGIN ("001"),
		MAKE_AVAILABLE("002"),
		FIND_AVAILABLE("003"),
		SIGNUP("004");
		
		private final String transactionNum;
		TRANSACTION_TYPE(String transactionNum) {
			this.transactionNum = transactionNum;
		}
		
		public String getTransactionType() {
			return transactionNum;
		}
		
	}

	public static enum TEST_TYPE {
		TRUE ("Y"),
		FALSE ("N");
		
		private final String testType;
		TEST_TYPE(String testType) {
			this.testType = testType;
		}
		
		public String getTestType() {
			return testType;
		}
		
	}

	public static enum STATUS_TYPE {
		ACCEPTED ("A"),
		REJECTED ("R"),
		INITIAL  ("I");
		
		private final String statusType;
		STATUS_TYPE(String statusType) {
			this.statusType = statusType;
		}
		
		public String getStatusType() {
			return statusType;
		}
		
	}

	public BaseRequestBean() {
		
	}
	
	public TRANSACTION_TYPE getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TRANSACTION_TYPE transactionType) {
		this.transactionType = transactionType;
	}

	public void setTransactionType(String transactionType) {
		TRANSACTION_TYPE[] types = TRANSACTION_TYPE.values();
		for (TRANSACTION_TYPE type : types) {
			if (type.getTransactionType().equals(transactionType)) {
				this.transactionType = type;
				break;
			}
		}
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<RequestErrorBean> getErrors() {
		return errors;
	}
	
	public void clearErrors() {
		errors = new ArrayList<RequestErrorBean>();
	}

	public void addError(RequestErrorBean error, STATUS_TYPE status) {
		this.errors.add(error);
		this.setStatus(status);
	}
	
	public void addError(RequestErrorBean error) {
		this.errors.add(error);
	}
	
	public void setErrors(List<RequestErrorBean> errors) {
		this.errors.addAll(errors);
	}
	
	public boolean hasErrors() {
		boolean hasErrors = false;
		if (this.errors.size() > 0) {
			hasErrors = true;
		}
		return hasErrors;
	}

	public STATUS_TYPE getStatus() {
		return status;
	}

	public void setStatus(STATUS_TYPE statusType) {
		this.status = statusType;
	}

	public void setStatus(String inputType) {
		STATUS_TYPE[] types = STATUS_TYPE.values();
		for (STATUS_TYPE type : types) {
			if (type.getStatusType().equals(inputType)) {
				this.status = type;
				break;
			}
		}
	}

	public Date getLastRequestTime() {
		return lastRequestTime;
	}

	public void setLastRequestTime(Date lastRequestTime) {
		this.lastRequestTime = lastRequestTime;
	}
	public long getLastRequestTimeMillis() {
		return lastRequestTime.getTime();
	}

	public Date getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}
	
	public UserBean getUser() {
		if (user == null) {
			user = new UserBean();
		}
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public BaseRequestMetricBean getMetrics() {
		return metrics;
	}

	public void setMetrics(BaseRequestMetricBean metrics) {
		this.metrics = metrics;
	}
	
}
