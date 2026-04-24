public class Main {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            int result = a / b; // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero!");
        } 
        finally {
            System.out.println("This block always executes.");
        }

        System.out.println("Program continues...");
    }
}