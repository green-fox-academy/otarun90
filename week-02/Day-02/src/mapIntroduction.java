import java.util.HashMap;
import java.util.Map;

public class mapIntroduction {

    public static void main(String[] args) {

        Map<Integer, String> abc = new HashMap<>();

        System.out.println(abc.isEmpty() + "\n");

        abc.put(97, "a");
        abc.put(98, "b");
        abc.put(99, "c");
        abc.put(65, "A");
        abc.put(66, "B");
        abc.put(67, "C");

        System.out.println(abc.keySet() + "\n");

        System.out.println(abc.values() + "\n");

        abc.put(68, "D");

        System.out.println(abc.size() + "\n");

        System.out.println(abc.get(99) + "\n");

        abc.remove(97);

        System.out.println(abc.containsKey(100) + "\n");

        abc.clear();
        System.out.println(abc.size());
    }
}

