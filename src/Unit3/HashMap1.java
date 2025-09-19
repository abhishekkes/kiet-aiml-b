package Unit3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String []word=sc.nextLine().split(" ");// add alice word[0]=add word[1]=alice
            String query=word[0];  // query=add
            String key=word[1];    // key=alice
            if (query.equals("add"))
            {
                hm.put(key,hm.getOrDefault(key,0)+1); // hm['alicee']=1+1=2
            } else if (query.equals("count")) {
                System.out.println(hm.getOrDefault(key,0));

            } else if (query.equals("remove")) {
                if(hm.containsKey(key))
                {
                    if(hm.getOrDefault(key,0)>1)
                         hm.put(key,hm.get(key)-1);
                    else
                        hm.remove(key);
                }

            }

        }


    }
}
