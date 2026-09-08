package QuestionFreestyle;

public class SubmatriksBonus {

    // return[0] = jumlah maksimum, return[1] = index awal, return[2] = index akhir
    static int[] kadaneWithIndex(int[] arr) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxEndingHere + arr[i]) {
                maxEndingHere = arr[i];
                tempStart = i;
            } else {
                maxEndingHere += arr[i];
            }

            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
                start = tempStart;
                end = i;
            }
        }

        return new int[]{maxSoFar, start, end};
    }

    // return[0] = jumlah maksimum, return[1..2] = r1,r2, return[3..4] = c1,c2
    static int[] maxSumSubmatriks(int[][] matriks) {
        int n = matriks.length;
        int m = matriks[0].length;

        int maxSum = Integer.MIN_VALUE;
        int bestR1 = 0, bestR2 = 0, bestC1 = 0, bestC2 = 0;

        for (int c1 = 0; c1 < m; c1++) {
            int[] temp = new int[n];
            for (int c2 = c1; c2 < m; c2++) {
                for (int r = 0; r < n; r++) {
                    temp[r] += matriks[r][c2];
                }

                int[] hasil = kadaneWithIndex(temp);
                if (hasil[0] > maxSum) {
                    maxSum = hasil[0];
                    bestR1 = hasil[1];
                    bestR2 = hasil[2];
                    bestC1 = c1;
                    bestC2 = c2;
                }
            }
        }

        return new int[]{maxSum, bestR1, bestR2, bestC1, bestC2};
    }

    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, -1, -4, -20},
            {-8, -3, 4, 2, 1},
            {3, 8, 10, 1, 3},
            {-4, -1, 1, 7, -6}
        };

        int[] hasil = maxSumSubmatriks(matriks);
        System.out.println(hasil[0]);
        System.out.println("Koordinat: baris " + hasil[1] + "-" + hasil[2] + ", kolom " + hasil[3] + "-" + hasil[4]);
    }
}
