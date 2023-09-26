
func hammingWeight(num uint32) int {
    var res uint32 = 0

    for num > 0 {
        res += num & uint32(1)
        num = num >> 1
    }
    return int(res)
}
