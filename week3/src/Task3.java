import java.util.LinkedHashSet;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String a = scanner.nextLine();
        //split 把字符串分割为字符数组
        String[] s = a.split("");
        // LinkedHashSet: LinkedHashSet是Set集合的一个实现，具有set集合不重复的特点
        LinkedHashSet<String> jihe = new LinkedHashSet<>();
        for (int i = 0; i < s.length; i++) {
            jihe.add(s[i]);
        }
        System.out.println(jihe);
    }
}