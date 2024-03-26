import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int ptr=1;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] <= 0 || (i > 0 && nums[i] == nums[i - 1])){
                continue;
            }
            if(nums[i]==ptr){
                ptr++;
            }else{
                return ptr;
            }
        }

        return ptr;
        
    }
}