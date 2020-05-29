package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class GameReader {

    public static FileReader readFile(String filepath) {
        File file = new File(filepath);
        FileReader fileReader;
        try {
            fileReader = new FileReader(file);
            return fileReader;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }


}
