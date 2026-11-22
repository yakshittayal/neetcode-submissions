/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
         // here in the loop condition slow is not checked because if fast exists slow should exist too because fast is 2 pointers ahead of slow    
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
}
