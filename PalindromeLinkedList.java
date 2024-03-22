import java.util.*;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }

        int len = arr.size();

        for(int i= 0;i<len/2;i++){
            int start = arr.get(i);
            int tail = arr.get(len-(i+1));
            if(start!=tail){
                return false;
            }
        }

        return true;



        
    }
}