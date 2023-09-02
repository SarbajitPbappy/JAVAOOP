package Calculator.pack;

public class ShapeCalculator {
        public double calculateCircleArea(double radius) {
            return Math.PI * radius * radius;
        }
    
        public double calculateRectangleArea(double width, double height) {
            return width * height;
        }
    
        public double calculateTriangleArea(double side1, double side2, double side3) {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
    }
