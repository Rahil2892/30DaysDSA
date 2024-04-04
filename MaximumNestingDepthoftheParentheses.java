import java.util.Stack;

class Solution {
    public int maxDepth(String s) {

        Stack<Character> stc = new Stack<>();
        int depth =0;
        int maxdepth =0;

        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='<' ||s.charAt(i)=='[' ||s.charAt(i)=='(' ||s.charAt(i)=='{' ){
                stc.push(s.charAt(i));
                depth++;
            }
            if(s.charAt(i)=='>' ||s.charAt(i)==']' ||s.charAt(i)==')' ||s.charAt(i)=='}' ){
                stc.pop();
                depth--;
            }
            maxdepth=Math.max(maxdepth,depth);
        }

        return maxdepth;
        
    }
}