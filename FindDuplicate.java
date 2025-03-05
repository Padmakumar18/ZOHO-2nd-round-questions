// Find the duplicates from 1 to n
// Using Constant time
// 1 to n means = n = 5 , The array contains the elements from 1 to 5.
public class FindDuplicate
{
    public static void main(String[] args)
    {
        int[] arr = {1,3,3,4,2,2};
        findDuplicate(arr);
    }

    public static void findDuplicate(int[] arr)
    {
        for (int i:arr)
        {
            i = Math.abs(i);
            if (arr[i-1] < 0)
            {
                System.out.println(i);
            }
            arr[i-1] = arr[i-1] * -1;
        }
    }
}
