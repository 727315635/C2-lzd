package Task10;

public class Mouse implements USB{

    @Override
    public void turnon() {
        System.out.println("鼠标启动了");
    }

    @Override
    public void turnoff() {
        System.out.println("鼠标关闭了");
    }
}
