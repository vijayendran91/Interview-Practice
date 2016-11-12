package IBM;

import java.util.Scanner;

/**
 * Created by vijay on 10/13/16.
 * https://www.careercup.com/question?id=15488769
 *
 */

 public class ArrayArrange
{

    static Scanner scan=new Scanner(System.in);
    static int[] vals;
    static int N,minp;
    public static void main(String[] args)
    {
        int option=0;
        System.out.println("Enter the number of values");
        N=scan.nextInt();
        System.out.println("Enter your option: \n 1. Fill Randomly \n 2. Let me do this");
        option=scan.nextInt();
        switch(option)
        {
            case 1:
                reandomVals();
                break;
            case 2:
                getVals();

        }
        for(int temp: vals)
        {
            System.out.println(temp);
        }
    }

    private static void getVals() {
        vals=new int[N];
        for(int i=0;i<N;i++)
        {
            vals[i]=scan.nextInt();
        }
        arrangeArray();

    }

    private static void arrangeArray() {
        minp=0;
        for(int i=0;i<N;i++)
        {
            if(vals[i]<0)
            {
               swapval(minp,i);
                minp++;
            }
            if(vals[i]==0)
                continue;

        }
    }

    private static void swapval(int minp, int i) {
        int temp;
        temp=vals[i];
        vals[i]=vals[minp];
        vals[minp]=temp;

    }

    private static void reandomVals() {
        vals=new int[N];
        for (int i=0;i<N;i++)
        {
            vals[i]= ((int) Math.random());

        }
        arrangeArray();

    }


}
