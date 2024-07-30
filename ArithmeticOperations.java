package khadeer;
import java.util.Scanner;
public class ArithmeticOperations {
	

	

	    // Method for addition
	    public static double add(double x, double y) {
	        return x + y;
	    }

	    // Method for subtraction
	    public static double subtract(double x, double y) {
	        return x - y;
	    }

	    // Method for multiplication
	    public static double multiply(double x, double y) {
	        return x * y;
	    }

	    // Method for division
	    public static double divide(double x, double y) {
	        if (y != 0) {
	            return x / y;
	        } else {
	            System.out.println("Cannot divide by zero!");
	            return Double.NaN;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Take user input for the numbers
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        // Take user input for the operation
	        System.out.println("Select operation: ");
	        System.out.println("1 - Addition");
	        System.out.println("2 - Subtraction");
	        System.out.println("3 - Multiplication");
	        System.out.println("4 - Division");
	        int choice = scanner.nextInt();

	        double result = 0;

	        // Perform the chosen operation
	        switch (choice) {
	            case 1:
	                result = add(num1, num2);
	                System.out.println("Result: " + result);
	                break;
	            case 2:
	                result = subtract(num1, num2);
	                System.out.println("Result: " + result);
	                break;
	            case 3:
	                result = multiply(num1, num2);
	                System.out.println("Result: " + result);
	                break;
	            case 4:
	                result = divide(num1, num2);
	                if (!Double.isNaN(result)) {
	                    System.out.println("Result: " + result);
	                }
	                break;
	            default:
	                System.out.println("Invalid choice.");
	                break;
	        }

	        scanner.close();
	    }
	}



