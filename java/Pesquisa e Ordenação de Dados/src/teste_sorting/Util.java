package teste_sorting;

public class Util {

    public static void popular_lista_aleatoria(int[] lista, int tamanho, int inicio, int fim) {
        for (int i = inicio; i < fim; i++) {
            lista[i] = (int) (Math.random() * tamanho);
        }
    }

    public static void imprimir_lista(int[] lista, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();
    }
}
