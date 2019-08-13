package com.colection.Clasess;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlExampleShopingList {
	
	public static void print(String list) {
		System.out.println(list);
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
		
		String filePath = "Records/shopinglist.xml";

		Document xmlFile = getXmlFileDocument(filePath);

		if (xmlFile != null) {
			
			NodeList nodeList = xmlFile.getDocumentElement().getChildNodes();

			for (int i = 0; i < nodeList.getLength(); i++) {

				Node node = nodeList.item(i);

				if (node.getNodeType() == Node.ELEMENT_NODE) {

					Element element = (Element) node;
					
					
					String name = element.getElementsByTagName("name").item(0).getTextContent();
					print (name);
					String amount = element.getElementsByTagName("amount").item(0).getTextContent();
					print (amount);
					String price = element.getElementsByTagName("price").item(0).getTextContent();
					print (price);
		
					
				}
			}
		} else {
			System.out.println("File not found");
		}

	}

	}


