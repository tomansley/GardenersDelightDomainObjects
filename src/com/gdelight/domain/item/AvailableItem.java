package com.gdelight.domain.item;

public class AvailableItem extends Item {

	private Double latitude = new Double(-1);
	private Double longitude = new Double(-1);
	private Double distance = new Double(0);
	
	public Double getLongitude() {
		return longitude;
	}
	
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	
}
