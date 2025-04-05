//package SecondRound;

// Strings are in competetion . Be a judge for them to qualify . You are lenient judge . So you will accept small
// changes , that are specified in rule 2 and 3 the rules are simple as fallow :
// "Shortlisted" . If number of each character in the string is equal to its frequency
// "Less 'character' Shortlisted" . only one character in the string can be one less than its frequency
// "More 'character' Shortlisted" . Only one character in the string can be one greater than its frequency.
// "Rejected" . If all the above rules fails.

//case 1 :
// The first line conatains how many strings are going to be entered N .
// The next N lin are going to be strings.

// 3
// aba
// bbccca
// ba

//Output :
// Rejected
// Shortlisted
// Less b Shortlisted

import java.util.*;


public class ZumakaZooo
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter input count");
        int N = obj.nextInt();
        String arr1[] = new String[N];
        System.out.println("Enter "+N+ " String");
        for (int i = 0; i < N; i++) {
            arr1[i] = obj.next();
        }
        for (int k = 0; k < N; k++) {
            String v = arr1[k];
            char arr2[] = new char[v.length()];
            for (int y = 0; y < v.length(); y++) {
                arr2[y] = v.charAt(y);
            }
            int r = 0;
            for (int m = 0; m < arr2.length; m++) {
                for (int z = 0; z < arr2.length; z++) {
                    if (arr2[m] > arr2[z]) {
                        char temp = arr2[m];
                        arr2[m] = arr2[z];
                        arr2[z] = temp;
                    }
                }
            }
            char temp1 = arr2[0];
            String a[] = { null, null };
            int temp = 0;
            for (int y = 0; y < arr2.length; y++) {
                if (temp1 == arr2[y]) {
                    r++;
                }
                if (temp1 != arr2[y] || y == arr2.length - 1) {
                    int value = temp1 - 96;
                    if (r == value - 1) {
                        if (temp < 2)
                            a[temp] = "less " + temp1 + " shortlisted";
                        temp++;
                    } else if (r == value + 1) {
                        if (temp < 2)
                            a[temp] = "more " + temp1 + " shortlisted";
                        temp++;
                    } else if (r > value + 1 || r < value - 1) {
                        if (temp < 2)
                            a[temp] = "rejected";
                        temp++;
                    }
                    temp1 = arr2[y];
                    r = 1;
                }
            }
            if (a[0] != null && a[1] != null) {
                System.out.println("rejected");
            } else if (a[0] != null) {
                System.out.println(a[0]);
            } else {
                System.out.println("shortlisted");
            }

        }
    }
}
