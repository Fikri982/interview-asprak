package QuestionThree;

public class PresensiBonus {

    static final String[] HARI = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

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

        String hariAbsenPertama = "Selalu hadir";
        for (int i = 0; i < presensi.length; i++) {
            if (!presensi[i]) {
                hariAbsenPertama = HARI[i];
                break;
            }
        }
        System.out.println("Hari pertama tidak hadir: " + hariAbsenPertama);
    }
}
