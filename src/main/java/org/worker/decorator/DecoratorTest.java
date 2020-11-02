package org.worker.decorator;

import java.io.*;

public class DecoratorTest {
    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("DecoratorTest.java");

            BufferedInputStream bs = new BufferedInputStream(in);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
