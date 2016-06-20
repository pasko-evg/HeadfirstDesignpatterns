package headfirst.designpatterns.decorator.javaio;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;
        File file = new File("src\\com\\pei\\headfirst\\designpatterns\\decorator\\javaio\\test.txt");

        try {
            InputStream inputStream =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream(file)));
            while ((c = inputStream.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
