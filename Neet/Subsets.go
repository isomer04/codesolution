func subsets(nums []int) [][]int {
    res := [][]int{}
    cur := []int{}

    var f func(i int)
    f = func(i int) {
        if i == len(nums) {
            // Make a copy of 'cur' to avoid modifying the same slice in the future.
            copyOfCur := make([]int, len(cur))
            copy(copyOfCur, cur)
            res = append(res, copyOfCur)
            return
        }

        // Skip the current element.
        f(i + 1)

        // Include the current element.
        cur = append(cur, nums[i])
        f(i + 1)

        // Remove the last element to backtrack.
        cur = cur[:len(cur)-1]
    }

    f(0) // Start with the first element at index 0.
    return res
}
