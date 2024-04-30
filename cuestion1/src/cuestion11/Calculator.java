package cuestion11;

public class Calculator {
    int sumar(int a, int b) {
        return a + b;
    }

    double sumar(double a, double b) {
        return a + b;
    }
    public class Main {
        public static void main(String[] args) {
            Calculator calc = new Calculator();
            
            System.out.println(calc.sumar(5, 3));      // Salida: 8
            System.out.println(calc.sumar(5.5, 3.5));  // Salida: 9.0
        }
    }
}
