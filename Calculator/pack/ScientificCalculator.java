package Calculator.pack;

public class ScientificCalculator {
        public double add(double a, double b) {
            return a + b;
        }
    
        public double subtract(double a, double b) {
            return a - b;
        }
    
        public double multiply(double a, double b) {
            return a * b;
        }
    
        public double divide(double a, double b) {
            if (b != 0) {
                return a / b;
            } else {
                throw new ArithmeticException("Cannot divide by zero");
            }
        }
    
        public double squareRoot(double a) {
            return Math.sqrt(a);
        }
    
        public double power(double base, double exponent) {
            return Math.pow(base, exponent);
        }
    
        public double sine(double angleInRadians) {
            return Math.sin(angleInRadians);
        }
    
        public double cosine(double angleInRadians) {
            return Math.cos(angleInRadians);
        }
    
        public double tangent(double angleInRadians) {
            return Math.tan(angleInRadians);
        }
    }

