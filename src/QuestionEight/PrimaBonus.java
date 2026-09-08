package QuestionEight;

public class PrimaBonus {

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

    public static void main(String[] args) {
        int n = 20;

        boolean pertama = true;
        int totalPrima = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrima(i)) {
                if (!pertama) {
                    System.out.print(" ");
                }
                System.out.print(i);
                pertama = false;
                totalPrima++;
            }
        }
        System.out.println();

        System.out.println("Total bilangan prima: " + totalPrima);
    }
}
