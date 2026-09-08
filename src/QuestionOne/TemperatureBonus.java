package QuestionOne;

public class TemperatureBonus {

    static int cariMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int cariMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static double hitungRataRata(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return (double) total / arr.length;
    }

    public static void main(String[] args) {
        int[] suhu = {24, 30, 18, 27, 33, 21};

        int max = cariMax(suhu);
        int min = cariMin(suhu);
        int jangkauan = max - min;
        double rataRata = hitungRataRata(suhu);

        System.out.println("Suhu tertinggi kota Surabaya: " + max);
        System.out.println("Suhu terendah kota Surabaya: " + min);
        System.out.println("Jangkauan: " + jangkauan);
        System.out.println("Rata-rata suhu: " + rataRata);
    }
}
