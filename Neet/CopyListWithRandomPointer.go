func copyRandomList(head *Node) *Node {
    if head == nil {
        return nil
    }

    clones := map[*Node]*Node{}

    cur := head

    // First pass: Create clones of the nodes without setting the Next and Random pointers.
    for cur != nil {
        c := &Node{Val: cur.Val}
        clones[cur] = c
        cur = cur.Next
    }

    cur = head

    // Second pass: Set the Next and Random pointers for the clone nodes using the mapping.
    for cur != nil {
        c := clones[cur]

        if cur.Next != nil {
            c.Next = clones[cur.Next]
        }

        if cur.Random != nil {
            c.Random = clones[cur.Random]
        }

        cur = cur.Next
    }

    return clones[head]
}