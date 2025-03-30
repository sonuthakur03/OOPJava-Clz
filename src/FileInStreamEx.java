import java.io.FileInputStream;
import java.io.IOException;

public class FileInStreamEx {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("D:\\OOPJavaClz\\src\\file1.txt");
        int i = 0;
        while ((i=fin.read())!= -1){
            System.out.print((char) i);
        }
        fin.close();
    }
}
