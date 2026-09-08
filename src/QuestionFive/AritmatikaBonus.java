package QuestionFive;

public class AritmatikaBonus {

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

        boolean hasil = isBarisanAritmatika(data);
        System.out.println("Merupakan barisan aritmatika: " + hasil);
        if (hasil) {
            int beda = data[1] - data[0];
            System.out.println("Beda: " + beda);

            int a = data[0];
            int sukuKe10 = a + (10 - 1) * beda;
            System.out.println("Suku ke-10: " + sukuKe10);
        }
    }
}
