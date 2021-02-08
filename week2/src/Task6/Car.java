package Task6;

public class Car extends Vehicle{

    public Car(int people)
    {
        if(people>6)
        {
            System.out.println("这是一辆小车，能载6人，实载"+people+"人，你超员了!!!");
        }
        else
        {
            System.out.println("这是一辆小车，能载6人，实载"+people+"人");
        }
    }
}
