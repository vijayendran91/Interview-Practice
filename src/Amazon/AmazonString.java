package Amazon;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created by vijay on 10/13/16.
 * https://www.careercup.com/question?id=5660887265312768
 */
public class AmazonString {
    static Scanner scan=new Scanner(System.in);
    static String input;
    static LinkedHashMap<String,String> map=new LinkedHashMap<String,String>();


    public static void main(String[] args) {

        input=scan.next();
        input=new StringBuffer(input).reverse().toString();
        splitAddMap();
        System.out.println(map);

    }

    private static void splitAddMap()
    {
        char[] chars=new char[input.length()];
        input.getChars(0,input.length(),chars,0);
        for(char temp:chars)
        {
            if (!map.containsValue(temp))
            map.put(String.valueOf(temp),String.valueOf(temp));
        }

    }



}
