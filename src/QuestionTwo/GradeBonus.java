package QuestionTwo;

public class GradeBonus {

    static String tentukanGrade(int nilai) {
        if (nilai >= 86 && nilai <= 100) {
            return "A";
        } else if (nilai >= 76) {
            return "AB";
        } else if (nilai >= 66) {
            return "B";
        } else if (nilai >= 61) {
            return "BC";
        } else if (nilai >= 56) {
            return "C";
        } else if (nilai >= 41) {
            return "D";
        } else {
            return "E";
        }
    }

    static boolean isLulus(String grade) {
        return !grade.equals("D") && !grade.equals("E");
    }

    public static void main(String[] args) {
        int[] nilai = {90, 60, 40, 75, 88};

        int totalLulus = 0;
        int totalNilaiLulus = 0;
        for (int i = 0; i < nilai.length; i++) {
            String grade = tentukanGrade(nilai[i]);
            System.out.println("Nilai " + nilai[i] + " -> Grade " + grade);
            if (isLulus(grade)) {
                totalLulus++;
                totalNilaiLulus += nilai[i];
            }
        }

        System.out.println("Total lulus: " + totalLulus);

        double rataRataLulus = (double) totalNilaiLulus / totalLulus;
        System.out.println("Rata-rata nilai yang lulus: " + rataRataLulus);
    }
}
