package IBM;

import java.util.Scanner;

/**
 * Created by vijay on 11/12/16.
 */
public class SortedMatrix {
    Scanner scan;
    static int[][] array;
    static int i_max;
    static int j_max;

    SortedMatrix()
    {
        scan=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        i_max=scan.nextInt();
        System.out.println("Enter the number of columns");
        j_max=scan.nextInt();
        array=new int[i_max][j_max];
        System.out.println("Enter the matrix where every row is sorted and every column is sorted");
        for(int i=0;i<=i_max-1;i++)
        {
            for(int j=0;j<=j_max-1;j++)
            {
                array[i][j]=scan.nextInt();
            }
        }

    }
    public static void main(String[] args)
    {
        SortedMatrix sm=new SortedMatrix();

        sm.printVals(0,0,0,0);

    }

    private static void printVals(int i_c1,int j_c1,int i_c2,int j_c2) {
        while(i_c1!=i_max && j_c1!=j_max && i_c2!=i_max && j_c2!=j_max)
        {
            if(i_c1==j_c1 && i_c2==j_c2)
            {
                System.out.println(array[i_c1][j_c1]);
                i_c1+=1;
                j_c2=+1;
                continue;
            }


            if(array[i_c1][j_c1]<array[i_c2][j_c2])
            {
                System.out.println(array[i_c1][j_c1]);
                i_c1+=1;
                j_c1+=1;
            }
            else if(array[i_c1][j_c1]>array[i_c2][j_c2])
            {
                System.out.println(array[i_c2][j_c2]);
                i_c2+=1;
                j_c2+=1;
            }


        }


    }


}
