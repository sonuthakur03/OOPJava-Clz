import java.util.*;

public class HashtableEx {
    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("key1", "Romeo");
        ht.put("key2", "Peter");

        Enumeration<String> name  = ht.keys();

        while (name.hasMoreElements()){
            String key = name.nextElement();
            System.out.println("Key: "+ key + "\tValue: " + ht.get(key));
        }
    }
}
