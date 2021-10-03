package com.company;

import java.util.*;

public class count_character {
   static int getCount (String S)
    {

        HashMap<Character, Integer> hs = new HashMap<>();
          char [] ch = S.toCharArray();

        for (char c: ch) {
            if(hs.containsKey(c)){
                hs.put(c,hs.get(c)+1);
            }
            else hs.put(c,1);
        }
      int max=0; char res= 0;

        for (Map.Entry <Character,Integer>e : hs.entrySet() ) {

            if(max<e.getValue() && res<(int)e.getKey() ){
                res = e.getKey();
              max=e.getValue();

            }
        }
        return res;

    }
    public static void main(String[] args) {
     String s = "testsample";
  char ans = (char) getCount(s);
        System.out.println(ans);


    }
}
