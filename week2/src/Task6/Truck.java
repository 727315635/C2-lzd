package Task6;

public class Truck extends Vehicle{

    public Truck(int people , int subject)
    {
        if(people>3)
        {
            if(subject>5000)
            {
                System.out.println("这是一辆卡车，能载3人，实载"+people+"人，你超员了!!!");
                System.out.println("这是一辆卡车，核载5000kg，你已装载"+subject+"kg"+"你超载了！！！");
            }
            else
            {
                System.out.println("这是一辆卡车，能载3人，实载"+people+"人，你超员了!!!");
                System.out.println("这是一辆卡车，核载5000kg，你已装载"+subject+"kg");
            }

        }
        else
        {
            if (subject<=5000)
            {
                System.out.println("这是一辆卡车，能载3人，实载"+people+"人");
                System.out.println("这是一辆卡车，核载5000kg，你已装载"+subject+"kg");
            }
            else
            {
                System.out.println("这是一辆卡车，能载3人，实载"+people+"人");
                System.out.println("这是一辆卡车，核载5000kg，你已装载"+subject+"kg"+"你超载了！！！");
            }

        }
    }
}
