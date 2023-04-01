public class Wk3Method {

    //I used fictional tax brackets for this exercise
    public static void main(String[] args) {
        double yearlyIncome = 50000; // example input
        double taxPercentage = calculateIncomeTaxPercentage(yearlyIncome);
        System.out.println("Tax Percentage: " + taxPercentage + "%");
    }

    public static double calculateIncomeTaxPercentage(double yearlyIncome) {
        double taxPercentage = 0;

        if (yearlyIncome <= 10000) {
            taxPercentage = 0; // 0% tax for income up to 10,000
        } else if (yearlyIncome > 10000 && yearlyIncome <= 50000) {
            taxPercentage = 10; // 10% tax for income between 10,001 and 50,000
        } else {
            taxPercentage = 20; // 20% tax for income above 50,000
        }

        return taxPercentage;
    }
}
