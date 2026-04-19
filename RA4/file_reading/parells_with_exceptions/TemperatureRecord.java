package RA4.file_reading.parells_with_exceptions;

public class TemperatureRecord_0485 {
    public static void main(String[] args) {
        double[] temperatures = {19.5, 20.2, 21.8, 18.9, 22.5};

        try {
            System.out.println("--- Temperature Log System ---");
            
            for (int i = 0; i <= temperatures.length; i++) {
                if (i == temperatures.length) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                System.out.println("Record " + i + ": " + temperatures[i] + "°C");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Custom Error: You are trying to access a record index that does not exist in the array.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Status: Program execution has ended.");
        }
    }
}