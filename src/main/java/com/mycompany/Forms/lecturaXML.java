package com.mycompany.Forms;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class lecturaXML {
    
    public static void leerXml(String path){
        
        try {
            DocumentBuilderFactory constructor = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder lector = constructor.newDocumentBuilder();
            
            Document document= lector.parse(new File(path));
            
            document.getDocumentElement().normalize(); //Limpia espacios en blanco.
            
            NodeList nodos = document.getElementsByTagName("persona");
            
            for (int i = 0; i < nodos.getLength(); i++) {
                Node nodo = nodos.item(i);
                
                if (nodo.getNodeType() == Node.ATTRIBUTE_NODE) { //Validando si el nodo tiene cosas adentro, sino, lo ignora para que no truene.
                    Element elemento = (Element) nodo; // Casteando para convertir en Element.
                    String nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent();
                    String apellido = elemento.getElementsByTagName("apellido").item(0).getTextContent();
                    int edad = Integer.parseInt(elemento.getElementsByTagName("edad").item(0).getTextContent());
                    
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Apellido: " + apellido);
                    System.out.println("Edad: " + edad);
                    System.out.println("---------------------");
                }
            }
            
        } catch (Exception ex) {
            Logger.getLogger(lecturaXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
