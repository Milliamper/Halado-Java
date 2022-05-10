package org.example;

import com.opencsv.CSVWriter;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FromMemoryArrayToCSV implements Step {

    private final String csvFilePath = "src/points.csv";
    private ArrayList<String> data = new ArrayList<>();
    private String inputString;

    @Override
    public void setInput(String input) throws FileNotFoundException {
        this.inputString = input;
    }

    @Override
    public void getOutput() {

    }

    @Override
    public void doIt() throws ParserConfigurationException, IOException, SAXException {
        separateString();
        writeMemoryArrayToCSV();
    }

    public void separateString() {
        data = new ArrayList<>(Arrays.asList(inputString.split(";")));
    }

    public void writeMemoryArrayToCSV() throws FileNotFoundException {

        try (PrintWriter writer = new PrintWriter(csvFilePath)) {

            StringBuilder sb = new StringBuilder();

            ArrayList<String> name = new ArrayList<>();
            ArrayList<String> point = new ArrayList<>();

            for (int i = 0; i < data.size(); i++) {
                if (i % 2 == 0) {
                    name.add(data.get(i));
                } else {
                    point.add(data.get(i));
                }
            }

            for (int i = 0; i < name.size(); i++) {
                sb.append(name.get(i));
                sb.append(';');
                sb.append(point.get(i));
                sb.append('\n');
            }

            writer.write(sb.toString());

            System.out.println("Writing from memory array -> CSV is done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
