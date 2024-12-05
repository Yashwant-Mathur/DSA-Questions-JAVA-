// Final

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        
        // Edge Case: Check if the start or end cell is blocked.
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1;
        }

        // Create a queue for storing cells with their distances from source
        Queue<CellTuple> queue = new LinkedList<>();
        queue.add(new CellTuple(1, 0, 0)); // Start with distance 1
        grid[0][0] = 1; // Mark start as visited

        // Iterate through the maze
        while (!queue.isEmpty()) {
            CellTuple current = queue.poll();
            int distance = current.distance;
            int row = current.row;
            int col = current.col;

            // Check if we have reached the destination cell
            if (row == n - 1 && col == n - 1) {
                return distance;
            }

            // Explore 8-directionally connected adjacent cells
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    int newRow = row + i;
                    int newCol = col + j;

                    // Check the validity of the cell and if it's not visited yet
                    if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && grid[newRow][newCol] == 0) {
                        queue.add(new CellTuple(distance + 1, newRow, newCol));
                        grid[newRow][newCol] = 1; // Mark as visited
                    }
                }
            }
        }
        
        // If no path is found from source to destination
        return -1;
    }

    class CellTuple {
        int distance;
        int row;
        int col;

        CellTuple(int distance, int row, int col) {
            this.distance = distance;
            this.row = row;
            this.col = col;
        }
    }
}