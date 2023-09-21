package Leetcode.topQuestions;

 class Main {
    public static void main(String[] args) {
        // Create nodes for listA
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(4);

        // Create nodes for listB
        ListNode b1 = new ListNode(3);
        ListNode b2 = new ListNode(1);

        // Connect the nodes to form the linked lists
        a1.next = a2;
        a2.next = a3;
        b1.next = b2;
        b2.next = a2; // Intersection point

        // Call the getIntersectionNode function with the heads of the two lists
        ListNode intersectionNode = getIntersectionNode(a1, b1);

        if (intersectionNode != null) {
            System.out.println("Intersection node value: " + intersectionNode.val);
        } else {
            System.out.println("No intersection found.");
        }
    }

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
          //boundary check
    if(headA == null || headB == null) return null;
    
    ListNode a = headA;
    ListNode b = headB;
    
    //if a & b have different len, then we will stop the loop after second iteration
    while( a != b){
        //for the end of first iteration, we just reset the pointer to the head of another linkedlist
        a = a == null? headB : a.next;
        b = b == null? headA : b.next;    
    }
    
    return a;
    }
}