package org.example;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class FromXMLToMemoryArray implements Step {

    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> point = new ArrayList<>();
    ArrayList<String> concatenatedResult = new ArrayList<>();
    private String inputFilePath = "src/points.xml";

    @Override
    public void setInput(String input) throws FileNotFoundException {
        this.inputFilePath = input;
    }

    @Override
    public void getOutput() {
//        for (int i = 0; i < name.size(); i++) {
//            System.out.println(name.get(i) + ":");
//            System.out.println(point.get(i));
//        }

//        for (int i = 0; i < concatenatedResult.size(); i++) {
//            System.out.println(concatenatedResult.get(i));
//        }

        Consumer<List> print = list -> list.forEach(value -> System.out.println(value));
        print.accept(concatenatedResult);

    }

    public void concat(List<String> input1, List<String> input2) {
        for (int i = 0; i < name.size(); i++) {
            concatenatedResult.add(input1.get(i));
            concatenatedResult.add(input2.get(i));
        }
    }

    @Override
    public void doIt() throws ParserConfigurationException, IOException, SAXException {
        File xmlFile = new File(inputFilePath);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = factory.newDocumentBuilder();

        Document doc = dBuilder.parse(xmlFile);
        doc.getDocumentElement().normalize();
        Read(doc);
        concat(name, point);
    }

    // xml f??jl beolvas??sa majd az adatok elt??rol??sa egy t??mbben, majd a t??mb tartalm??nak ki??r??sa console-ra

    public void Read(Document doc) {

        NodeList nList = doc.getElementsByTagName("item");

        for (int i = 0; i < nList.getLength(); i++) {
            Node node = nList.item(i);
            Element element = (Element) node;

            if (node.getNodeType() == Node.ELEMENT_NODE) {

                name.add(element.getElementsByTagName("name").item(0).getTextContent());
                point.add(element.getElementsByTagName("point").item(0).getTextContent());

            }
        }


    }
}
