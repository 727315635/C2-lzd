package Task10;

public class result {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.add(new Mouse());
        computer.add(new KeyBoard());
        computer.add(new Microphone());

        computer.poweron();
        System.out.println("-----------------");
        computer.poweroff();
    }
}
