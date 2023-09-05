package com.domparser.app.javaObjectToXml.model;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;

public class mainjaxb {

    public static void main(String[] args) throws JAXBException {


        Employee employee = new Employee(101,"onkar","tayde",2000);

        System.out.println(employee.getId()+" ");
        System.out.println(employee.getFirstname()+" ");
        System.out.println(employee.getLastname()+" ");
        System.out.println(employee.getSalary()+" ");

        //Object to xml file
        JAXBContext context= JAXBContext.newInstance(Employee.class);

        Marshaller marshaller= context.createMarshaller();

        File output =new File("D:\\Projects\\Read-XML-File-Data-Using-DOM-parser\\emp.xml");
        marshaller.marshal(employee,output);

    }
}
