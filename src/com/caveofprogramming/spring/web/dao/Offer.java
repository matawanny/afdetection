package com.caveofprogramming.spring.web.dao;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.caveofprogramming.spring.web.validation.ValidEmail;

public class Offer {
	private int id;
	private String company_name;
	private String website_url;
	private String campaign;
	private int total_click;
	private int fraud_click;
	private int us_click;
	
	public Offer(){}
	
	
	public Offer(int id, String company_name, String website_url,
			String campaign, int total_click, int fraud_click, int us_click) {
		super();
		this.id = id;
		this.company_name = company_name;
		this.website_url = website_url;
		this.campaign = campaign;
		this.total_click = total_click;
		this.fraud_click = fraud_click;
		this.us_click = us_click;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCompany_name() {
		return company_name;
	}


	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}


	public String getWebsite_url() {
		return website_url;
	}


	public void setWebsite_url(String website_url) {
		this.website_url = website_url;
	}


	public String getCampaign() {
		return campaign;
	}


	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}


	public int getTotal_click() {
		return total_click;
	}


	public void setTotal_click(int total_click) {
		this.total_click = total_click;
	}


	public int getFraud_click() {
		return fraud_click;
	}


	public void setFraud_click(int fraud_click) {
		this.fraud_click = fraud_click;
	}


	public int getUs_click() {
		return us_click;
	}


	public void setUs_click(int us_click) {
		this.us_click = us_click;
	}


	@Override
	public String toString() {
		return "Offer [id=" + id + ", company_name=" + company_name
				+ ", website_url=" + website_url + ", campaign=" + campaign
				+ ", total_click=" + total_click + ", fraud_click="
				+ fraud_click + ", us_click=" + us_click + "]";
	}

	
	

}
