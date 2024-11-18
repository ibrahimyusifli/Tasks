package GenericsTask1;

public class Calculator<T extends Number> {

    public double calculate(T num1, T num2, String operation) {
        double n1 = num1.doubleValue();
        double n2 = num2.doubleValue();

        switch (operation) {
            case "add":
                return n1 + n2;
            case "subtract":
                return n1 - n2;
            case "multiply":
                return n1 * n2;
            case "divide":
                if (n2 != 0) {
                    return n1 / n2;
                } else {
                    System.out.println("Cannot divide by zero");
                }
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}
