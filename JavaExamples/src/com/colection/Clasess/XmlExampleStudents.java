package com.colection.Clasess;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlExampleStudents {

	public static void print(String msg) {
		System.out.println(msg);
	}

	public static Document getXmlFileDocument(String path) {
		Document xmlFile = null;

		File file = new File(path);

		if (file.exists()) {

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

			try {

				DocumentBuilder documentBuilder = factory.newDocumentBuilder();

				xmlFile = documentBuilder.parse(file);

			} catch (Exception e) {

				e.printStackTrace();
			}

		}

		return xmlFile;
	}

	public static void main(String[] args) {

		String filePath = "Records/students.xml";

		Document xmlFile = getXmlFileDocument(filePath);

		if (xmlFile != null) {
			
			NodeList nodeList = xmlFile.getDocumentElement().getChildNodes();

			for (int i = 0; i < nodeList.getLength(); i++) {

				Node node = nodeList.item(i);

				if (node.getNodeType() == Node.ELEMENT_NODE) {

					Element element = (Element) node;

					String id = element.getElementsByTagName("id").item(0).getTextContent();
					print(id);

					String name = element.getElementsByTagName("firstname").item(0).getTextContent();
					print(name);
					
					String surname = element.getElementsByTagName("surname").item(0).getTextContent();
					print (surname);

					String email = element.getElementsByTagName("email").item(0).getTextContent();
					print(email);
					
					String phonenumber = element.getElementsByTagName("phonenumber").item(0).getTextContent();
					print (phonenumber);
				}
			}
		} else {
			System.out.println("File not found");
		}

	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * File file = new File("Records/students.xml");
	 * 
	 * if(file.exists()){
	 * 
	 * //System.out.println(file.getName());
	 * 
	 * DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	 * 
	 * try {
	 * 
	 * DocumentBuilder documentBuilder = factory.newDocumentBuilder();
	 * 
	 * Document xmlFile = documentBuilder.parse(file);
	 * 
	 * // print("Main node is = " + xmlFile.getDocumentElement().getNodeName());
	 * 
	 * NodeList nodeList = xmlFile.getDocumentElement().getChildNodes();
	 * 
	 * for (int i = 0; i < nodeList.getLength(); i++) {
	 * 
	 * Node node = nodeList.item(i);
	 * 
	 * if(node.getNodeType() == Node.ELEMENT_NODE) {
	 * 
	 * Element element = (Element) node;
	 * 
	 * String id = element.getElementsByTagName("id").item(0).getTextContent();
	 * print(id);
	 * 
	 * String name =
	 * element.getElementsByTagName("firstname").item(0).getTextContent();
	 * print(name);
	 * 
	 * String email =
	 * element.getElementsByTagName("email").item(0).getTextContent(); print(email);
	 * } } } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * 
	 * } else { System.out.println("File does not exist"); }
	 * 
	 * 
	 * 
	 * }
	 * 
	 */

}
