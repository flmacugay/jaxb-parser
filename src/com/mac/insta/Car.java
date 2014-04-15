package com.mac.insta;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace="com.mac.insta.Person")
public class Car {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
