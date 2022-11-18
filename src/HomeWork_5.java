import java.util.*;

public class HomeWork_5 {
    public static void main(String[] args) {

        Map<Integer, Fio> map = new HashMap<>();
        LinkedHashMap<Integer, Fio> linkedMap = new LinkedHashMap<>();
        TreeMap<Integer, Fio> treeMap = new TreeMap<>();

        Scanner scannerFamily = new Scanner(System.in);
        Scanner scannerName = new Scanner(System.in);
        Scanner scannerPatr = new Scanner(System.in);
        Scanner scannerAge = new Scanner(System.in);
        Scanner scannerCount = new Scanner(System.in);

        System.out.println("Введите количество сотрудников");
        int count = scannerCount.nextInt();

        //Map
        System.out.println("Проверяем работу Map");
        long begin1 = System.currentTimeMillis();
        for (int i = 1; i < count+1; i++) {
            System.out.println("Введите ФИО и возраст через Enter");
            map.put(i, new Fio(scannerFamily.nextLine(), scannerName.nextLine(), scannerPatr.nextLine(), scannerAge.nextInt()));
        }
        map.forEach((k,v) -> System.out.println(k + " " + v.family + " " + v.name + " " + v.patronymic + " " + v.age));
        System.out.println(System.currentTimeMillis()-begin1 + " - Время выполнения операции средствами Map");
        System.out.println();

//      LinkedHashMap
        System.out.println("Проверяем работу LinkedMap");
        long begin2 = System.currentTimeMillis();
        for (int i = 1; i < count+1; i++) {
            System.out.println("Введите ФИО и возраст через Enter");
            linkedMap.put(i, new Fio(scannerFamily.nextLine(), scannerName.nextLine(), scannerPatr.nextLine(), scannerAge.nextInt()));
        }
        linkedMap.forEach((k,v) -> System.out.println(k + " " + v.family + " " + v.name + " " + v.patronymic + " " + v.age));
        System.out.println(System.currentTimeMillis()-begin2 + " - Время выполнения операции средствами LinkedMap");
        System.out.println();

        //TreeMap
        System.out.println("Проверяем работу TreeMap");
        long begin3 = System.currentTimeMillis();
        for (int i = 1; i < count+1; i++) {
            System.out.println("Введите ФИО и возраст через Enter");
            treeMap.put(i, new Fio(scannerFamily.nextLine(), scannerName.nextLine(), scannerPatr.nextLine(), scannerAge.nextInt()));
        }
        treeMap.forEach((k,v) -> System.out.println(k + " " + v.family + " " + v.name + " " + v.patronymic + " " + v.age));
        System.out.println(System.currentTimeMillis()-begin3 + " - Время выполнения операции средствами TreeMap");
        System.out.println();
        }

    }

