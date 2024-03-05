class Solution {
    public int minimumLength(String s) {
        int start =  0;
        int end = s.length() - 1;
        
        while(start < end && s.charAt(start)==s.charAt(end)){
            char temp = s.charAt(start);
            while(start<end && s.charAt(start)==temp){
                start++;
            }
            while(start<=end && s.charAt(end)==temp){
                end--;
            }
        }

        return end - start + 1;
        
    }
}