package UF3.Examen_v2;

public class CalculArrays {
    //Param. entr: array de notes (double[])
    //Param. sort: valor màxim (double)
    public double calcularMaxim(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    //Param. entr: array de notes (double[])
    //Param. sort: valor mínim (double)
    public double calcularMinim(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    //Param. entr: array de notes (double[]), mida (int)
    //Param. sort: valor mitjà (double)
    public double calcularMitjana(double[] array, int mida) {
        double suma = 0;
        for (int i = 0; i < mida; i++) {
            suma += array[i];
        }
        return suma / mida;
    }
}


