package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface CsvReaderAdapter {
    String[] readNext() throws IOException;

    void setInputPath(String inputFilePath) throws FileNotFoundException;
}
