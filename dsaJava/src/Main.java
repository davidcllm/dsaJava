import java.util.*;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>(10);

        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");

        //table.remove(777);

        System.out.println(table.get(100));

        for (String key : table.keySet()) {
            System.out.println(key.hashCode() + "\t" + key + "\t" + table.get(key));
        }
    }
}