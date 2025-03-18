// Given an unsorted array of integer , find the largest contigous pair sum in array
// arr = [0,5,6,0,9,0,0,1] = 11
// arr = [12,31,10,6,40] = 46
// arr = [3,5,4,4] = 9

//contigous means continue


public class Q2 
{
    public static void main(String[] args) {
        System.out.println("     ");
        System.out.println("     ");
        int[] arr = {0,5,6,0,9,0,0,1};
        // int[] arr = {12,31,10,6,40};
        // int[] arr = {3,5,4,4};
        int ans[] = {0};
        findLargestSum(0,1,arr,ans);
        System.out.println(ans[0]);
    }

    public static void findLargestSum(int i,int j,int[] arr,int[] ans)
    {
        if( i == arr.length - 1 )
        {
            return;
        }

        int temp = arr[i] + arr[j] ;
        if(temp > ans[0])
        {
            ans[0] = temp ;
        }
        findLargestSum(i+1, j+1, arr, ans);
    }
}