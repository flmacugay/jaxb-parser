package com.mac.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

//Below statement means that class 'Country.java' is the root-element of our example
@XmlRootElement(namespace = "com.mac.jaxb.Country")
public class State {

	private String stateName;
	long statePopulation;
	
	@XmlAttribute
	int id;

	public State()
	{

	}
	public State(String stateName, long statePopulation, int id) {
		super();
		this.stateName = stateName;
		this.statePopulation = statePopulation;
		this.id=id;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public long getStatePopulation() {
		return statePopulation;
	}

	public void setStatePopulation(long statePopulation) {
		this.statePopulation = statePopulation;
	}
}
