public class App {

    private static void ordenarBurbujaSinOptimizar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
    }

    private static void ordenarBurbujaOptimizada(int[] numeros) {
        boolean ordenado = false;// esto evita la compararacion de elemneto innecesarios
        for (int i = 0; i < numeros.length && !ordenado; i++) {
            // si el paso siguiente ya esta ordenado este deja de
            // hacer iteracion que no es necesaria wqs
            ordenado = true;
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    ordenado = false;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int[] numeros = { 5, 2, 4, 1, 3, 10, 9, 6, 7, 15, 13, 13, 12, 8 };

        // ordenarBurbujaSinOptimizar(numeros);
        System.out.println("Arreglo original:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        ordenarBurbujaOptimizada(numeros);
        System.out.println("\nArreglo ordenado:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

    }
}
