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

    static double hitungPersentase(int totalHadir, int totalHari) {
        return (totalHadir / (double) totalHari) * 100;
    }

    public static void main(String[] args) {
        boolean[] presensi = {true, true, false, true, true};

        int totalHadir = hitungTotalHadir(presensi);
        double persentase = hitungPersentase(totalHadir, presensi.length);

        System.out.println("Total hari hadir: " + totalHadir);
        System.out.println("Memenuhi syarat 75%: " + (persentase >= 75.0));
    }
}
