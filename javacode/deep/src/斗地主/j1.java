package 斗地主;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class j1 {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> A=new ArrayList<>();
        ans.add(new ArrayList<>(Arrays.asList(1,2,3)));
        System.out.println(Arrays.asList(1, 2, 3));
        System.out.println(ans);
        A.add(1);
        A.add(6);
        System.out.println(A);
    }
}
