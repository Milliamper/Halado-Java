package org.example;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface Step {

    void setInput(String input) throws FileNotFoundException;

    void getOutput();

    void doIt() throws ParserConfigurationException, IOException, SAXException;


}
