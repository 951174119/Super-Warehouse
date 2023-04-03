package 线程安全;

public class Account {
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getAcc() {
        return money;
    }

    public void setAcc(double acc) {
        this.money = acc;
    }

    private String ID;

    public Account(String ID, double money) {
        this.ID = ID;
        this.money = money;
    }

    public Account() {
    }

    public Account(double acc) {
        this.money = acc;
    }

    private double money;
    public void draw(double money){
        String name =Thread.currentThread().getName();
        if(this.money>=money){
            System.out.println("1000");
            this.money-=money;
            System.out.println(this.money);
        }
    }


}






















