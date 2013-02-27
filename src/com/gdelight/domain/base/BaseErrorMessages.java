package com.gdelight.domain.base;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

public class BaseErrorMessages {

	private static Map<Integer, String> errorMessages = new HashMap<Integer, String>();
	private static Logger log = Logger.getLogger(BaseErrorMessages.class);

	static {
		try { addErrorMessage(-1, "Unknown error"); } catch (ErrorException e) { }
	}
	
	protected BaseErrorMessages() {
	}

	public static String getErrorMessage(int errorCode) {
		String message = "";
		message = errorMessages.get(errorCode);
		
		//if message is not found then pass back 'Unknown'
		if (message == null) {
			message = errorMessages.get(-1);
		}
		
		return message;
	}

	public static void addErrorMessage(Integer errorId, String errorMessage) throws ErrorException {
		if (errorMessages.containsKey(errorId)) {
			if (!errorMessage.equals(errorMessages.get(errorId))) {
				log.warn("An error message with the same ID already exists - " + errorId);
				log.warn("Old message - " + errorMessages.get(errorId));
				log.warn("New message - " + errorMessage);
				log.warn("The new message will not be added");
			}
		}
		errorMessages.put(errorId, errorMessage);
	}
}
