class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = rowFinder(matrix,target);
        if(row == -1)
        {
            return false;
        }
        int l = 0;
        int r = matrix[0].length-1;
        while(l <= r)
        {
            int m = (l + r)/2;
            if(matrix[row][m] == target)
            {
                return true;
            }
            else if(matrix[row][m] < target)
            {
                l = m +1;
            }
            else
            {
                r = m -1;
            }
        }
        return false;
    }
    
    private int rowFinder(int[][] arr, int target)
    {
        int l = 0;
        int r = arr.length -1;
        while(l <= r)
        {
            int m = l + (r - l) / 2;
            if(target > arr[m][arr[0].length-1])
            {
                l = m +1;
            }
            else if(target < arr[m][0])
            {
                r =  m -1;
            }
            else
            {
                return m;
            } 
        }
        return -1;
    }
}
