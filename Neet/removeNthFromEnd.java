package Neet;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode right = dummy;
        for (int i = 0; i < n; i++) {
            right = right.next;
        }

        ListNode left = dummy;
        while (right != null && right.next != null) {
            left = left.next;
            right = right.next;
        }

        // Remove the nth node by updating the next pointer of the node before it.
        left.next = left.next.next;

        return dummy.next;
    }
}

/* 

We define a ListNode class to represent a node in the singly-linked list. Each node has a value (val) and a reference to the next node (next).

In the Solution class, we define a removeNthFromEnd method that takes a ListNode called head (the head of the linked list) and an integer n (the position from the end to remove).

We create a dummy node at the beginning of the list to handle the case where we need to remove the first node. The dummy node simplifies the code and avoids special cases.

We use two pointers, left and right, both initially pointing to the dummy node.

The right pointer is moved n steps ahead to create a gap of n nodes between left and right.

Then, we move both left and right pointers one node at a time until right reaches the end of the list (right.next == null). At this point, left will be pointing to the node just before the one to be removed.

To remove the nth node, we update the next pointer of the left node to skip the node to be removed.

Finally, we return dummy.next as the new head of the modified list.

This Java code efficiently removes the nth node from the end of a linked list in a single pass, just like the Go code explained earlier. The use of a dummy node simplifies edge case handling and allows for a clean and concise solution.
*/