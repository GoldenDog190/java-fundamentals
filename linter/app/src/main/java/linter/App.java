/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import static linter.App.readFile;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

// app compiling for the gates.js
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        readFile("app/src/main/resources/gates.js");
    }
    public static void readFile(String stringFilePath) throws FileNotFoundException {
        File gatesFile = new File(stringFilePath);
        Scanner gatesScanner;
        try{
            gatesScanner= new Scanner(gatesFile);
        } catch(FileNotFoundException){
            System.out.println("Sorry, this is currently not working, will be fixed soon");
            return;
        }
           String result = "";
        while(gatesScanner.hasNext()){
            String line = gatesScanner.nextLine();
            if (line.isEmpty()) continue;
            if (line.endsWith("{") || line.endsWith("}")) continue;
            if(line.contains("if") || line.contains("else")) continue;
            String lintError = "Line 3: Missing semicolon.";
            System.out.println(line);

        }

    }
}
