package One;

import java.util.Random;

public class check {
    public static String Creatcode(int n){
        String code="";
        String data="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random r=new Random();
        for (int i = 0; i < n; i++) {
            int index=r.nextInt(data.length());
            code+=data.charAt(index);
        }
        return code;
    }
}
