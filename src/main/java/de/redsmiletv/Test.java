package de.redsmiletv;

/**
 * The Calculator class provides methods to perform basic arithmetic operations
 * such as addition, subtraction, multiplication, and division.
 * <p>
 * Example usage:
 * <pre>
 *     Calculator calculator = new Calculator();
 *     int sum = calculator.add(5, 10);  // sum = 15
 *     int diff = calculator.subtract(10, 5);  // diff = 5
 * </pre>
 * </p>
 *
 * @author RedSmileTV
 * @version 1.0
 */

public class Test {


    private String name;

    public Test(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test() {
        System.out.println("Test");
    }
}