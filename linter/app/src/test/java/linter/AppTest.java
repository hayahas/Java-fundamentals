/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void checkFile_shouldReturnNoErrorsInJsFile() throws IOException {
        App sut = new App();
        Path filePath = Files.createTempFile("test", ".js");
        String fileContent = "function foo() {\n" +
                "    console.log('Hello, world!');\n" +
                "}";
        Files.write(filePath, fileContent.getBytes());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
       sut.checkFile(filePath);
        System.setOut(System.out);
        String result = "";
        assertEquals(result, outputStream.toString().trim());

    }

    @Test void checkFile_shouldReturnOneErrorInJsFile() throws IOException {
        App sut = new App();
        Path filePath = Files.createTempFile("test", ".js");
        String fileContent = "function foo() {\n" +
                "    console.log('Hello, world!')\n" +
                "}";
        Files.write(filePath, fileContent.getBytes());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        sut.checkFile(filePath);
        System.setOut(System.out);
        String result = "Line 2: Missing semicolon.";
        assertEquals(result, outputStream.toString().trim());

    }

    @Test void checkFile_shouldReturnFewErrorsInJsFile() throws IOException {
        App sut = new App();
        Path filePath = Files.createTempFile("test", ".js");
        String fileContent = "function foo() \n" +
                "    console.log('Hello, world!')\n" +
                "}";
        Files.write(filePath, fileContent.getBytes());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        sut.checkFile(filePath);
        System.setOut(System.out);
        String result = "Line 1: Missing semicolon.\nLine 2: Missing semicolon.";

        assertEquals(result, outputStream.toString().replaceAll("\r\n", "\n").trim());
    }

    @Test void checkFile_shouldReturnManyErrorsInJsFile() throws IOException {
        App sut = new App();
        Path filePath = Files.createTempFile("test", ".js");
        String fileContent = "function foo() \n" +
                "    console.log('Hello, world!')\n" +
                "    console.log('Hello, world!');\n" +
                "\n" +
                "    console.log('Hello, world!')\n" +
                "    console.log('Hello, world!')\n" ;
        Files.write(filePath, fileContent.getBytes());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        sut.checkFile(filePath);
        System.setOut(System.out);
        String result = "Line 1: Missing semicolon.\nLine 2: Missing semicolon.\nLine 5: Missing semicolon.\nLine 6: Missing semicolon.";

        assertEquals(result, outputStream.toString().replaceAll("\r\n", "\n").trim());
    }


}
