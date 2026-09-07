package QuestionThree;

public class Presensi {

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
        return (double) totalHadir / totalHari * 100;
    }

    public static void main(String[] args) {
        boolean[] presensi = {true, true, false, true, true};

        int totalHadir = hitungTotalHadir(presensi);
        System.out.println("Total hari hadir: " + totalHadir);

        double persentase = hitungPersentase(totalHadir, presensi.length);
        System.out.println("Persentase kehadiran: " + persentase + "%");
        if (persentase >= 75.0) {
            System.out.println("Memenuhi syarat kehadiran minimal 75%");
        } else {
            System.out.println("Tidak memenuhi syarat kehadiran minimal 75%");
        }

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
