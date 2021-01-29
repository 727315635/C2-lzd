import static java.lang.Math.pow;
public class Task2 {
    public static void main(String[] args) {
        int a,b=0;
        for(a=100;a<=999;a++)
        {
            if(pow(a/100,3)+pow(a%10,3)+pow(a%100/10,3)==a)
            {
                b=b+1;
                System.out.println(a);
            }

        }
        System.out.println("1000以内的水仙数共有"+b+"个");
    }
}
