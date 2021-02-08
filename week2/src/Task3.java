import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(getNumeric(s));

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
