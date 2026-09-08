package QuestionSix;

public class ConvertTempBonus {

    static double konversiKeFahrenheit(int celsius) {
        return (celsius * 9.0 / 5) + 32;
    }

    public static void main(String[] args) {
        int[] celsius = {0, 25, 100};

        double totalFahrenheit = 0;
        for (int i = 0; i < celsius.length; i++) {
            double fahrenheit = konversiKeFahrenheit(celsius[i]);
            System.out.println(celsius[i] + " Celsius -> " + fahrenheit + " Fahrenheit");
            totalFahrenheit += fahrenheit;
        }

        double rataRata = totalFahrenheit / celsius.length;
        System.out.println("Rata-rata suhu: " + rataRata + " Fahrenheit");
    }
}
