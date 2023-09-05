package com.domparser.app;

import com.domparser.app.javaObjectToXml.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class ReadXmlFileDataUsingDomParserApplication {

	/* steps
	   Get the Document Builder
	   Get Document
	   Normalize the xml structure
	   get all the element by the tag name
	 */


	public static void main(String[] args) throws Exception {
		SpringApplication.run(ReadXmlFileDataUsingDomParserApplication.class, args);

		Employee employee= new Employee();

		ArrayList<String>list = (ArrayList<String>) Arrays.asList("onkar","raj");
		employee.setList(list);

		//Get the Document Builder
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder= builderFactory.newDocumentBuilder();
		// get Document
		Document document = documentBuilder.parse(new File("Employee.xml"));
		// Normalize the xml structure
		document.getDocumentElement().normalize();

		//----------------------------------------------------------------------------
		//get all the element by the tag name
		NodeList nodeList = document.getElementsByTagName("Employee");

		for (int i=0;i< nodeList.getLength();i++)
		{
			//getAllEmployee

			Node node= nodeList.item(i);

			if (node.getNodeType()==Node.ELEMENT_NODE)
			{

				Element empElement = (Element) node;
				int id= Integer.parseInt(empElement.getElementsByTagName("Id").item(0).getTextContent());
				String firstname=empElement.getElementsByTagName("Firstname").item(0).getTextContent();
				String lastname=empElement.getElementsByTagName("Lastname").item(0).getTextContent();
				int age= Integer.parseInt(empElement.getElementsByTagName("Age").item(0).getTextContent());
				int salary= Integer.parseInt(empElement.getElementsByTagName("Salary").item(0).getTextContent());
				System.out.println("Id :- "+id);
				System.out.println("First Name :- "+firstname);
				System.out.println("Last Name :- "+lastname);
				System.out.println("Age :- "+age);
				System.out.println("Salary :- "+salary);
				System.out.println("done");
				System.out.println("done...... 2");
				System.out.println("done...... 3");
				System.out.println("done...... 4");
			}
		}








	}

}
