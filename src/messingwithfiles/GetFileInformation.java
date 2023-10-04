package messingwithfiles;
import java.io.File;

public class GetFileInformation {
    public static void main(String[] args) {
        File myFile = new File("README.md");
        if (myFile.exists()) {
            System.out.println("File Name: " + myFile.getName());
            System.out.println("Absolute Path: " + myFile.getAbsolutePath());
            System.out.println("Writeable: " + myFile.canWrite());
            System.out.println("Readable: " + myFile.canRead());
            System.out.println("Approximate File Size: " + printFileSize(myFile));
        }
        else {
            System.out.println("The file does not exist.");
        }
    }

    public static String printFileSize(File file) {
        if (file.length() >= 1000) {
            return (file.length() / 1000) + " KB";
        }
        else if (file.length() >= 1000000) {
            return (file.length() / 1000000) + " MB";
        }
        else if (file.length() >= 1000000000) {
            return (file.length() / 1000000000) + " GB";
        }
        else {
            return file.length() + " bytes";
        }
    }
}
