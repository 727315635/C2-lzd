import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float tizhong,shengao,BMI;
        System.out.println("输入体重(kg):");
        tizhong= in.nextFloat();
        System.out.println("输入身高(m)");
        shengao= in.nextFloat();
        BMI=tizhong/shengao/shengao;
        if(BMI<18.5)
        {
            System.out.println("过轻");
        }
        else if (BMI>18.5 && BMI<25)
        {
            System.out.println("正常");
        }
        else if (BMI>25 && BMI<28)
        {
            System.out.println("过重");
        }
        else if (BMI>28 && BMI<32)
        {
            System.out.println("肥胖");
        }
        else if (BMI>32)
        {
            System.out.println("非常肥胖");
        }


    }
}

