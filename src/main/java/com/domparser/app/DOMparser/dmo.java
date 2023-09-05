package com.domparser.app.DOMparser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class dmo
{
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {


        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

        DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();

        Document document = documentBuilder.parse(new File("complex.xml"));

        document.getDocumentElement().normalize();

        NodeList nodeList= document.getElementsByTagName("Employee");//root



        for (int i=0;i< nodeList.getLength();i++)
        {
            Node childnode = nodeList.item(0);




            if (childnode.getNodeType()==Node.ELEMENT_NODE)
            {
                Element element = (Element) childnode;

                System.out.println("Document Id :- "+element.getElementsByTagName("DocumentId").item(0).getTextContent());
                System.out.println("Name :- "+element.getElementsByTagName("Name").item(0).getTextContent());
                System.out.println("Department number :- "+element.getElementsByTagName("Department").item(0).getAttributes().item(0).getTextContent());
                System.out.println("Department Name:- "+element.getElementsByTagName("Department").item(0).getOwnerDocument().getDocumentElement().getElementsByTagName("Name").item(1).getTextContent());
                System.out.println("Department Location :-"+element.getElementsByTagName("Location").item(0).getOwnerDocument().getElementsByTagName("Country").item(0).getTextContent());
                System.out.println("Department "+element.getElementsByTagName("address").item(0).getOwnerDocument().getElementsByTagName("Type").item(0).getTextContent()+" address :-"+element.getElementsByTagName("address").item(0).getOwnerDocument().getElementsByTagName("Country").item(1).getTextContent());
                System.out.println("Department "+element.getElementsByTagName("address").item(1).getOwnerDocument().getElementsByTagName("Type").item(1).getTextContent()+" address :-"+element.getElementsByTagName("address").item(1).getOwnerDocument().getElementsByTagName("Country").item(2).getTextContent());
                System.out.println("Department "+element.getElementsByTagName("address").item(2).getOwnerDocument().getElementsByTagName("Type").item(2).getTextContent()+" address :-"+element.getElementsByTagName("address").item(2).getOwnerDocument().getElementsByTagName("Country").item(3).getTextContent());
                System.out.println("Referrals:- ");
                System.out.println("\t\t\tRef id :-"+element.getElementsByTagName("Referrals").item(0).getOwnerDocument().getElementsByTagName("ReferralId").item(0).getTextContent());
                System.out.println("\t\t\tName:-  "+element.getElementsByTagName("Referrals").item(1).getOwnerDocument().getElementsByTagName("Name").item(2).getTextContent());
                System.out.println("\t\t\tSkill:-  "+element.getElementsByTagName("Referrals").item(1).getOwnerDocument().getElementsByTagName("Skill").item(0).getTextContent());
                System.out.println("\t\t\t------------------------------");
                System.out.println("\t\t\tRef id :-"+element.getElementsByTagName("Referrals").item(0).getOwnerDocument().getElementsByTagName("ReferralId").item(1).getTextContent());
                System.out.println("\t\t\tName:-  "+element.getElementsByTagName("Referrals").item(2).getOwnerDocument().getElementsByTagName("Name").item(3).getTextContent());
                System.out.println("\t\t\tSkill:-  "+element.getElementsByTagName("Referrals").item(2).getOwnerDocument().getElementsByTagName("Skill").item(1).getTextContent());
                System.out.println("\t\t\t------------------------------");
                System.out.println("\t\t\tRef id :-"+element.getElementsByTagName("Referrals").item(0).getOwnerDocument().getElementsByTagName("ReferralId").item(2).getTextContent());
                System.out.println("\t\t\tName:-  "+element.getElementsByTagName("Referrals").item(3).getOwnerDocument().getElementsByTagName("Name").item(4).getTextContent());
                System.out.println("\t\t\tSkill:-  "+element.getElementsByTagName("Referrals").item(3).getOwnerDocument().getElementsByTagName("Skill").item(2).getTextContent());
                System.out.println("\t\t\t------------------------------");
                System.out.println("\t\t\tRef id :-"+element.getElementsByTagName("Referrals").item(0).getOwnerDocument().getElementsByTagName("ReferralId").item(3).getTextContent());
                System.out.println("\t\t\tName:-  "+element.getElementsByTagName("Referrals").item(3).getOwnerDocument().getElementsByTagName("Name").item(5).getTextContent());
                System.out.println("\t\t\tSkill:-  "+element.getElementsByTagName("Referrals").item(3).getOwnerDocument().getElementsByTagName("Skill").item(3).getTextContent());




            }
        }
    }
}
