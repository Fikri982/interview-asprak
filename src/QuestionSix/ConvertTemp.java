package QuestionSix;

public class ConvertTemp {

    static double konversiKeFahrenheit(int celsius) {
        return (celsius * 9.0 / 5) + 32;
    }

    static String tentukanKategori(double fahrenheit) {
        if (fahrenheit < 60) {
            return "Dingin";
        } else if (fahrenheit < 85) {
            return "Sejuk";
        } else {
            return "Panas";
        }
    }

    public static void main(String[] args) {
        int[] celsius = {0, 25, 35, 40};

        double totalFahrenheit = 0;
        for (int i = 0; i < celsius.length; i++) {
            double fahrenheit = konversiKeFahrenheit(celsius[i]);
            String kategori = tentukanKategori(fahrenheit);
            System.out.println(celsius[i] + " Celsius -> " + fahrenheit + " Fahrenheit (" + kategori + ")");
            totalFahrenheit += fahrenheit;
        }

        double rataRata = totalFahrenheit / celsius.length;
        System.out.println("Rata-rata Fahrenheit: " + rataRata);
    }
}
