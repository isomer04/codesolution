package Leetcode.CodePa;

import java.util.List;

import Leetcode.topQuestions.ListNode;

class Solution {
	public ListNode deleteDuplicates(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null){
            while(fast != null && slow.val == fast.val){
                fast = fast.next;
            }

            slow.next = fast;

            slow = fast;
        }

        return head;
    }
}
