class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums = set(nums)
        res = 0

        for n in nums:
            if n - 1 not in nums:
                count = 1
                while n + 1 in nums:
                    count += 1
                    n += 1
                res = max(res, count)

        return res
        