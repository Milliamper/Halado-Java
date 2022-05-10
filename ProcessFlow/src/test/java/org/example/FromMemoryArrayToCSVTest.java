package org.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mock;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class FromMemoryArrayToCSVTest extends TestCase {

    @Test
    public void testDoIt() throws IOException, ParserConfigurationException, SAXException {

        FromMemoryArrayToCSV MemoryArray_to_CSV = new FromMemoryArrayToCSV();
        String textInput = "XXXXX XXXXX;8.0;Nagy Andras;6.0;Kovacs Memory;100000.0";
        String csvFilePath = "src/points.csv";
        File file = new File(csvFilePath);

        //Step step;
        // GIVEN
        //when(step.setInput(textInput)).thenReturn(MemoryArray_to_CSV.doIt(););


        //GIVEN
        MemoryArray_to_CSV.setInput(textInput);

        //WHEN
        MemoryArray_to_CSV.doIt();

        //THEN
        assertTrue(file.exists());


    }
}