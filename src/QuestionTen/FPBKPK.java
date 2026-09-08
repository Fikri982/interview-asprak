package QuestionTen;

public class FPBKPK {

    static int hitungFPB(int a, int b) {
        int kecil = Math.min(a, b);
        for (int i = kecil; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    static int hitungKPK(int a, int b, int fpb) {
        return (a * b) / fpb;
    }

    public static void main(String[] args) {
        int[] data = {12, 18, 20, 30, 7, 14};

        for (int i = 0; i < data.length; i += 2) {
            int a = data[i];
            int b = data[i + 1];
            int fpb = hitungFPB(a, b);
            int kpk = hitungKPK(a, b, fpb);
            System.out.println("Pasangan (" + a + ", " + b + ") -> FPB: " + fpb + ", KPK: " + kpk);
        }
    }
}
