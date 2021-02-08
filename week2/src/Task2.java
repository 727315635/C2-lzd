import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        String s3=in.nextLine();
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        char[] a3 = s3.toCharArray();
        int count=0;
        for(int i=0;i<=a1.length-1;i++)
        {
            for(int j=0;j<=a2.length-1;j++)
            {
                for(int k=0;k<=a3.length-1;k++)
                {
                    if(a1[i]==a2[j] && a2[j]==a3[k])
                    {
                        System.out.print(a3[k]);
                        count+=0;
                    }
                }
            }
        }
        if(count==0)
        {
            System.out.println("不存在公共字符");
        }


    }

}
