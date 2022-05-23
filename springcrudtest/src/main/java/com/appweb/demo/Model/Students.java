package com.appweb.demo.Model;

import javax.persistence.*;

@Entity
public class Students {

	@Id  
	int sId;
	String sName;
	String sDept;
	int sPercent;
	
	
	public Students(){
		
	}
	
	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsDept() {
		return sDept;
	}

	public void setsDept(String sDept) {
		this.sDept = sDept;
	}

	public int getsPercent() {
		return sPercent;
	}

	public void setsPercent(int sPercent) {
		this.sPercent = sPercent;
	}

	public int getsId(){
		return sId;
	}
	
	public void setsId(int sId){
		this.sId = sId;
	}
	
}
