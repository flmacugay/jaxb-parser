package com.mac.insta;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class GenerateXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  try {
			  House h=new House();
			  h.setUnit("7");
			  h.setStreet("S road");
			  h.setType("mailing");
			  h.setPostal(7777);
			  
			  House hr=new House();
			  hr.setUnit("7");
			  hr.setStreet("S road");
			  hr.setType("residential");
			  hr.setPostal(7777);
			  
			  List<House> hL=new ArrayList<>();
			  hL.add(h);
			  hL.add(hr);
			  
			  List<String> cars=new ArrayList<>();
			  cars.add("toyota");
			  cars.add("mazda");
			  cars.add("nissan");
			  
			  Person p=new Person();
			  p.setFirstName("Froi");
			  p.setLastname("Mac");
			  p.setNickname("Lou");
			  p.setSalary(111111.1);
			  p.setHouseList(hL);
			  p.setCars(cars);
			  

			   // create JAXB context and initializing Marshaller
			   JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
			   Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			   // for getting nice formatted output
			   jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			   //specify the location and name of xml file to be created
			   File XMLfile = new File("C:\\Froilan\\Person2.xml");

			   // Writing to XML file
			   jaxbMarshaller.marshal(p, XMLfile); 
			   // Writing to console
			   jaxbMarshaller.marshal(p, System.out); 

			  } catch (JAXBException e) {
			   // some exception occured
			   e.printStackTrace();
			  }

	}

}
