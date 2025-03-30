//package SecondRound;

// Find all the numbers from M to N that satisfy the fallowing conditions.
// 1) Take a number Z and add all its digits to get a number X.
// 2) Now reverse the number X to Y.
// 3) If we multiply X and Y you should get back Z.

// case1 : 0 100
// 1 , 81

// Explanation 81 : 8 + 1 = 9 , reverse 9 * 9 = 81
public class Q
{
    public static void main(String[] args)
    {
        int from = 1;
        int to = 100;

        while (from <= to)
        {
            int Z = from++;
            int temp = Z ;
            int X = 0 ; // Add all digits
            int Y = 0 ; // Reverse the X
            while(temp > 0)
            {
                X = X + temp % 10 ;
                temp = temp / 10 ;
            }
            int temp1 = X ;
            while(temp1 > 0)
            {
                Y = Y * 10 + temp1 % 10 ;
                temp1 = temp1 / 10 ;
            }

            if(X * Y == Z && Z != 0)
            {
                System.out.println(Z);
            }
        }
    }
}
