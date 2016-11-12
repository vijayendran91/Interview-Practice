package IBM;

import java.util.Scanner;

/**
 * Created by vijay on 11/12/16.
 * You are given an array of positive integers. Convert it to a sorted array with minimum cost. Only valid operation are
 * 1) Decrement -> cost = 1
 * 2) Delete an element completely from the array -> cost = value of element

 *    For example:
 *    4,3,5,6, -> cost 1
 *    10,3,11,12 -> cost 3
 */



public class MinimumCostSorting {

    static int[] array;
    static Scanner scan=new Scanner(System.in);
    static int i=0,j=1,cost=0;

    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        array=new int[scan.nextInt()];
        System.out.println("Enter the value");


        for(int k=0;k<array.length;k++)
        {
            array[k]=scan.nextInt();
        }

        sort();
        System.out.println("Cost of sorting is:"+cost);
        System.out.print("And the sorted array is :");
        for(int k=0;k<array.length;k++)
        {
            System.out.print("\t"+array[k]);
        }

    }

    private static void sort()
    {
        while(j!=array.length && i!=array.length)
        {
            if(array[i]>array[j])
            {
                if((array[i]-array[j])>=array[j])
                {
                    cost+=array[j];
                    array=deleteVal(array,j);
                    continue;
                }
                else
                {
                    cost+=array[i]-array[j];
                    array[i]=array[j];

                }
            }
            else
            {break;}
        }

    }

    private static int[] deleteVal(int[] array, int x)
    {
        int y=0;
        int[] temparr=new int[array.length-1];
        for(int z=0;z<array.length;z++)
        {
            if(z==x)
            {
                continue;
            }
            else
            {
                temparr[y]=array[z];
                y++;
            }

        }
        return temparr;

    }

}
