package QuestionFour;

public class Fruit {

    static boolean isAnggota(String[] himpunan, String target) {
        for (int i = 0; i < himpunan.length; i++) {
            if (himpunan[i].equals(target)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] himpunanKata = {"apel", "jeruk", "mangga", "jeruk"};
        String target = "jeruk";

        System.out.println(target + " merupakan anggota himpunan: " + isAnggota(himpunanKata, target));
    }
}
