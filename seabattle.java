String[] solution(String[][] grid, int[][] shots) {
    
 int n = grid.length;
    int m = grid[0].length;
    Map<String, Integer> shipSizes = new HashMap<>();
    Map<String, Set<String>> shipCells = new HashMap<>();

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (!grid[i][j].equals(".")) {
                String ship = grid[i][j];
                shipSizes.put(ship, shipSizes.getOrDefault(ship, 0) + 1);
                shipCells.computeIfAbsent(ship, k -> new HashSet<>()).add(i + "," + j);
            }
        }
    }

    List<String> result = new ArrayList<>();
    for (int[] shot : shots) {
        int row = shot[0];
        int col = shot[1];
        String cell = row + "," + col;

        if (!shipCells.isEmpty() && shipCells.values().stream().anyMatch(set -> set.contains(cell))) {
            String ship = grid[row][col];
            shipSizes.put(ship, shipSizes.get(ship) - 1);
            shipCells.get(ship).remove(cell);

            if (shipSizes.get(ship) == 0) {
                shipSizes.remove(ship);
                shipCells.remove(ship);
                result.add("Ship " + ship + " sunk");
            } else {
                result.add("Attacked ship " + ship);
            }
        } else if (grid[row][col].equals(".")) {
            result.add("Missed");
        } else {
            result.add("Already attacked");
        }
    }

    return result.toArray(new String[0]);

}
