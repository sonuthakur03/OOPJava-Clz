import java.io.*;

public class FileOutStreamEx {
    public static void main(String[] args) throws IOException{
        FileOutputStream fout = new FileOutputStream("D:\\OOPJavaClz\\src\\file1.txt");
        String str = "We are studying file input and output stream in JAVA";
        byte[] b = str.getBytes();
        fout.write(b);

        System.out.println("The file has been modified");
        fout.close();
    }
}
