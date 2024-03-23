class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Find the middle of the list
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the list
        ListNode prev = null;
        ListNode curr = slow.next;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        slow.next = null; // Break the original list into two parts

        // Merge the two halves of the list
        ListNode first = head;
        ListNode second = prev;
        while (second != null) {
            ListNode next1 = first.next;
            ListNode next2 = second.next;
            first.next = second;
            second.next = next1;
            first = next1;
            second = next2;
        }
    }
}
