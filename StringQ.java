//package SecondRound;

// There is a  String s of lowercase English letters,that is repeated infinitely many times.
// Given an integer N, find and print the number of letter a's in the first N letters of the infinite string.
// Note : You should solve this without using any extra space
// Example : aba
//            10 // abaabaabaa -> Total 10 a
// Output : 7

// Example : abcac
//            10
// Output : 4

import java.util.ArrayList;

public class StringQ
{
    public static void main(String[] args)
    {
        String str = "abcac";
        ArrayList<Integer> list = new ArrayList<>();
        int times = 10;
        find(str,list);
        System.out.println(fun(str,list,times));
    }

    public static int fun(String str,ArrayList<Integer> list,int times)
    {
        if(list.size() == 0)
        {
            return 0;
        }
        if(times % str.length() == 0)
        {
            return (times / str.length()) * list.size();
        }
        int count = (times / str.length()) * list.size();
        int rem = (times % str.length()) * list.size();

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) <= rem)
            {
                count++;
            }
            else
            {
                break;
            }
        }

        return count;
    }

    public static void find(String str,ArrayList<Integer> list)
    {
        for (int i = 0; i < str.length(); i++) {
           if(str.charAt(i) == 97)
           {
               list.add(i+1);
           }
        }
    }
}