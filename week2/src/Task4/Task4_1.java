package Task4;

import Task4.Game;

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("欢迎来到猜字游戏，请输入一个数：");
        int count=0;
        int a;
        Game game=new Game(100);
        do
        {
            a=in.nextInt();
            if(a> game.getV())
            {
                System.out.println("猜的大了奥，再试一下吧");
            }
            else if(a< game.getV())
            {
                System.out.println("猜的有点小，再试一下吧");
            }
            count=count+1;
        }
        while(a!= game.getV());
        System.out.println("恭喜你猜对了，共花了"+count+"次");
    }
}
