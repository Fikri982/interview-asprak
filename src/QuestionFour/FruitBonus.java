package QuestionFour;

public class FruitBonus {

    static boolean isAnggota(String[] himpunan, String target) {
        for (int i = 0; i < himpunan.length; i++) {
            if (himpunan[i].equals(target)) {
                return true;
            }
        }
        return false;
    }

    static int cariPosisi(String[] himpunan, String target) {
        for (int i = 0; i < himpunan.length; i++) {
            if (himpunan[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    static int hitungTotalKemunculan(String[] himpunan, String target) {
        int total = 0;
        for (int i = 0; i < himpunan.length; i++) {
            if (himpunan[i].equals(target)) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        String[] himpunanBuah = {"apel", "jeruk", "mangga", "jeruk"};
        String target = "jeruk";

        System.out.println(target + " merupakan anggota himpunan: " + isAnggota(himpunanBuah, target));
        System.out.println("Posisi pertama ditemukan: " + cariPosisi(himpunanBuah, target));
        System.out.println("Total kemunculan: " + hitungTotalKemunculan(himpunanBuah, target));
    }
}
