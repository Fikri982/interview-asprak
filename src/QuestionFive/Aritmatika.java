package QuestionFive;

public class Aritmatika {

    static boolean isBarisanAritmatika(int[] data) {
        int beda = data[1] - data[0];
        for (int i = 2; i < data.length; i++) {
            if (data[i] - data[i - 1] != beda) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] data = {2, 4, 6, 8, 10};

        System.out.println("Merupakan barisan aritmatika: " + isBarisanAritmatika(data));
    }
}
