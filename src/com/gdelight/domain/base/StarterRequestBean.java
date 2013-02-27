package com.gdelight.domain.base;

import com.gdelight.metrics.base.BaseRequestMetricBean;

public class StarterRequestBean extends BaseRequestBean {

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public BaseRequestMetricBean getMetrics() {
		BaseRequestMetricBean metrics = new BaseRequestMetricBean();
		this.setMetrics(metrics);
		return metrics;
	}

}


