import java.util.Arrays;

public class MaxOnesRowFinder {
    public static int findMaxOnes(int[][] matrix)
    {
        int max=0;
        int count=-1;
        for(int i=0;i<matrix.length;i++)
        {
            int sum=0;
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==1)
                {
                    sum=sum+1;
                }
            }
            if(sum>max)
            {
                max=sum;
                count=count+1;

            }

        }
        return count;
        // ADD CODE HERE //
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

        int maxRow = findMaxOnes(matrix);
        System.out.println(maxRow);
    }

}
