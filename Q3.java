import java.util.Arrays;

// Given an array of integers , rearrange the array such that second element of the array is greater than its 
// left and right element , Assume no duplicate element are present in the array

// Input : [1,2,3,4,5,6,7]

// Output : [1,3,2,5,4,7,6]

public class Q3 {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7};
        Arrays.sort(arr);
        swapArray(arr, 1, 2);
        for (int i : arr) {
            System.out.println(i);
        }
        
    }

    public static void swapArray(int[] arr,int i, int j)
    {
        if(j == arr.length || j == arr.length+1)
        {
            return;
        }
        swap(i, j, arr);
        swapArray(arr, i+2, j+2);
    }

    public static void swap(int i ,int j,int[] arr)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}