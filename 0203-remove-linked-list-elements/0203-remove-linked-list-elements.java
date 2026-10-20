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
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node that points to the head
        ListNode dummy = new ListNode(-1, head);
        ListNode prev = dummy;
        
        // Traverse the list evaluating the next node
        while (prev.next != null) {
            if (prev.next.val == val) {
                // Skips the matching node
                prev.next = prev.next.next;
            } else {
                // Moves the pointer forward only if no node was deleted
                prev = prev.next;
            }
        }
        
        // Return the actual new head of the list
        return dummy.next;
    }
}
