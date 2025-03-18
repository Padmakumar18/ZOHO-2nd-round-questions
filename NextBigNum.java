//package SecondRound;// From a given array of integers print the next bigger number for each number in the array
// Case 1 :
// Input : 8,4,1,9,6,2
// Output : 8->9 4->6 1->2 9->-1 6->8 2->4

// Case 2 :
// Input : 4,5,2,25
// Output : 4->5 5->25 2->4 25->-1

public class NextBigNum
{
    public static void main(String[] args)
    {
        System.out.println();
        // int[] arr = {4,5,2,25};
        int[] arr = {8,4,1,9,6,2};

        for (int i = 0; i < arr.length; i++) 
        {
            int big = 0;
            int count = 0;
            for (int j = 0; j < arr.length; j++) 
            {
                if(arr[i]<arr[j])   
                {
                    if(count == 0)
                    {
                        big = arr[j];
                        count++;
                    }
                    else
                    {
                        if(big>arr[j])
                        {
                            big=arr[j];
                        }
                    }
                }
            }
            if(count == 0)
            {
                System.out.println(arr[i]+"->"+"0 ");
            }
            else
            {
                System.out.println(arr[i]+"->"+big+",");
            }
        }
    }
}