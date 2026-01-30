
package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.junit.filehandling.FileProcessor;

import java.io.IOException;

public class FileProcessorTest {

    @Test
    void testFileWriteRead() throws IOException {
        FileProcessor fp = new FileProcessor();
        fp.writeToFile("test.txt", "Hello");
        assertEquals("Hello", fp.readFromFile("test.txt"));
    }

    @Test
    void testFileNotFound() {
        FileProcessor fp = new FileProcessor();
        assertThrows(IOException.class, () -> fp.readFromFile("abc.txt"));
    }
}
