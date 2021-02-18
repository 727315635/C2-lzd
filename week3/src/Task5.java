import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个数:");
        try
        {
            int num = in.nextInt();
            if(num<0)
                throw new TCPException();
            System.out.println("赋值正确");
        }
        catch (TCPException e)
        {
            e.printf();
        }
    }
}
class TCPException extends Exception{
    TCPException(){
        super();
    }
    public void printf(){
        System.out.println("负值异常：TCPException");
    }
}