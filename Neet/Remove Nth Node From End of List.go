func removeNthFromEnd(head *ListNode, n int) *ListNode {
    dummy := &ListNode{0, head}

    right := dummy
    for i := 0; i < n; i++ {
        right = right.Next
    }

    left := dummy
    for right != nil && right.Next != nil {
        left = left.Next
        right = right.Next
    }

    // Remove the nth node by updating the Next pointer of the node before it.
    left.Next = left.Next.Next

    return dummy.Next
}