class Solution:
    def characterReplacement(self, s: str, k: int) -> int:

        count = defaultdict(int) # char -> count

        l = 0
        max_cnt = 0
        res = 0
        for r in range(len(s)):
            count[s[r]] += 1
            if count[s[r]] > max_cnt:
                max_cnt = count[s[r]]

            if(r -l + 1  ) - max_cnt > k:
                count[s[l]] -= 1
                l += 1
            
            res = max(res, (r -l + 1))

        return res
        