import java.io.*;

public class BufferIOStream  {
    public static void main(String[] args) throws IOException{

        FileOutputStream fout = new FileOutputStream("D:\\OOPJavaClz\\src\\file2.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);

        String str = "We are studying buffer input and output stream in JAVA";
        byte[] b = str.getBytes();
        bout.write(b);

        System.out.println("The file has been modified");
        bout.flush();
        fout.close();

        FileInputStream fin = new FileInputStream("D:\\OOPJavaClz\\src\\file1.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        int i = 0;
        while ((i=bin.read())!= -1){
            System.out.print((char) i);
        }
        fin.close();
    }
}
