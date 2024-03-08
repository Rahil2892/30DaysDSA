import java.util.HashMap;
import java.util.Map.Entry;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> numsSet = new HashMap<>();
        int max = 0;
        int count = 0;

        for(int i=0; i<nums.length; i++){
            if(!numsSet.containsKey(nums[i])){
                numsSet.put(nums[i],1);
                count = 1;
                if(max< count){
                    max=count;
                }
            }else{
                count = numsSet.get(nums[i]);
                count++;
                numsSet.put(nums[i],count);
                if(max< count){
                    max=count;
                }
            }
        }

        count = 0;
        for(Entry<Integer, Integer> entry: numsSet.entrySet()) {
            if(entry.getValue() == max) {
                count++;
            }
        }

        max = max * count;


        return max;


        }
}