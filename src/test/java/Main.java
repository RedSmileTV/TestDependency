import de.redsmiletv.Test;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Test test = new Test("Test");
        System.out.println(test.getName());
        test.test();

    }
}
