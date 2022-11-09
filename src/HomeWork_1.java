import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork_1 {
    public static void main(String[] args) {

        Random rnd = new Random();
        int i = rnd.nextInt(1000) * 2 - 1000;
        System.out.println(i);
        int n = Integer.bitCount(i);
        System.out.println(n);

        String str = "";
        String str2 = "";

        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                str = str + " " + j;
            }
        }
        //System.out.println(str);

        for (int k = Short.MIN_VALUE; k < i; k++) {
            if (k % n != 0) {
                str2 = str2 + " " + k;
            }
        }

        /*String strArr[] = str.split(" ");
        int m1[] = new int[str.getBytes().length];
        for (int l = 0; l < strArr.length; l++) {
            m1[l] = Integer.parseInt(strArr[l]);
        }*/

        try (FileWriter fm1 = new FileWriter("m1.txt", false)) {
            fm1.write(str);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


        try (FileWriter fm2 = new FileWriter("m2.txt", false)) {
            fm2.write(str2);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

