// Input format : The first line contain T the number of testcases.
// It is fallowed by T lines where each line contains a string S denoting the name of chemical reactions

// constraints
// 1 <= T <= 1000
// 1 <= S <= 10000
// Note : The given string S contains only ODD length

// Input : 2
// ACIDIFICATION
// HYDRATION

public class ChemicalBomb
{
    public static void main(String[] args)
    {
        String str1 = "ACIDIFICATION";
        String str2 = "HYDRATION";

        int a = str2.length() / 2;
        int b = a;

        for (int i = 0; i < str2.length(); i++)
        {
            String s = str2.charAt(a)+"";
            s += str2.charAt(b);
            for (int j = 0; j < str2.length(); j++)
            {
                if(j==0 || j == str2.length()-1)
                {
                    System.out.print(s.charAt(0));
                }
                else if(j == i || i+j == str2.length()-1)
                {
                    System.out.print(s.charAt(1));
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(i >= str2.length()/2)
            {
                a --;
                b ++;
            }
            else
            {
                a ++ ;
                b --;
            }
        }
    }
}