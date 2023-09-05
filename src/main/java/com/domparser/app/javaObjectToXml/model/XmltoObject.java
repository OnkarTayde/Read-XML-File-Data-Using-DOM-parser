package com.domparser.app.javaObjectToXml.model;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.io.StringReader;

public class XmltoObject {

    public static void main(String[] args) throws JAXBException {


        //Unmarshaller :- XML to JAva Object


        File file =new File("D:\\Projects\\Read-XML-File-Data-Using-DOM-parser\\emp.xml");

        String xmlStr ="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<employee>\n" +
                "    <firstname>onkar</firstname>\n" +
                "    <id>101</id>\n" +
                "    <lastname>tayde</lastname>\n" +
                "    <salary>2000</salary>\n" +
                "</employee>";

        JAXBContext  context = JAXBContext.newInstance(Employee.class);


        Unmarshaller unmarshaller = context.createUnmarshaller();
          Employee employee=(Employee) unmarshaller.unmarshal(file);

          Employee empbyString=(Employee) unmarshaller.unmarshal(new StringReader(xmlStr));


        System.out.println("Unmarshaller\n");

        System.out.println("below o/p is fetched from XMl file\n"+employee.getFirstname());

        System.out.println("below o/p is fetched from xml String\n"+empbyString.getLastname());


    }
}
