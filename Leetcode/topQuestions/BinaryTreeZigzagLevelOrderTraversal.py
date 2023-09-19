from collections import deque

class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        res = []
        q = deque([root] if root else [])
        level_number = 1  # Initialize a variable to keep track of the level number

        while q:
            level = []
            for i in range(len(q)):
                node = q.popleft()
                level.append(node.val)
                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)
            
            if level_number % 2 == 0:
                level = list(reversed(level))  # Reverse the level list if it's an even level
            
            res.append(level)
            level_number += 1  # Increment the level number

        return res
