package se.yrgo.schedule;

import javax.xml.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class XMLFormatter implements Formatter{


    @Override
    public String format(List<Assignment> assignments) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element schedule = doc.createElement("Schedule");

            return null;
        }
    catch (ParserConfigurationException e){
            return "XML error";
    }
    }
}
