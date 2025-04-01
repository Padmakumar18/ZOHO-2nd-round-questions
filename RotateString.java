//package SecondRound;


// Take a String input and rotate it n times in thr given directions d and print the result
// "Zoho Corporation"
//4
// R

// tionzoho corpora

// "Hello"
// 9
// L
// elloH

// beacuse -> 9 / 5 = 1 time is enough

public class RotateString
{
    public static void main(String[] args)
    {
        String str = "hello";
        StringBuffer ans = new StringBuffer();
        int times = 4;
        char side = 'R';

        times = times > str.length() ? times / str.length() : times;

        if(side == 'R')
        {
            for(int i=str.length()-times;i<str.length();i++)
            {
                ans.append(str.charAt(i));
            }

            for(int i=0;i<str.length()-times;i++)
            {
                ans.append(str.charAt(i));
            }
            System.out.println(ans);
        }
        else
        {
            for(int i=times;i<str.length();i++)
            {
                ans.append(str.charAt(i));
            }

            for(int i=0;i<times;i++)
            {
                ans.append(str.charAt(i));
            }
            System.out.println(ans);
        }


//        System.out.println(str.length());
//        String sb =
    }
}
