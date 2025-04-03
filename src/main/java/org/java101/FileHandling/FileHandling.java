// Read & Write files using File and BufferedReader.

package org.java101.FileHandling;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
        writer.write("Hello, Java!");
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        System.out.println(reader.readLine());
        reader.close();
    }
}

