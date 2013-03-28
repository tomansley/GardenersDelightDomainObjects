package com.gdelight.domain.base;

import java.util.ArrayList;
import java.util.List;

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
			message = substituteMessageVariables(SUBST_KEY, arguments, message);
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
		str.append("<RequestErrorBean>");
			str.append("<ErrorCode>" + errorCode + "</ErrorCode>");
			str.append("<ErrorMessage>" + this.getErrorMessage() + "</ErrorMessage>");
		str.append("</RequestErrorBean>");

		return str.toString();

	}

	/**
	 * CURRENTLY EXISTS HERE SO THAT WE DONT NEED TO IMPORT TOOLS INTO ANDROID PROJECT
	 * Method to substitute variables in the string provided.  For example if a property existed
	 * with key = testVariable then any match on the pattern $$testVariable would be replaced by the keys value.
	 * @param substKey the key to look for to be substituting.  In this method if the key is $$ it will look for $$0, $$1, $$2 etc. 
	 * @param props the properties to be substituted in
	 * @param str the string that contains the substitutions that are to be made.
	 * @return the string with all substitutions made.
	 */
	public static String substituteMessageVariables(String substKey, List<String> props, String str) {
		String newStr = str;
		String prop = "";
		for (int i = 0; i < props.size(); i++) {
			prop = props.get(i);
			newStr = newStr.replace(substKey+i, prop);
		}
		return newStr;
	}

}
