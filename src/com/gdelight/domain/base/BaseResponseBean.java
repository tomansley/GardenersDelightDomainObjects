package com.gdelight.domain.base;

import java.util.ArrayList;
import java.util.List;

import com.gdelight.domain.base.BaseRequestBean.TRANSACTION_TYPE;

public class BaseResponseBean {

	private BaseRequestBean.TRANSACTION_TYPE transactionType = null;
	private STATUS_TYPE status = STATUS_TYPE.SUCCESS;
	private List<RequestErrorBean> errors = new ArrayList<RequestErrorBean>();

	public static enum STATUS_TYPE {
		SUCCESS ("S"),
		REJECTED ("R"),
		FAILED  ("F");
		
		private final String statusType;
		STATUS_TYPE(String statusType) {
			this.statusType = statusType;
		}
		
		public String getStatusType() {
			return statusType;
		}
		
	}

	public BaseResponseBean() {
		
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

}
