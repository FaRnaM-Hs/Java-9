package enterprise;

public interface Company {

    double DEFAULT_TAX_PERCENTAGE = 0.1; // It is public, final and static

    default double calculateTax(double annualTurnover) {
        return calculate(annualTurnover);
    }

    private double calculate(double annualTurnover) {
        testMethod();
        return annualTurnover * getTaxPercentage();
    }

    private static void testMethod() {
        System.out.println("This is a static method");
    }

    double getTaxPercentage();
}
