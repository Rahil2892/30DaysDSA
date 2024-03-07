class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode middle = head;
        ListNode end = head;

        while(end!=null){
            if(end.next==null){
                return middle;
            }
            middle = middle.next;
            end = end.next.next;
        }

        return middle;
        
    }
}