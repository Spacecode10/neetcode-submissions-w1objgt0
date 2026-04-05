class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = getRow(matrix, target);
        System.out.print(row);
        if(row == -1)
        {
            return false;
        }
        int l = 0;
        int r = matrix[0].length - 1;
        while(l <= r)
        {
            int m = (l+ r)/2;
            if(matrix[row][m] == target)
            {
                return true;
            }
            else if(matrix[row][m] < target)
            {
                l = m+1;
            }
            else
            {
                r = m-1;
            }
        }
        return false;

    }
    private int getRow(int[][] matrix, int target)
{
    int l = 0;
    int r = matrix.length - 1;

    while(l <= r)
    {
        int m = (l + r) / 2;

        if(target >= matrix[m][0] && target <= matrix[m][matrix[0].length - 1])
        {
            return m;
        }
        else if(target < matrix[m][0])
        {
            r = m - 1;
        }
        else
        {
            l = m + 1;
        }
    }

    return -1;
}
}
