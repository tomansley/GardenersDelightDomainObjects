package com.gdelight.domain.request;

import com.gdelight.domain.base.BaseRequestBean;

public class SpatialRequestBean extends BaseRequestBean {
	
	private Double latitude = new Double(-1);
	private Double longitude = new Double(-1);
	
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

}
