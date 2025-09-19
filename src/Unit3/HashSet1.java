package Unit3;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hs1=new HashSet<>();
        HashSet<String> hs2=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elemnets in hs 1");
        int m=sc.nextInt();
        System.out.println("Enter no of elemnets in hs 2");
        int n=sc.nextInt();
        System.out.println("Enter elements in hs 1");
        for(int i=0;i<m;i++)
        {
            hs1.add(sc.next());
        }
        System.out.println("Enter elements in hs 2");
        for(int i=0;i<n;i++)
        {
            hs2.add(sc.next());
        }

        hs1.remove(hs2);
        System.out.println(hs1);
        hs1.remove("aa");
        String str1=sc.next();
        hs1.removeIf(str->str.contains(str1));
    }
}
