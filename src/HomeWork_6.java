import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class HomeWork_6 {
    public static void main(String[] args) {
        Comparator<Person> c = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.age - o1.age;
            }
        };
        System.out.println("Работа Set");
        Set<Person> myS = new TreeSet<>(c);
        myS.add(new Person("Sorokin", "Ivan", "Ivanovich", 36));
        myS.add(new Person("Ikrin", "Ivan", "Ivanovich", 41));
        myS.add(new Person("Popov", "Vasiliy", "Ivanovich", 27));
        myS.forEach(p -> System.out.println(p.family+" "+p.name+" "+p.patronymic+" "+p.age));
        System.out.println();

        System.out.println("Работа MySet");
        MySet my = new MySet();
        my.add(new Person("Ivanov", "Ivan", "Ivanovich", 36));
        my.add(new Person("Sidorov", "Ivan", "Ivanovich", 41));
        my.add(new Person("Karpov", "Ivan", "Ivanovich", 27));

        my.items.forEach((p,o)-> System.out.println(p.family+" "+p.name+" "+p.patronymic+" "+p.age));
        System.out.println();
    }
}
