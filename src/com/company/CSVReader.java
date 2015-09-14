package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by isa on 9/14/15.
 */
public class CSVReader {
    public void run(String filePath) {
        BufferedReader bufferedReader = null;
        String line = "";
        String csvSplitBy = ",";
        LineProcessor lineProcessor = new LineProcessor();
        WeekProcessor weekProcessor = new WeekProcessor();
        
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineInfo = line.split(csvSplitBy);
                
                //not being used yet
//                weekProcessor.formatWeek();
                
                lineProcessor.processLine(lineInfo);
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Done");
    }

    public File getFile(String filePath) {
        return new File(filePath);
    }
}