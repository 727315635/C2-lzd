import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt(),c=in.nextInt(),d=in.nextInt();
        System.out.println(add(a,b,c,d));
        System.out.println(reduce(a,b,c,d));
        System.out.println(multiply(a,b,c,d));
    }


    public static String add(int a, int b, int c, int d )
    {
        String result=(a+c)+"+"+(b+d)+"i";
        return result;
    }

    public static String reduce(int a, int b, int c, int d )
    {
        String result="";
        if(b>d)
        {
            result=(a-c)+"+"+(b-d)+"i";
        }
        else if (b==d)
        {
            result=(a-c)+"";
        }
        else
        {
            result=(a-c)+""+(b-d)+"i";
        }
        return result;
    }

    public static String multiply(int a, int b, int c, int d )
    {
        String result=(a*c-b*d)+"+"+(a*d+b*c)+"i";
        return result;
    }
}
