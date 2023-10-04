package messingwithfiles;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromPicture {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fileByteStream = new FileInputStream("src/messingwithfiles/Logo2-mini.png");
            int byteValue;
            while ((byteValue = fileByteStream.read()) != -1) {
                System.out.print(byteValue + " ");
            }
            fileByteStream.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
