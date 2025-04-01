//package SecondRound;



// Move all zeros to start in an arry of random integers
// Note : Additional array should not be used.

// case1 : 1,2,0,4,3,0,5,0
// Output : 0,0,0,1,2,4,3,5

// case2 : 1,4,2,0,3
// Output : 0,1,4,2,3

import java.util.Arrays;

public class SetAllZeros
{
    public static void main(String[] args)
    {
//        int[] arr = {1,2,0,4,3,0,5,0};
        int[] arr = {0,1,4,2,0,3};

        for (int i = 0; i < arr.length; i++) 
        {
            if(arr[i] == 0 && i != 0)
            {
                setZeroFront(arr,i);
                arr[0] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void setZeroFront(int[] arr, int i)
    {
        for(int j=i;j>0;j--)
        {
            arr[j] = arr[j-1];
        }
    }
}
