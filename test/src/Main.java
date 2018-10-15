import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream a = new FileInputStream("/etc/passwd");
        byte[] b = new byte[a.available()];
        a.read(b);
        System.out.println(new String(b));
    }
}
