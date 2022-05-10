package org.example;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class FromXmlToCsvTest {

    @Test
    public void testDoIt() throws FileNotFoundException {

        FromXmlToCsv XML_to_CSV = new FromXmlToCsv();
        String xmlFilePath = "src/points.xml";
        File file = new File(xmlFilePath);


        //GIVEN
        XML_to_CSV.setInput(xmlFilePath);

        //WHEN
        XML_to_CSV.doIt();

        //THEN
        assertTrue(file.exists());


    }
}