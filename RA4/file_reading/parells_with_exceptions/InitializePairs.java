package RA4.file_reading.parells_with_exceptions;

public class InitializePairs {
    public static void main(String[] args) {
        
        int[] arrayPairs = new int[100];
        
        try {
            for(int i = 0; i <= arrayPairs.length; i++) {
                arrayPairs[i] = 2 * i;
                System.out.println("Position " + i + " = " + arrayPairs[i]);
            }
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Custom Error: You tried to access an array index that doesn't exist!");
        } 
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } 
        finally {
            System.out.println("Program has ended, whether there was an exception or not.");
        }
    }
}
