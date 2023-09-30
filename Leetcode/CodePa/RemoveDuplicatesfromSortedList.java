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


// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         ListNode cur=head;
//         while (cur!=null){
//             while (cur.next!=null && cur.val==cur.next.val) cur.next=cur.next.next;
//             cur=cur.next;
//         }
//         return head;
//     }
// }