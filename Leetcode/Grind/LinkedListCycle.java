package Leetcode.Grind;

import Leetcode.topQuestions.ListNode;

 class Solution {
    public boolean hasCycle(ListNode head) {
        // two pointer
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                return true;
            }

        }

        return false;
    }
}