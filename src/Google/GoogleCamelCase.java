package Google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by vijay on 10/13/16.
 *https://www.careercup.com/question?id=5660887265312768
 */
public class GoogleCamelCase {

    static ArrayList<String> list=new ArrayList<String>();
    static Scanner scan=new Scanner(System.in);
    static HashMap<String,String> map;
    static String value;
    static ArrayList<HashMap> maplist=new ArrayList<HashMap>();


    public static void main(String[] args) {
        System.out.println("Enter the number of elements");
        int n=scan.nextInt();
        System.out.println("Enter the list");
        for (int i=0;i<n;i++)
        {
            list.add(scan.next());
        }
        System.out.println(list);
        System.out.println("Enter your value");
        value=scan.next();
        splitCapList();
        findCC();

    }

    public static void findCC()
    {

        for (HashMap temp:maplist)
        {
            System.out.println(temp.get(value));

        }



    }

    public static void splitCapList()
    {

            for (int i=0;i<list.size();i++) {
                String temp=list.get(i);
                char[] tem=new char[temp.length()];
                temp.getChars(0,temp.length(),tem,0);
                String a="";
                String b="";
                map= new HashMap<String, String>();
                for (char buff:tem)
                {
                    if(Character.isUpperCase(buff))
                    {
                        a+=buff;
                        map.put(a,temp);
                        b+=buff;
                        map.put(b,temp);
                    }
                    else
                    {
                        b+=buff;
                        map.put(b,temp);
                    }
                }
                maplist.add(map);
                //System.out.println(map);
            }

    }













}
