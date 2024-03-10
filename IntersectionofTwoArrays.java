import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int l1 = nums1.length;
        int l2 = nums2.length;

        HashMap<Integer,Integer> numSet = new HashMap<>();
        Stack<Integer> dum = new Stack<>();

        for(int i=0; i< l1; i++){
            for(int j=0; j<l2; j++){
                if(nums1[i]==nums2[j]){
                    if(!numSet.containsKey(nums1[i])){
                    numSet.put(nums1[i],1);
                    dum.push(nums1[i]);
                    }
                }
            }
        }
        int size = numSet.size();
        int[] res = new int[size];

        for(int i=0; i<size; i++){
            res[i] = dum.pop();
        }

        return res;
        
    }
}