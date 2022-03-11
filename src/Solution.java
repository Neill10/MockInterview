import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int number = sc.nextInt();

        ArrayList<String> list = new ArrayList<String>();
        int repeat = str.length() - number ;
        for( int i = 0; i < repeat + 1; i++)
        {
            String s = str.substring(0,number);
            str = str.substring(1);
            list.add(s);
        }

        for(int i = 0; i < list.size(); i++)
        {
            for(int x = 0; x < list.size(); x++)
            {
                if(x!= i)
                {
                    int greater = list.get(i).compareTo(list.get(x));
                    if(greater < 0)
                    {
                        String replaced = list.get(x);
                        list.set(x,list.get(i));
                        list.set(i,replaced);
                    }

                }
            }
        }
        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));
    }
}