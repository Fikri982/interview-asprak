package QuestionSeven;

public class AbsoluteBonus {

    static int hitungSelisihMutlak(int nilai, int kkm) {
        return Math.abs(nilai - kkm);
    }

    public static void main(String[] args) {
        int[] nilai = {60, 75, 68, 90};
        int kkm = 70;

        int nilaiTerdekat = nilai[0];
        int selisihTerkecil = hitungSelisihMutlak(nilai[0], kkm);
        int totalMencapaiKkm = 0;

        for (int i = 0; i < nilai.length; i++) {
            int selisih = hitungSelisihMutlak(nilai[i], kkm);
            if (selisih < selisihTerkecil) {
                selisihTerkecil = selisih;
                nilaiTerdekat = nilai[i];
            }
            if (nilai[i] >= kkm) {
                totalMencapaiKkm++;
            }
        }

        System.out.println("Nilai paling dekat dengan KKM: " + nilaiTerdekat);
        System.out.println("Selisih: " + selisihTerkecil);
        System.out.println("Total siswa mencapai KKM: " + totalMencapaiKkm);
    }
}
