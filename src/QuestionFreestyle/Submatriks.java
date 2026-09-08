package QuestionFreestyle;

public class Submatriks {

    static int kadane(int[] arr) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    static int maxSumSubmatriks(int[][] matriks) {
        int n = matriks.length;
        int m = matriks[0].length;
        int maxSum = Integer.MIN_VALUE;

        for (int c1 = 0; c1 < m; c1++) {
            int[] temp = new int[n];
            for (int c2 = c1; c2 < m; c2++) {
                for (int r = 0; r < n; r++) {
                    temp[r] += matriks[r][c2];
                }
                maxSum = Math.max(maxSum, kadane(temp));
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, -1, -4, -20},
            {-8, -3, 4, 2, 1},
            {3, 8, 10, 1, 3},
            {-4, -1, 1, 7, -6}
        };

        System.out.println(maxSumSubmatriks(matriks));
    }
}
