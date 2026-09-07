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

    public static void main(String[] args) {
        int[] suhu = {24, 30, 18, 27, 33, 21};

        int max = cariMax(suhu);
        int min = cariMin(suhu);
        int jangkauan = max - min;

        System.out.println("Suhu tertinggi kota Surabaya: " + max);
        System.out.println("Suhu terendah kota Surabaya: " + min);
        System.out.println("Jangkauan suhu: " + jangkauan);
    }
}
