package com.gdelight.domain.user;

import java.util.Date;

import com.gdelight.tools.json.JsonUtils;

public class UserBean implements Comparable<UserBean> {

	private boolean active = false;
	private String email = "";
	private String token = "";
	private String firstName = "";
	private String lastName = "";
	private Date dateOfBirth = null;
	private boolean isTokenValid = false;
	private double longitude = -1;
	private double latitude = -1;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public boolean getActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public int compareTo(UserBean otherUser) {
		if (otherUser == null) {
			return -1;
		}
		
		return email.compareTo(otherUser.getEmail());
	}
	
	public boolean isTokenValid() {
		return isTokenValid;
	}

	public void setTokenValid(boolean isTokenValid) {
		this.isTokenValid = isTokenValid;
	}
	
	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String toString() {
		return JsonUtils.getJSonDocument(this);
	}

}
