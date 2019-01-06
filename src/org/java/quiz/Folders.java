package org.java.quiz;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/**
 * Solution for a function folderNames, which accepts a string containing an XML
 * file that specifies folder structure and returns all folder names that start
 * with a letter.
 * 
 * @author Yavuz Tas
 *
 */
public class Folders {

	public static Collection<String> folderNames(String xml, char letter) throws Exception {

		String prefix = String.valueOf(letter);
		List<String> found = new ArrayList<>();

		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		InputSource doc = new InputSource(new StringReader(xml));
		Document xmlDocument = builder.parse(doc);

		NodeList nodeList = xmlDocument.getElementsByTagName("folder");
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node item = nodeList.item(i);
			Node attr = item.getAttributes().getNamedItem("name");

			if (attr != null && attr.getNodeValue().startsWith(prefix)) {
				found.add(attr.getNodeValue());
			}
		}

		return found;
	}

	public static void main(String[] args) throws Exception {
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "<folder name=\"c\">" + "<folder name=\"program files\">"
				+ "<folder name=\"uninstall information\" />" + "</folder>" + "<folder name=\"users\" />" + "</folder>";

		Collection<String> names = folderNames(xml, 'u');
		for (String name : names) {
			System.out.println(name);
		}
	}
}
