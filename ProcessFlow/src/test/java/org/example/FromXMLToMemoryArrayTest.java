package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FromXMLToMemoryArrayTest {

    @Test
    public void testDoIt() throws IOException, ParserConfigurationException, SAXException {

        FromXMLToMemoryArray XML_to_MemoryArray = new FromXMLToMemoryArray();
        String xmlFilePath = "src/points.xml";

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        //GIVEN
        XML_to_MemoryArray.setInput(xmlFilePath);
        String expectedOutput = "Kiss Bela:\n" +
                "8.0\n" +
                "Nagy Andras:\n" +
                "6.0\n" +
                "Kovacs Jozsef:\n" +
                "6.0";

        //WHEN
        XML_to_MemoryArray.doIt();

        //THEN
        XML_to_MemoryArray.getOutput();

        //When you do System.setOut(OutputStream),
        // whatever the application writes to the console (using System.out.printX()) statements,
        // instead get written to the outputStream you pass
        String output = new String(outContent.toByteArray());
        Assert.assertTrue(output.contains(expectedOutput));


    }

}