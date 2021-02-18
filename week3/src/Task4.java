import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        String[] a = s.split("");

        HashMap<String,Integer> tongji = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(!tongji.containsKey(a[i])){
                tongji.put(a[i],1);
            }
            else {
                Integer counts = tongji.get(a[i]);
                tongji.put(a[i],counts+1);
            }
        }

        //Java中的Iterator功能比较简单，并且只能单向移动：
        //
        //　　(1) 使用方法iterator()要求容器返回一个Iterator。第一次调用Iterator的next()方法时，它返回序列的第一个元素。注意：iterator()方法是java.lang.Iterable接口,被Collection继承。
        //
        //　　(2) 使用next()获得序列中的下一个元素。
        //
        //　　(3) 使用hasNext()检查序列中是否还有元素。
        //
        //　　(4) 使用remove()将迭代器新返回的元素删除。
        Iterator<String> it= tongji.keySet().iterator();
        while ((it.hasNext())){
            String keyName=it.next();
            System.out.println(keyName+":"+ tongji.get(keyName));
        }
    }
}