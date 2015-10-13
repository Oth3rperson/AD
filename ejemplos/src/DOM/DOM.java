package DOM;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOM {
	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setIgnoringComments(true);
		factory.setIgnoringElementContentWhitespace(true);

		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			File f;
			f = new File("cuentas.xml");
			Document doc = builder.parse(f);
			Node node = doc.getFirstChild(); // raiz
			NodeList lista = node.getChildNodes();
			for (int i = 0; i < lista.getLength(); i++) {
				node = lista.item(i);// cuenta
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					NodeList listaTitulares = node.getChildNodes();
					for (int j = 0; j < listaTitulares.getLength(); j++) {
						node = listaTitulares.item(j);// titular
						if (node.getNodeType() == Node.ELEMENT_NODE) {
							NodeList listaHijos = node.getChildNodes();
							for (int k = 0; k < listaHijos.getLength(); k++) {
								node = listaHijos.item(k);
								if(node.getNodeType() == Node.ELEMENT_NODE){
									System.out.print(node.getNodeName()+" ");
									NodeList listaFinal = node.getChildNodes();
									System.out.println(listaFinal.item(0).getNodeValue());
								}
							}
						}
					}
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
