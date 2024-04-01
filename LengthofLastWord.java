class Solution {
    public int lengthOfLastWord(String s) {
        String[] result = s.split(" ");
        int l=result.length;
        String res=result[l-1];
        int ans=res.length();

        return ans;

        
    }
}