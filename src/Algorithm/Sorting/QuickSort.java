package Algorithm.Sorting;

import java.util.Scanner;

/**
 * Created by vijay on 10/25/16.
 */
public class QuickSort {
    static Scanner scan = new Scanner(System.in);
    static int[] array;
    static int size;
    static int p, c;

    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        size = scan.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        sortify(0, size - 1);
        for(int temp:array)
        {
            System.out.println(temp);
        }
    }

    private static void sortify(int low, int high)
    {
        if(array==null|| array.length==0)
            return;
        if(low>=high)
            return;

        int mid=low+(high-low)/2;
        int pivot=array[mid];
        int i=low;int j=high;


            while(array[i]<pivot)
            {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;

            }

        if(low<j)while(array[i]<pivot)
        {
            i++;
        }
        {
            sortify(low,j);
        }
        if(high>i)
        {
            sortify(i,high);
        }

    }
}
