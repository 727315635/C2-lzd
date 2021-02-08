package Task6;

import java.util.Scanner;

public class Vehicle {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("车轮的个数是：4     车重：1150.0");
        Car car = new Car(in.nextInt());
        System.out.println("----------------------------");

        Scanner into=new Scanner(System.in);
        System.out.println("车轮的个数是：6     车重：15000.0");
        Truck truck = new Truck(into.nextInt(), into.nextInt());


    }
}
