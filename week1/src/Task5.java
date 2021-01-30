import java.util.Scanner;

import static java.lang.Math.pow;

public class Task5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double r=in.nextInt();
        System.out.println("the area is "+getArea(r));
        System.out.println("the perimeter is "+getPerimeter(r));

    }



    public static double getArea(double r)
    {
        double area;
        area=3.14*pow(r,2);
        return area;
    }

    public static double getPerimeter(double r)
    {
        double Perimeter;
        Perimeter=2*3.14*r;
        return Perimeter;
    }

}
