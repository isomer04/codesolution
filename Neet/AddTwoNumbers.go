func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
    res := &ListNode{0, nil}
    curr := res
    carry := 0

    for l1 != nil || l2 != nil {
        d1, d2 := 0, 0
        if l1 != nil {
            d1 = l1.Val
            l1 = l1.Next
        }

        if l2 != nil {
            d2 = l2.Val
            l2 = l2.Next
        }

        digit := d1 + d2 + carry
        carry = digit / 10
        curr.Next = &ListNode{digit % 10, nil}
        curr = curr.Next
    }

    if carry > 0 {
        curr.Next = &ListNode{carry, nil}
    }

    return res.Next
}