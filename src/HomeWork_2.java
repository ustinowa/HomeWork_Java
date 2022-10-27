public class HomeWork_2 {
    public static void main(String[] args) {
        System.out.println("Задание 2");
        String str1 = "ток";
        String str2 = "кот";

        String sTmp = "";
        for (int i = str1.length()-1; i >= 0; i--) {
            sTmp = sTmp.concat(Character.toString(str1.charAt(i)));
        }
        System.out.println(sTmp);
        if (str2==sTmp) {
            System.out.println("Данные строки являются вращением друг друга");
        } else {
            System.out.println("Данные строки НЕ являются вращением друг друга");
        }

        System.out.println("Задание 4");
        int a = 3;
        int b = 56;
        StringBuilder res = new StringBuilder();
        res.append(a).append("+").append(b).append("=").append(a+b).append("\n");
        res.append(a).append("-").append(b).append("=").append(a-b).append("\n");
        res.append(a).append("*").append(b).append("=").append(a*b).append("\n");
        System.out.println(res);

        System.out.println("Задание 5");
        StringBuilder res1 = res;
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) == '='){
                res.deleteCharAt(i);
                res.insert(i," равно ");
            }
        }
        System.out.println(res);

        System.out.println("Задание 6");
        for (int j = 0; j < res1.length(); j++) {
            if (res1.charAt(j) == '='){
                res1.replace(j, j+1, " равно ");
            }
        }
        System.out.println(res1);

        System.out.println("Задание 7");
        long begin1 = System.currentTimeMillis();
        String strT1 = new String("5*5"+"=".repeat(10000)+"25");
        for (int k = 0; k < strT1.length(); k++) {
                strT1=strT1.replace("="," равно ");
        }
        System.out.println(System.currentTimeMillis()-begin1 + " - Время выполнения пункта 6 средствами String");

        long begin2 = System.currentTimeMillis();
        StringBuilder strT2 = new StringBuilder("5*5"+"=".repeat(10000)+"25");
        for (int j = 0; j < res.length(); j++) {
            if (res.charAt(j) == '='){
                res.replace(j,j+1," равно ");
            }
        }
        System.out.println(System.currentTimeMillis()-begin2 + " - Время выполнения пункта 6 средствами StringBuilder");

    }


}
