package Task10;

public class KeyBoard implements USB{

    @Override
    public void turnon() {
        System.out.println("键盘启动了");
    }

    @Override
    public void turnoff() {
        System.out.println("键盘关闭了");
    }
}
