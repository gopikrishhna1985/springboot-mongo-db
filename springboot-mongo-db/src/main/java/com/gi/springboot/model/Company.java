package com.gi.springboot.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "company")
public class Company {

	private String name;
	private String website;
	private String headQuarters;

	public Company() {

	}

	public Company(String name, String website, String headQuarters) {
		super();
		this.name = name;
		this.website = website;
		this.headQuarters = headQuarters;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getHeadQuarters() {
		return headQuarters;
	}

	public void setHeadQuarters(String headQuarters) {
		this.headQuarters = headQuarters;
	}

}
