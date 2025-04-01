// Given an array [input] , find the sum of elements present in specified gap in [input]
//n can be any positive integer array elements can be integers

// Enter array size : 13
// Enter array : {1,2,3,4,5,6,7,8,9,10,11,12,13};
// Enter gap : 3 

//Output : 30 , 26 , 30

// Explanation sum [1+4+7+10+13] = 30
// Explanation sum [2+5+8+11] = 26
// Explanation sum [3+6+9+12] = 30


public class Q1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int gap = 3;
        for (int i = 0; i < gap; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j=j+gap) {
                sum = sum + arr[j];
            }
            System.out.println(sum);
        }
    }
}