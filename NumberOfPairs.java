//package SecondRound ;

// There is large pile of socks that must be paired by color . Given an array of integers representing the color of each socks
// Determine how many pairs of socks with matching color there are.

// Example : 10 20 20 10 10 10 30 50 10 20
// 3

public class NumberOfPairs
{
    public static void main(String[] args)
    {
        int[] arr = { 10 , 10 , 20 , 20 , 20 , 10 , 20 } ;
        System.out.println(fun(arr));
    }

    public static int fun(int[] arr)
    {
        int count = 0;
        int lastIndex = arr.length - 1 ;

        for (int i = 0; i <lastIndex; i++)
        {
            for (int j = i+1; j <=lastIndex; j++)
            {
                if(arr[i] == arr[j])
                {
                    int temp = arr[j] ;
                    arr[j] = arr[lastIndex];
                    arr[lastIndex] = temp;
                    lastIndex -- ;
                    count ++ ;
                    break;
                }
            }
        }
        return count;
    }
}