package com.company;

import org.junit.Test;

import java.io.File;

/**
 * Created by isa on 9/14/15.
 */
public class CSVReaderTest {
    
    @Test
    public void shouldReadFileHeader() {
        CSVReader csvReader = new CSVReader();
        File file = csvReader.getFile("/Users/isa/Documents/BSI/doutorado/test/resources/example.csv");

//        assertThat(file., is(equalTo("Data,retorno")));
        
    }
}