package Task10;

public class Microphone implements USB{

    @Override
    public void turnon() {
        System.out.println("麦克风启动了");
    }

    @Override
    public void turnoff() {
        System.out.println("麦克风关闭了");
    }
}
