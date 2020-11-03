package com.crud.demo.model;

public class Topic {

private int id;
private String name;
private String decscription;

public Topic(int id, String name,String description) {
	this.id = id;
	this.name = name;
	this.decscription = description;
}
public Topic() {
	
}


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

public String getDecscription() {
	return decscription;
}

public void setDecscription(String decscription) {
	this.decscription = decscription;
}


	
}
