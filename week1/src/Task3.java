import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String b= in.nextLine();
        System.out.println(a(b));
    }
    public static String a(String b){

            char []eee=b.toCharArray();
            String c="";

            for(int i=eee.length-1;i>=0;i--){

                c+=eee[i];

            }

            return c;

        }

}
