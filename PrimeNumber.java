//package SecondRound;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        int num = 7 ;
        int c = 2 ;
        while(c*c<=num)
        {
            if(num % c == 0)
            {
                System.out.println("Not Prime");
                break;
            }
            c++;
        }
        System.out.println("Prime");
    }
}
