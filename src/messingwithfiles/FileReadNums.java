package messingwithfiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileReadNums {
    public static void main(String[] args) {
        FileInputStream fileByteStream = null; // File input stream
        Scanner inFS = null;                   // Scanner object
        int fileNum1;                          // Data value from file
        int fileNum2;                          // Data value from file
        try {
            // Try to open file
            System.out.println("Opening file myfile.txt.");
            fileByteStream = new FileInputStream("src/messingwithfiles/myfile.txt");
            inFS = new Scanner(fileByteStream);
            // File is open and valid if we got this far (otherwise exception thrown)
            // myfile.txt should contain two integers, else problems
            fileNum1 = inFS.nextInt();
            fileNum2 = inFS.nextInt();
            // Output values read from file
            System.out.println("num1: " + fileNum1);
            System.out.println("num2: " + fileNum2);
        } catch (IOException e) {
            // Handle IOException
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exception
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Done with file, so try to close it
            try {
                if (fileByteStream != null) {
                    fileByteStream.close(); // close() may throw IOException if fails
                }
                if (inFS != null) {
                    inFS.close();           // close() may throw IOException if fails
                }
            } catch (IOException e) {
                // Handle IOException
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println("Closing file myfile.txt.");
        }
    }
}