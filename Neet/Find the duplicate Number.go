func findDuplicate(nums []int) int {
    visited := map[int]bool{}

    for _, n := range nums {
        if visited[n] {
            return n
        }
        visited[n] = true
    }

    return -1 // Return an appropriate value if no duplicate is found.
}
