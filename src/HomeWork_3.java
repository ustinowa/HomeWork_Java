import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class HomeWork_3 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        List<String> list = new ArrayList();
        list.add("Red");
        list.add("Orange");
        list.add("Yellow");
        list.add("Green");
        list.add("Cian");
        list.add("Blue");
        list.add("Purple");
        System.out.println(list);

        System.out.println("Задание 2");
        for (String in: list) {
            System.out.print(in+"!");
        }

        System.out.println();
        System.out.println("Задание 3");
        list.add(0,"White");
        System.out.println(list);

        System.out.println("Задание 4");
        String a = list.get(3);
        System.out.println(a);

        System.out.println("Задание 5");
        list.set(0,"Black");
        System.out.println(list);

        System.out.println("Задание 6");
        list.remove(2);
        System.out.println(list);

        System.out.println("Задание 7");
        int b = list.indexOf("Blue");
        System.out.println(b);

        System.out.println("Задание 8");
        list.sort(null);
        System.out.println(list);

        System.out.println("Задание 9");
        List <String> listCopy = list;
        System.out.println(listCopy);
    }
}
