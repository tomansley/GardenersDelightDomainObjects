package com.gdelight.domain.user;

public class PostUserBean implements Comparable<PostUserBean> {

	private boolean active = false;
	private String email = "";
	private String name = "";
	private boolean isEmailValid = false;
	private double revenueShare = 0.0;
	private int affiliateId = 0;
	private Integer defaultTier = 0;
	private int id = 0;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public int compareTo(PostUserBean otherLender) {
		if (otherLender == null) {
			return -1;
		}
		
		return name.compareTo(otherLender.getName());
	}
	
	public boolean isEmailValid() {
		return isEmailValid;
	}

	public void setEmailValid(boolean isEmailValid) {
		this.isEmailValid = isEmailValid;
	}

	public double getRevenueShare() {
		return revenueShare;
	}

	public void setRevenueShare(double revenueShare) {
		this.revenueShare = revenueShare;
	}

	public Integer getAffiliateId() {
		return affiliateId;
	}

	public void setAffiliateId(Integer affiliateId) {
		this.affiliateId = affiliateId;
	}

	public Integer getDefaultTier() {
		if (defaultTier == null) {
			defaultTier = 0;
		}
		return defaultTier;
	}

	public void setDefaultTier(Integer defaultTier) {
		if (defaultTier != null) {
			this.defaultTier = defaultTier;
		}
	}
	
	public String toString() {
		StringBuffer str = new StringBuffer();
		
		str.append("<name>" + name + "</name>\n");
		str.append("<isActive>" + active + "</isActive>\n");
		str.append("<license>" + email + "</license>\n");
		str.append("<licenseValid>" + isEmailValid + "</licenseValid>\n");
		str.append("<revenueShare>" + revenueShare + "</revenueShare>\n");
		str.append("<affiliateId>" + affiliateId + "</affiliateId>\n");
		str.append("<defaultTier>" + defaultTier + "</defaultTier>\n");

		return str.toString();
	}

}
