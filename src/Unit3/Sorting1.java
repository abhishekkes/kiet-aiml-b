package Unit3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting1 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(12);
        al.add(21);
        al.add(0);
        al.add(-12);
        al.add(1);
//      Collections.sort(al);
        Collections.sort(al, Comparator.reverseOrder());
        System.out.println(al);
    }
}
