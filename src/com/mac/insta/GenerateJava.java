package com.mac.insta;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class GenerateJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// create JAXB context and initializing Marshaller
			JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			// specify the location and name of xml file to be read
			File XMLfile = new File("C:\\Froilan\\Person2.xml");

			// this will create Java object - country from the XML file
			Person p = (Person) jaxbUnmarshaller.unmarshal(XMLfile);

			System.out.println("First Name: "+p.getFirstName());
			System.out.println("Last Name: "+p.getLastname());
			System.out.println("Last Name: "+p.getNickname());
			System.out.println("Last Name: "+p.getSalary());

			ArrayList<House> houseList=(ArrayList<House>) p.getHouseList();

			for(House h:houseList) {
				System.out.println("house type: "+h.getType());
				System.out.println("house unit: "+h.getUnit());
				System.out.println("house street: "+h.getStreet());
				System.out.println("house postal: "+h.getPostal());
			}
			
			System.out.println("car: "+p.getCars());

			/*ArrayList<Car> carList=(ArrayList<Car>) p.getCars();

			for(Car c:carList) {
				System.out.println("car: "+c.getName());
			}*/

		} catch (JAXBException e) {
			// some exception occured
			e.printStackTrace();
		}
	}

}
