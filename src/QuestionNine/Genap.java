package QuestionNine;

public class Genap {

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
        int[] data = {2, 4, 6, 8, 10, 12};

        int jumlahGenap = hitungGenap(data);
        double proporsi = (jumlahGenap / (double) data.length) * 100;

        System.out.println("Jumlah bilangan genap: " + jumlahGenap);
        System.out.println("Proporsi bilangan genap: " + proporsi + "%");
    }
}
