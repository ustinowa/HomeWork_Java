import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class HomeWork_4 {
    public static void main(String[] args) {
            ArrayList<String> ListFname = new ArrayList<>();
            ArrayList<String> ListLname = new ArrayList<>();
            ArrayList<String> ListTname = new ArrayList<>();
            ArrayList<Integer> ListAge = new ArrayList<>();
            ArrayList<String> ListGender = new ArrayList<>();
            LinkedList<Integer> key = new LinkedList<>();

            boolean flag = true;
            while (flag) {
                Scanner scanner = new Scanner(System.in);
                Scanner scannerAge = new Scanner(System.in);
                Scanner scannerGender = new Scanner(System.in);

                System.out.println("Введите ФИО ");
                String fio = scanner.nextLine();
                System.out.println("Введите возраст: ");
                Integer age = scannerAge.nextInt();
                ListAge.add(age);
                System.out.println("Введите пол: ");
                String gender = scannerGender.nextLine();
                ListGender.add(gender);
                String[] fio1 = fio.split(" ");
                if (fio1.length == 3) {
                    ListFname.add(fio1[1]);
                    ListTname.add(fio1[2]);
                    ListLname.add(fio1[0]);
                } else if (fio1.length == 2) {
                    ListLname.add(fio1[0]);
                    ListTname.add("");
                    ListFname.add(fio1[1]);
                } else {
                    ListLname.add(fio1[0]);
                    ListTname.add("");
                    ListFname.add("");
                }
                key.add(ListFname.size()-1);
                System.out.println("Хотите ввести следующую запись? Y/N");
                Scanner scanner1 = new Scanner(System.in);
                String yn = scanner1.nextLine();
                if(yn.toUpperCase().equals("N")) {
                    flag = false;
                }

            }
            int cnt = key.size()-1;
            while (cnt > -1) {
                int maxAge = ListAge.get(key.get(cnt));
                int index = cnt;
                for (int i = 0; i < cnt; i++) {
                    if (maxAge < ListAge.get(key.get(i))) {
                        maxAge = ListAge.get(key.get(i));
                        index = i;
                    }
                }

                int tmp = key.get(cnt);
                key.set(cnt, key.get(index));
                key.set(index, tmp);
                cnt--;
            }
            key.forEach(n -> System.out.println(ListFname.get(n) + " " + ListTname.get(n) + " " + ListLname.get(n) + " " + ListAge.get(n) + " " + ListGender.get(n)));
        }
}
