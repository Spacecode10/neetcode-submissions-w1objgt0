class Solution {
    public void func(int[][] arr, boolean[][] visited, int i, int j, int color) {
        visited[i][j] = true;
        int curr = arr[i][j];
        arr[i][j] = color;
        if ((i - 1 < 0 || arr[i - 1][j] != curr) && (j - 1 < 0 || arr[i][j - 1] != curr)
            && (i + 1 >= arr.length || arr[i + 1][j] != curr)
            && (j + 1 >= arr[i].length || arr[i][j + 1] != curr)) {
            return;
        }
        if (i - 1 > -1 && !visited[i - 1][j] && arr[i - 1][j] == curr) {
            func(arr, visited, i - 1, j, color);
        }
        if (j - 1 > -1 && !visited[i][j - 1] && arr[i][j - 1] == curr ) {
            func(arr, visited, i, j - 1, color);
        }
        if (i + 1 < arr.length && !visited[i + 1][j] && arr[i + 1][j] == curr ) {
            func(arr, visited, i + 1, j, color);
        }
        if (j + 1 < arr[0].length && !visited[i][j + 1] && arr[i][j + 1] == curr ) {
            func(arr, visited, i, j + 1, color);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {
        boolean[][] visited = new boolean[image.length][image[0].length];
        func(image,visited,sr,sc,color);
        return image;
    }
}