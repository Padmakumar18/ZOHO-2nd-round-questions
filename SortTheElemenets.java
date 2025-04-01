//package SecondRound;// Write a program to sort the elements in odd positions in descending order and even
// positions in ascending order

//Input:  arr[] = {13,2,4,15,12,10,5}
//Output: arr[] = {4,15,5,10,12,2,13}
 
public class SortTheElemenets {
    public static void main(String[] args) {
        System.out.println(" ");
        int[] arr = {13,2,4,15,12,10,5};
                  // 0  1 2  3  4  5  6
        for (int i = 0; i < arr.length; i++) 
        {
            if(i%2==0)
            {
                int small = Integer.MAX_VALUE;
                int index = 0;
                for (int j = 0; j < arr.length; j+=2)
                {
                    if(arr[j] < small && arr[j] != -1)
                    {
                        small = arr[j];
                        index = j;
                    }
                }
                arr[index] = -1;
                System.out.print(small+",");
            }
            else
            {
                int big = 0;
                int index = 0;
                for (int j = 1; j < arr.length; j+=2) 
                {
                    if(arr[j]>=big && arr[j] != -1)
                    {
                        big = arr[j];
                        index = j;
                    }
                }
                arr[index] = -1;
                System.out.print(big+",");
            }
        }

    }
}
