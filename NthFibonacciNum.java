//package SecondRound;

public class NthFibonacciNum
{
    public static void main(String[] args) {
        System.out.println(findNum(7));
        System.out.println(fiboFormula(7));
    }

    public static int findNum(int n)
    {
          if(n < 2)
          {
              return n;
          }
          return findNum(n-1) + findNum(n-2);
    }

    public static int fiboFormula(int num)
    {
        return (int)(Math.pow(((1+Math.sqrt(5))/2),num)/(Math.sqrt(5)));
    }
}
