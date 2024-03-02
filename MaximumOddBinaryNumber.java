import java.util.Stack;

class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count1 = 0;
        int length = s.length();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack0 = new Stack<>();
        String res = new String ("");

        for(int i = 0;i<length; i++){
            if(s.charAt(i)=='1'){
                stack1.push(s.charAt(i));
                count1++;
            }else{
                stack0.push(s.charAt(i));
            }
        }

        while(count1 != 1){
            res=res+stack1.pop();
            count1--;
        }
        while(!stack0.isEmpty()){
            res=res+stack0.pop();
            
        }
            res=res+stack1.pop();

        return res;
    }
}