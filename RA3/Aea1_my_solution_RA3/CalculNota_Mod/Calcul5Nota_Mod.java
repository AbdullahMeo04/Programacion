import java.util.Scanner;

public class Calcul5Nota_Mod {

    public double minimum(double[] values) {
        double min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    public double maximum(double[] values) {
        double max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    public double average(double[] values) {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum / values.length;
    }

    public double[] readNumbers(int count) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[count];

        System.out.println("Enter " + count + " real numbers:");

        for (int i = 0; i < count; i++) {
            boolean valid = false;
            while (!valid) {
                System.out.print("Number " + (i + 1) + ": ");
                if (scanner.hasNextDouble()) {
                    numbers[i] = scanner.nextDouble();
                    valid = true;
                } else {
                    System.out.println("Invalid input! Please enter a real number.");
                    scanner.next();
                }
            }
        }
        return numbers;
    }

    public void inici() {
        double[] numbers = readNumbers(5);

        System.out.println("\nResults:");
        System.out.println("Minimum value: " + minimum(numbers));
        System.out.println("Maximum value: " + maximum(numbers));
        System.out.println("Average value: " + average(numbers));
    }

    public static void main(String[] args) {
        Calcul5Nota_Mod calculator = new Calcul5Nota_Mod();
        calculator.inici();
    }
}
