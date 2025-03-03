// Given an array , the distance between two array value is the number of inidice between them.
// Find the minimum distance between any part of equal elements in the array. If no such value exits return -1

// Example : 7,1,3,4,1,7
// Output : 3

// Example : 1,2,3,4,10
// Output : -1

class ArrayQ1
{
    public static void main(String[] args) {
        int[] arr = {7,1,3,4,9,7};
        System.out.println(fun(arr));
    }

    public static int fun(int[] arr)
    {
        int d = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] == arr[i] &&  j - i < d)
                {
                    d = j - i;
                }
            }
        }
        return d == Integer.MAX_VALUE ? -1 : d;
    }
}