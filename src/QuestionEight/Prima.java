package QuestionEight;

public class Prima {

    static boolean isPrima(int angka) {
        if (angka < 2) {
            return false;
        }
        for (int i = 2; i < angka; i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }

    static String tentukanGanjilGenap(int angka) {
        if (angka % 2 == 0) {
            return "Genap";
        } else {
            return "Ganjil";
        }
    }

    public static void main(String[] args) {
        int n = 20;

        for (int i = 2; i <= n; i++) {
            if (isPrima(i)) {
                String ganjilGenap = tentukanGanjilGenap(i);
                System.out.println(i + " (" + ganjilGenap + ")");
            }
        }
    }
}
