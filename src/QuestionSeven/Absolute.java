package QuestionSeven;

public class Absolute {

    static int hitungSelisihMutlak(int nilai, int kkm) {
        return Math.abs(nilai - kkm);
    }

    public static void main(String[] args) {
        int[] nilai = {60, 75, 68, 90};
        int kkm = 70;

        int nilaiTerdekat = nilai[0];
        int selisihTerkecil = hitungSelisihMutlak(nilai[0], kkm);

        for (int i = 1; i < nilai.length; i++) {
            int selisih = hitungSelisihMutlak(nilai[i], kkm);
            if (selisih < selisihTerkecil) {
                selisihTerkecil = selisih;
                nilaiTerdekat = nilai[i];
            }
        }

        System.out.println("Nilai paling dekat dengan KKM: " + nilaiTerdekat);
    }
}
