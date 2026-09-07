package QuestionOne;

public class Temperature {

    static int cariMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] suhu = {24, 30, 18, 27, 33, 21};

        int max = cariMax(suhu);

        System.out.println("Suhu tertinggi kota Surabaya: " + max);
    }
}
