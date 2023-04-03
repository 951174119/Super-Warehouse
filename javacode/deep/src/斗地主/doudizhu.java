package 斗地主;

import java.util.ArrayList;

public class doudizhu {
    public static ArrayList<String> cards=new ArrayList<>();
    static {
        String[] size={"3","4","5","6","7","8","9","J","Q","K"};
        String[] colours={"♥","♠","♣","♦"};
        for (int i = 0; i < size.length; i++) {
            for (int i1 = 0; i1 < colours.length; i1++) {
                String card=size[i]+colours[i1];
                cards.add(card);
            }
        }
        cards.add("大");
        cards.add("小");
    }

    public static void main(String[] args) {
        System.out.println("新牌:"+cards);
    }
}
