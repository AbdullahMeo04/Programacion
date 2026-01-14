public class AA1_Initial_Parellel_Even_100_numbers {
    public static void main(String[] args) {
        int[] evenNumbers = new int[100];

        for (int i = 0; i < evenNumbers.length; i++) {
            evenNumbers[i] = i * 2;
            System.out.print(evenNumbers[i] + " ");
        }
    }
}
