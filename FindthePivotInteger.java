class Solution {
    public int pivotInteger(int n) {

        int leftCount = 0;
        int rightCount = 0;

        for(int x=1; x<=n; x++){
            leftCount = x* (x+1)/2;
            rightCount = n*(n+1)/2 - x* (x-1)/2;

            if(rightCount==leftCount){
            return x;
        }
        }
        return -1;
    }
}