public class Task6_2 {
    private String name;
    private float balance;

    public Task6_2(String name, float balance) {
        this.name = name;
        this.balance = balance;
    }

    public String search() {
        return "账户 名称：" + this.name +" " + "余额为 ： " + this.balance+"元整";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
