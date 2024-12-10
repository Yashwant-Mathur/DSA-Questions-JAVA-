class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int ans = 0;
        
        // Create an array to track the minimum cost to connect each point (similar to the "vec" array in C++)
        int[] dist = new int[n];  // Initialize the distance array
        Arrays.fill(dist, Integer.MAX_VALUE); // Set all distances to a large value (infinity)
        
        // Use a priority queue (min-heap) to always process the point with the least cost
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);  // Min-heap based on cost
        pq.add(new int[]{0, 0}); // Start from the first point with a cost of 0
        dist[0] = 0;
        
        boolean[] visited = new boolean[n]; // Track visited points
        
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int u = current[0];  // Current point
            int cost = current[1]; // Cost to connect current point
            
            // If the point is already visited, skip it
            if (visited[u]) continue;
            
            // Add the cost to the answer
            ans += cost;
            visited[u] = true; // Mark the point as visited
            
            // Update the costs to connect the remaining points
            for (int v = 0; v < n; v++) {
                if (!visited[v]) {
                    // Calculate the Manhattan distance between points u and v
                    int newCost = Math.abs(points[u][0] - points[v][0]) + Math.abs(points[u][1] - points[v][1]);
                    // If the new cost is less than the previous cost, update it
                    if (newCost < dist[v]) {
                        dist[v] = newCost;
                        pq.add(new int[]{v, newCost}); // Add the new point to the priority queue with the new cost
                    }
                }
            }
        }
        
        return ans; // Return the total minimum cost
    }}