package model;

import java.util.Date;

public abstract class TypeGame {
	
	private String name;
	private Date date;
	private String location;
	private int attendence; 
	private int maybe;
	private int decline;
	
	public TypeGame(String n, Date d, String l){
		name = n;
		date = d;
		location = l;
		attendence = 0;
		maybe = 0;
		decline = 0;
	}
	
	public String getName(){
		return name;
	}

	public Date getDate() {
		return date;
	}

	public String getLocation() {
		return location;
	}

	public int getAttendence() {
		return attendence;
	}

	public int getMaybe() {
		return maybe;
	}

	public int getDecline() {
		return decline;
	}
	
	public void incAttend(){
		attendence++;
	}
	
	public void incMaybe(){
		maybe++;
	}
	
	public void incDecline(){
		decline++;
	}

}
