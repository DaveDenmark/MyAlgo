package afleveringer;

/**
 * M Mandatory Exercise: Fun with Arrays Let A be an array of integers of length n. Look at the following pseudo
 code and solve the exercises
 */
public class uge1 {
    private int arrayfun(int[] A, int n) {
        for (int i = 0; i <= n-1; i++)
            for (int j = 0; j <= n-1; j++)
                for (int k = 0; k <= n-1; k++)
                    if (A[i] + A[j] + A[k] == 0);
                    System.out.println("true");


                return -1;

    }
    /**
     * M.1 Explain briefly and concisely what ARRAYFUN computes.
     */


}

