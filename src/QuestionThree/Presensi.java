package QuestionThree;

public class Presensi {

    static int hitungTotalHadir(boolean[] presensi) {
        int total = 0;
        for (int i = 0; i < presensi.length; i++) {
            if (presensi[i]) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        boolean[] presensi = {true, true, false, true, true};

        int totalHadir = hitungTotalHadir(presensi);
        System.out.println("Total hari hadir: " + totalHadir);
    }
}
