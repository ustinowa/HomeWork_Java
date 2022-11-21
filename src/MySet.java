import java.util.HashMap;
import java.util.Map;

public class MySet {
    private static final Object obj = new Object();
    Map<Person, Object> items = new HashMap<>();

//    public void add(Person person){
//        items.putIfAbsent(person,obj);
//        Set<Person> s = new HashSet<>();
//        s.add(person);
//    }

    public boolean add(Person person){
        return items.putIfAbsent(person,obj) == null;

    }
}
