package ordenar.burbuja;

public class Burbuja {
    public static void burbuja(int[] A) {
        int aux;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - i - 1; j++)
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
        }
    }
}
