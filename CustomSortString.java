import java.util.*;

class Solution {
    public String customSortString(String order, String s) {

        String res = new String();
        HashMap<Character,Integer> ct = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            int count = 0;
            if(ct.containsKey(s.charAt(i))){
                 count = ct.get(s.charAt(i)) + 1;
            }else{
                 count = 1;
            }
            ct.put(s.charAt(i),count);
        }

        for(int i=0; i<order.length(); i++){
            if(ct.containsKey(order.charAt(i))){
                int count = ct.get(order.charAt(i));
                for(int j=0; j<count; j++){
                res = res + order.charAt(i);
                }
                ct.remove(order.charAt(i));
            }
        }

        for (char c : ct.keySet()) {
            int count = ct.get(c);
            while (count-- > 0) {
                res = res + c;
            }
        }

        return res; 
    }
}