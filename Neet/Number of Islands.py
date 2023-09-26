class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        ROWS, COLS = len(grid), len(grid[0])
        res = 0
        visit = set()  # Initialize a set to keep track of visited cells.

        def dfs(r, c):
            # Check if the cell (r, c) is out of bounds or already visited.
            if r < 0 or r == ROWS or c < 0 or c == COLS or (r, c) in visit or grid[r][c] == "0":
                return

            # Mark the current cell as visited.
            visit.add((r, c))

            # Recursively visit adjacent cells in all four directions.
            dfs(r + 1, c)
            dfs(r - 1, c)
            dfs(r, c + 1)
            dfs(r, c - 1)

        for r in range(ROWS):
            for c in range(COLS):
                # If the cell contains "1" (land) and has not been visited, start a DFS from it.
                if grid[r][c] == "1" and (r, c) not in visit:
                    dfs(r, c)
                    # Increment the island count after the DFS completes for this island.
                    res += 1

        return res
    
    
    
# We define the numIslands function that takes a grid represented as a list of lists of strings (grid: List[List[str]]) and returns the number of islands in the grid.

# We initialize ROWS and COLS with the dimensions of the grid and set res (result) to 0 to store the count of islands.

# We initialize a visit set to keep track of visited cells during DFS.

# The dfs function is a recursive depth-first search that explores neighboring cells and marks them as visited.

# In the main loop, we iterate through all cells in the grid. If a cell contains "1" (land) and has not been visited, we start a DFS from that cell.

# Inside the DFS, we explore adjacent cells in all four directions (up, down, left, right) and mark them as visited if they are valid and contain "1".

# After the DFS completes for one island, we increment the res counter, indicating that we've found an island.

# Finally, we return the res value, which represents the total number of islands in the grid.
