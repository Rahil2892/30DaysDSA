class Solution {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] res = new int[length];

        for(int i=0; i<length; i++){
            res[i]=nums[i]*nums[i];
        }

        for(int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                int temp;
                if(res[i]>res[j]){
                    temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
            }
        }

        return res;

        
    }
}