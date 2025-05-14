package org.java101.JavaDocs;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// use this command to generate html documents --> javadoc -d docs JavaDocsExample.java

public class JavaDocsExample {
    public static void main(String[] args) throws IOException {
        org.java101.FileHandling.FileHandling fh = new org.java101.FileHandling.FileHandling();
        fh.createFileUsingFileClass();
        fh.checkFileExistsUsingFileClass();
        fh.deleteFileUsingFileClass();
        fh.readFileUsingScannerClass();
        fh.writeFileUsingFileWriterClass();
        fh.appendFileUsingFileWriterClass();
        fh.readFileUsingBufferReader();
        fh.writeFileUsingBufferWriter();
        fh.readAllLinesUsingNioFilesClass();
        fh.writeAllLinesUsingNioFilesClass();
        fh.copyFileUsingFilesClass();
    }

    public void createFileUsingFileClass(){
        try {
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void checkFileExistsUsingFileClass(){
        File file = new File("example.txt");
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }
    }

    public void deleteFileUsingFileClass(){
        File file = new File("example.txt");
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    public void readFileUsingScannerClass(){
        try {
            File file = new File("example.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }

    public void writeFileUsingFileWriterClass(){
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello Java File Writing!\nThis is second line.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing.");
            e.printStackTrace();
        }
    }

    public void appendFileUsingFileWriterClass(){
        try {
            FileWriter writer = new FileWriter("example.txt", true); // true = append mode
            writer.write("\nAppended line.");
            writer.close();
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending.");
            e.printStackTrace();
        }
    }

    // Efficient class for large file read operations
    public void readFileUsingBufferReader(){
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }

    // Efficient class for large file write operations
    public void writeFileUsingBufferWriter(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt", true))) {
            writer.newLine();
            writer.write("Buffered writer append.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
            e.printStackTrace();
        }
    }

    // read all lines sing java.nio.file - introduced from java 7+ versions
    public void readAllLinesUsingNioFilesClass(){
        try {
            List<String> lines = Files.readAllLines(Paths.get("example.txt"));
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // write all lines sing java.nio.file
    public void writeAllLinesUsingNioFilesClass(){
        try {
            Files.write(Paths.get("example.txt"), Arrays.asList("First line", "Second line"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // copy file using java.nio.file
    public void copyFileUsingFilesClass(){
        try {
            Path source = Paths.get("example.txt");
            Path destination = Paths.get("copy_example.txt");
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


