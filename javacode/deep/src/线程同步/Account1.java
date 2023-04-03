package 线程同步;



public class Account1 {
    public String getID() {
        return ID;
    }
    public static void run(){
        synchronized (Account1.class){

        }
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

    public Account1(String ID, double money) {
        this.ID = ID;
        this.money = money;
    }

    public Account1() {
    }

    public Account1(double acc) {
        this.money = acc;
    }

    private double money;
    public synchronized void draw(double money){
        String name =Thread.currentThread().getName();
            if(this.money>=money){
                System.out.println("1000");
                this.money-=money;
                System.out.println(this.money);
            }
            else System.out.println("false");
    }


}





