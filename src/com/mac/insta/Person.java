package com.mac.insta;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Person")
@XmlType(propOrder = { "firstName", "lastname", "nickname", "salary", "houseList", "cars"})
public class Person {
	
	private String firstName;
	private String lastname;
	private String nickname;
	private double salary;
	private List<House> houseList;
	//private List<Car> cars;
	private List<String> cars;

	public String getFirstName() {
		return firstName;
	}
	@XmlElement(name="firstname")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	@XmlElement
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getNickname() {
		return nickname;
	}
	@XmlElement
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public double getSalary() {
		return salary;
	}
	@XmlElement
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public List<House> getHouseList() {
		return houseList;
	}
	@XmlElement(name="house")
	public void setHouseList(List<House> houseList) {
		this.houseList = houseList;
	}
	public List<String> getCars() {
		return cars;
	}
	@XmlElement(name="cars")
	public void setCars(List<String> cars) {
		this.cars = cars;
	}

	

}
