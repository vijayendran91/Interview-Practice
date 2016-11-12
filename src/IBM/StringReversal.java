package IBM;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by vijay on 10/13/16.
 * https://www.careercup.com/question?id=5640880330375168
 */
public class StringReversal {
    static String input;
    static ArrayList<String> slist=new ArrayList<String>();
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args)
    {

        input=scan.nextLine();
        String[] ins;
        String case_changed="";
        ins=input.split("\\s+");
        char[] in;
        for(String temp:ins)
        {
            String temps="";
            in=new char[temp.length()];
            temp.getChars(0,temp.length(),in,0);
            in[0]=Character.toLowerCase(in[0]);
            in[temp.length()-1]=Character.toUpperCase(in[temp.length()-1]);
            temps=String.valueOf(new StringBuffer(String.valueOf(in)).reverse());
            temps+=" ";
            case_changed+=temps;

        }

        System.out.println(case_changed);


    }


}
