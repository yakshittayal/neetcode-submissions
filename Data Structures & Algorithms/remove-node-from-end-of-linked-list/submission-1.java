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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // empty list
        if(head == null){
            return null;
        }

        int size = 0;
        ListNode front = head;

        while(front != null){
            size++;
            front = front.next;
        }

        // to remove the first element 
        if(size - n == 0){
            head = head.next;
            return head;
        }

        ListNode track = head;
        for(int i = 1; i < size-n; i++){
            track = track.next;
        }
        track.next = track.next.next;
        return head;
    }
}
