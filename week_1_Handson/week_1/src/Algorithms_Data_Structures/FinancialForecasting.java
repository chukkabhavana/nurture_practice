package Algorithms_Data_Structures;

public class FinancialForecasting {

    static double forecast(int years, double currentValue, double growthRate) {
        if (years == 0) return currentValue;
        return forecast(years - 1, currentValue * (1 + growthRate), growthRate);
    }

    public static void main(String[] args) {
        double initial = 10000;
        double growthRate = 0.05; // 5%
        int years = 5;

        double result = forecast(years, initial, growthRate);
        System.out.printf("Forecast after %d years: %.2f\n", years, result);
    }
}
