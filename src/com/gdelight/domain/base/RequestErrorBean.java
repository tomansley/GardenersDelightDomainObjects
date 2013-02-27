package com.gdelight.domain.base;

import java.util.ArrayList;
import java.util.List;

import com.gdelight.tools.string.StringUtils;

public class RequestErrorBean {

	private int errorCode = 0;
	private List<String> arguments = new ArrayList<String>();
	private static String SUBST_KEY = "$$";
	private String message = "";

	public RequestErrorBean() {
	}
	
	public RequestErrorBean(String message) {
		this.message = message;
	}
	
	public RequestErrorBean(int code) {
		errorCode = code;
	}
	
	public RequestErrorBean(int code, List<String> arguments) {
		errorCode = code;
		if (arguments != null) {
			this.arguments = arguments;
		}
	}
	
	public Integer getErrorCode() {
		return errorCode;
	}
	
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	public String getErrorMessage() {
		if (message.equals("")) {
			message = BaseErrorMessages.getErrorMessage(errorCode);
		}
		
		//if there are arguments for message then perform substitution
		if (!arguments.isEmpty()) {
			message = StringUtils.substituteMessageVariables(SUBST_KEY, arguments, message);
		}
		
		return message;
	}

	public List<String> getArguments() {
		return arguments;
	}

	public void setArguments(List<String> arguments) {
		if (arguments != null) {
			this.arguments = arguments;
		}
	}
	
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("<CMVRequestErrorBean>");
			str.append("<ErrorCode>" + errorCode + "</ErrorCode>");
			str.append("<ErrorMessage>" + this.getErrorMessage() + "</ErrorMessage>");
		str.append("</CMVRequestErrorBean>");

		return str.toString();

	}

}
