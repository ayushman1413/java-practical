public class MainApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        calc.showMessage();
        int result = calc.multiply(5, 4);
        
        System.out.println("Result of multiplication: " + result);
    }
}

class Calculator {
    void showMessage() {
        System.out.println("Calculator is ready.");
    }

    int multiply(int a, int b) {
        return a * b;
    }
}