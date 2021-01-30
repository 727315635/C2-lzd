import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(a(s));
    }


    public static String a(String s) {
        char[] eee = s.toCharArray();
        String a = "";
        String temp = "";
        String b;

        for (int i = 0; i <= eee.length - 1; i++) {
            if (eee[i] == '0') {
                temp += eee[i];
            } else {
                a += eee[i];
            }
        }
        b = a + temp;
        return b;
    }



}

