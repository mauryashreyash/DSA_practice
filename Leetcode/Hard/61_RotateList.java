class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Find length and last node
        ListNode curr = head;
        int length = 1;

        while (curr.next != null) {
            curr = curr.next;
            length++;
        }

        // Make circular list
        curr.next = head;

        // Effective rotations
        k = k % length;
        int stepsToNewHead = length - k;

        ListNode newTail = curr;

        while (stepsToNewHead-- > 0) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
