import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("matrix= ");
        String s = scan.nextLine();
        String s1 =getNumeric(s);
        char[] chars1 = s1.toCharArray();
        int n = s1.length();
        int n1 = (int) Math.sqrt(n);
        int f2[][] = new int[n1][n1];

        int k = 0;

        for (int j=n1-1;j>=0;j--){
            for(int i=0;i<=n1-1;i++){
                f2[i][j]=chars1[k]-'0';
                k++;
            }
        }

        for(int i=0;i<=n1-1;i++){
            for(int j=0;j<=n1-1;j++){
                System.out.print("["+f2[i][j]+"]");
            }
            System.out.println();
        }

    }
    //将字符中提取数字
    public static String getNumeric(String str) {
        str=str.trim();
        String str2="";
        if(str != null && !"".equals(str)){
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>=48 && str.charAt(i)<=57){
                    str2+=str.charAt(i);
                }
            }
        }
        return str2;
    }
}

