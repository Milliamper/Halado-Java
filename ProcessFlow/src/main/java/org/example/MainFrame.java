package org.example;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainFrame {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        Step step = new FromXmlToCsv();
        step.setInput("src/points.xml");
        step.doIt();

        Step stepXmlToMemoryArray = new FromXMLToMemoryArray();
        stepXmlToMemoryArray.setInput("src/points.xml");
        stepXmlToMemoryArray.doIt();
        stepXmlToMemoryArray.getOutput();

        Step stepMemoryArrayToCSV = new FromMemoryArrayToCSV();
        stepMemoryArrayToCSV.setInput("Kiss Bela;8.0;Nagy Andras;6.0;Kovacs Memory;100000.0");
        stepMemoryArrayToCSV.doIt();
    }
}
