import java.util.Iterator;
import java.util.TreeMap;

public class Demo {
    public static void main(String args[]) {
        // khoi tao map
        TreeMap<String, String> map = new TreeMap<String, String>();
        // them cac phan tu vao map
        map.put("Py", "Python");
        map.put("J", "Java");
        map.put("P", "PHP");
        map.put("C", "C++");
        // show TreeMap
        Iterator<String> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(map.get(itr.next()));
        }
    }
}
