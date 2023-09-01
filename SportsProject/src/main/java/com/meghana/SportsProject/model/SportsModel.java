package com.meghana.SportsProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sports")

public class SportsModel {
	@Id
	private int id;
	private String name;
	private String mailid;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public SportsModel(int id, String name, String mailid, String password) {
		super();
		this.id = id;
		this.name = name;
		this.mailid = mailid;
	}
	
	public SportsModel() {
		super();
	}
}
