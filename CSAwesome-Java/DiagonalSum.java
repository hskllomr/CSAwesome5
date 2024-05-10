import java.util.Arrays;

public class DiagonalSum {
    public static int[] diagonalSum(int[][] matrix) {
        // ADD CODE HERE //
        int sum=0;
        int sum1=0;
        int[] array=new int[2];
        int length=matrix.length;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i==j)
                {
                    sum=sum+matrix[i][j];
                }

                if(i+j==2)
                {
                    sum1=sum1+matrix[i][j];
                }
                //  0,0    0,2
                //  1,1    1,1
                //  2,2    2,0
            }
        }
        array[0]=sum;
        array[1]=sum1;
        return array;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] diagonalSums = diagonalSum(matrix);
        System.out.println(Arrays.toString(diagonalSums));
    }
}
