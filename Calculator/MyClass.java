package Calculator;

import java.util.Scanner;
import Calculator.pack.ScientificCalculator;
import Calculator.pack.ShapeCalculator;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        ScientificCalculator scientificCalculator = new ScientificCalculator();

        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println("Choose an operation:");
            System.out.println("1. Calculate Area of Shapes");
            System.out.println("2. Perform Scientific Calculations");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showShapeMenu(shapeCalculator);
                    break;
                case 2:
                    showScientificMenu(scientificCalculator);
                    break;
                case 3:
                    continueCalculating = false;
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }

        scanner.close();
    }

    private static void showShapeMenu(ShapeCalculator shapeCalculator) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        int shapeChoice = scanner.nextInt();

        double area = 0.0;

        switch (shapeChoice) {
            case 1:
                System.out.print("Enter radius of circle: ");
                double radius = scanner.nextDouble();
                area = shapeCalculator.calculateCircleArea(radius);
                break;
            case 2:
                System.out.print("Enter width of rectangle: ");
                double width = scanner.nextDouble();
                System.out.print("Enter height of rectangle: ");
                double height = scanner.nextDouble();
                area = shapeCalculator.calculateRectangleArea(width, height);
                break;
            case 3:
                System.out.print("Enter sides of triangle (side1 side2 side3): ");
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double side3 = scanner.nextDouble();
                area = shapeCalculator.calculateTriangleArea(side1, side2, side3);
                break;
            default:
                System.out.println("Invalid choice! Please select a valid shape.");
                return;
            }

        System.out.println("Calculated Area: " + area);
        scanner.close();
    }

    private static void showScientificMenu(ScientificCalculator scientificCalculator) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a scientific calculation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("7. Sine");
        System.out.println("8. Cosine");
        System.out.println("9. Tangent");
        int sciChoice = scanner.nextInt();

        if (sciChoice >= 1 && sciChoice <= 9) {
            System.out.print("Enter the required inputs: ");
            double input1 = scanner.nextDouble();
            double input2 = scanner.nextDouble();
    
            double result = 0.0;
    
            switch (sciChoice) {
                case 1:
                    result = scientificCalculator.add(input1, input2);
                    break;
                case 2:
                    result = scientificCalculator.subtract(input1, input2);
                    break;
                case 3:
                    result = scientificCalculator.multiply(input1, input2);
                    break;
                case 4:
                    result = scientificCalculator.divide(input1, input2);
                    break;
                case 5:
                    result = scientificCalculator.squareRoot(input1);
                    break;
                case 6:
                    result = scientificCalculator.power(input1, input2);
                    break;
                case 7:
                    double angleInRadians = Math.toRadians(input1);
                    result = scientificCalculator.sine(angleInRadians);
                    break;
                case 8:
                    double angleInRadiansCos = Math.toRadians(input1);
                    result = scientificCalculator.cosine(angleInRadiansCos);
                    break;
                case 9:
                    double angleInRadiansTan = Math.toRadians(input1);
                    result = scientificCalculator.tangent(angleInRadiansTan);
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid operation.");
                    return;
            }
    
            System.out.println("Result: " + result);
            scanner.close();
        } else {
            System.out.println("Invalid choice! Please select a valid operation.");
        }
    }
}
