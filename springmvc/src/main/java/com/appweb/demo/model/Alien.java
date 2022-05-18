package com.appweb.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Alien {
	
	@Id
	private int aId;
	private String aName;
	private int aMarks;
	
	
	public Alien() {
		super();
	}
	
	public int getaMarks() {
		return aMarks;
	}
	public void setaMarks(int aMarks) {
		this.aMarks = aMarks;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	
	@Override
	public String toString() {
		return "Alien [aId=" + aId + ", aName=" + aName + "]";
	}
	
}
