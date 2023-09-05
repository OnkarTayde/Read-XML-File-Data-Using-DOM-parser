package com.domparser.app.saxParser;

import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
import java.io.*;

public class SaxParserDemo extends DefaultHandler
{
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("start document");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);

        if (qName.equals("Country"))
        {
            String country=attributes.getValue("Country");
            System.out.println("Country"+country);
        }
        System.out.print(qName+" :- ");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        //System.out.print(new String(ch,start,length));

    }
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);

        //System.out.println(uri+""+""+localName+""+qName);
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();

        System.out.println("end document");
    }

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        SAXParser parser =SAXParserFactory.newInstance().newSAXParser();

        parser.parse(new File("complex.xml"),new SaxParserDemo());

    }
}
