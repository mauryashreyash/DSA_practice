/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }

        flattenList(head);
        return head;
    }

    private Node flattenList(Node curr) {
        Node last = curr;

        while (curr != null) {
            Node next = curr.next;

            if (curr.child != null) {
                Node child = curr.child;
                Node childLast = flattenList(child);

                curr.next = child;
                child.prev = curr;
                curr.child = null;

                if (next != null) {
                    childLast.next = next;
                    next.prev = childLast;
                }

                last = childLast;
            } else {
                last = curr;
            }

            curr = next;
        }

        return last;
    }}
