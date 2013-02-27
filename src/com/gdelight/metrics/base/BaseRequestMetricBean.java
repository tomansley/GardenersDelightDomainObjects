package com.gdelight.metrics.base;

public class BaseRequestMetricBean {

	private long startTime = 0;
	private long totalTime = 0;

	public Long getTotalTime() {
		return totalTime;
	}
	
	public void setTotalTime(long totalTime) {
		this.totalTime = totalTime;
	}
	
	public Long getStartTime() {
		return startTime;
	}
	
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	
}
