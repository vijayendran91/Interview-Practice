package IBM;

import java.util.Scanner;

/**
 * Created by vijay on 10/13/16.
 * https://www.careercup.com/question?id=15430872
 */
public class Sorted2DArray {
    static Scanner scan=new Scanner(System.in);
    static int row,col,value;
    static int[][] matrix;
    public static void main(String[] args) {
        System.out.println("Enter the size of the matrix (row and column)");
        row = scan.nextInt();
        col = scan.nextInt();
        matrix = new int[row][col];
        for (int i = 0; i < row; i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix[i][j]=scan.nextInt();

            }

        }

        System.out.println("Enter the value to search");

        int i=0;
        int j=col-1;
        int val=scan.nextInt();
        //System.out.println(row+""+col);
        while(i<row && j>0)
        {
            if(matrix[i][j]>val)
            {
                j--;
            }
            if(matrix[i][j]<val)
            {
                i++;

            }
            if (matrix[i][j]==val)
            {
                System.out.println(i+""+j);
                break;

            }
        }





    }
}
