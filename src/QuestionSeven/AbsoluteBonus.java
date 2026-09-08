package QuestionSeven;

public class AbsoluteBonus {

    static int hitungSelisihMutlak(int nilai, int kkm) {
        return Math.abs(nilai - kkm);
    }

    static int hitungJumlahLulusKKM(int[] nilai, int kkm) {
        int jumlah = 0;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] >= kkm) {
                jumlah++;
            }
        }
        return jumlah;
    }

    public static void main(String[] args) {
        int[] nilai = {60, 75, 68, 90};
        int kkm = 70;

        int nilaiTerdekat = nilai[0];
        int selisihTerkecil = hitungSelisihMutlak(nilai[0], kkm);
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            int selisih = hitungSelisihMutlak(nilai[i], kkm);
            if (selisih < selisihTerkecil) {
                selisihTerkecil = selisih;
                nilaiTerdekat = nilai[i];
            }
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }

        int jumlahLulusKkm = hitungJumlahLulusKKM(nilai, kkm);

        System.out.println("Nilai paling dekat dengan KKM: " + nilaiTerdekat);
        System.out.println("Selisih: " + selisihTerkecil);
        System.out.println("Jumlah siswa mencapai KKM: " + jumlahLulusKkm);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }
}
