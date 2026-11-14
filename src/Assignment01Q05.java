public class Assignment01Q05 {
    public static int rec(int[][] g, int i, int j, boolean[] visited) {
        if (i == j) {
            return 0;
        }
        visited[i] = true;
        int min = g.length;
        for (int k = 0; k < g.length; k++) {
            if (g[i][k] == 1 && !visited[k]) {
                int w = rec(g, k, j, visited);
                if (w + 1 < min) {
                    min = w + 1;
                }
            }
        }
        visited[i] = false;
        return min;
    }

    public static int findShortestPath(int[][] m, int i, int j) {
        int x = rec(m, i, j, new boolean[m.length]);
        if (x < m.length) {
            return x;
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}