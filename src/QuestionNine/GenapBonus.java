package QuestionNine;

public class GenapBonus {

    static int hitungGenap(int[] data) {
        int jumlah = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                jumlah++;
            }
        }
        return jumlah;
    }

    public static void main(String[] args) {
        int[] data = {3, 4, 7, 8, 10, 11};

        int jumlahGenap = hitungGenap(data);
        double proporsi = (jumlahGenap / (double) data.length) * 100;

        System.out.println("Jumlah bilangan genap: " + jumlahGenap);
        System.out.println("Proporsi bilangan genap: " + proporsi + "%");

        int genapTerbesar = Integer.MIN_VALUE;
        int genapTerkecil = Integer.MAX_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                if (data[i] > genapTerbesar) {
                    genapTerbesar = data[i];
                }
                if (data[i] < genapTerkecil) {
                    genapTerkecil = data[i];
                }
            }
        }

        System.out.println("Bilangan genap terbesar: " + genapTerbesar);
        System.out.println("Bilangan genap terkecil: " + genapTerkecil);
    }
}
