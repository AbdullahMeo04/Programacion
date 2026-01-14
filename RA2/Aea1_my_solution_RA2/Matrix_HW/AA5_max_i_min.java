public class AA5_max_i_min {
    public static void main(String[] args) {
        int[] vico = {12, 3, 45, -3, 65, -5, 88, 99, 2, 23, 54, 33, 27, 53, 96, 96, 0};

        int min = vico[0];
        int max = vico[0];

        for(int i=0; i < vico.length; i++){
            if (vico[i] < min) {
                min = vico[i];
            }
            if (vico[i] > max) {
                max = vico[i];
            }
        }

        System.out.println("The smallest number of the vico is: "+ min);
        System.out.println("The biggest number of the vico is: "+ max);
    }
}
