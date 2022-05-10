package org.example;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Provider;
import java.util.function.Consumer;

public class MainFrame {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        Step XML_to_CSV = new FromXmlToCsv();
        Step XML_to_MemoryArray = new FromXMLToMemoryArray();
        Step MemoryArray_to_CSV = new FromMemoryArrayToCSV();
        String inputXML;

        XML_to_CSV.setInput("src/points.xml");
        XML_to_CSV.doIt();


        XML_to_MemoryArray.setInput("src/points.xml");
        XML_to_MemoryArray.doIt();
        XML_to_MemoryArray.getOutput();

        MemoryArray_to_CSV.setInput("XXXXX XXXXX;8.0;Nagy Andras;6.0;Kovacs Memory;100000.0");
        MemoryArray_to_CSV.doIt();

        // a Consumer egy funkcionális interfész aminek egyetlen bemenete van és nincs kimenete
        // accept: egyetlen T argumentumot fogad


    }
}
