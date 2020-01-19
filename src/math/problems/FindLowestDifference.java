package math.problems;

import java.util.Arrays;

public class FindLowestDifference {

    static int findSmallestDifference(int A[], int B[],
                                      int m, int n)
    {
        // Sort both arrays
        // using sort function
        Arrays.sort(A);
        Arrays.sort(B);

        int a = 0, b = 0;

        // Initialize result as max value
        int result = Integer.MAX_VALUE;

        // Scan Both Arrays upto
        // sizeof of the Arrays
        while (a < m && b < n)
        {
            if (Math.abs(A[a] - B[b]) < result)
                result = Math.abs(A[a] - B[b]);

            // Move Smaller Value
            if (A[a] < B[b])
                a++;

            else
                b++;
        }

        // return final sma result
        return result;
    }
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int A [] = {30,12,5,9,2,20,33,1};
        int B [] = {18,25,41,47,17,36,14,19};

        int m = A.length;
        int n = B.length;

        // Call function to
        // print smallest result
        System.out.println(findSmallestDifference
                (A, B, m, n));

    }


}
