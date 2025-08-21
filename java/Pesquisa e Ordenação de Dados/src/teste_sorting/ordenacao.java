package teste_sorting;

public class ordenacao {

    public static void bolha(int[] lista){
        int tamanho = lista.length;
        boolean trocou;
        int qtd_comparacoes = 0;
        int qtd_trocas = 0;

        do {
            trocou = false;
            for (int i = 0; i < tamanho - 1; i++) {
                qtd_comparacoes++;
                if (lista[i] > lista[i + 1]) {
                    qtd_trocas++;
                    // Troca os elementos
                    int temp = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = temp;
                    trocou = true;
                }
            }
            tamanho--; // Reduz o tamanho a cada iteração
        } while (trocou);

        System.out.println("Ordenação por Bolha:");
        System.out.println("Quantidade de comparações: " + qtd_comparacoes);
        System.out.println("Quantidade de trocas: " + qtd_trocas);
    }

    public static void selecao(int[] lista) {
        int tamanho = lista.length;
        int qtd_comparacoes = 0;
        int qtd_trocas = 0;

        for (int i = 0; i < tamanho - 1; i++) {
            int indice_minimo = i;
            for (int j = i + 1; j < tamanho; j++) {
                qtd_comparacoes++;
                if (lista[j] < lista[indice_minimo]) {
                    indice_minimo = j;
                }
            }
            if (indice_minimo != i) {
                qtd_trocas++;
                // Troca os elementos
                int temp = lista[i];
                lista[i] = lista[indice_minimo];
                lista[indice_minimo] = temp;
            }
        }

        System.out.println("Ordenação por Seleção:");
        System.out.println("Quantidade de comparações: " + qtd_comparacoes);
        System.out.println("Quantidade de trocas: " + qtd_trocas);
    }

    public static void insercao(int[] lista) {
        int tamanho = lista.length;
        int qtd_comparacoes = 0;
        int qtd_trocas = 0;

        for (int i = 1; i < tamanho; i++) {
            int chave = lista[i];
            int j = i - 1;

            while (j >= 0 && lista[j] > chave) {
                qtd_comparacoes++;
                lista[j + 1] = lista[j];
                j--;
                qtd_trocas++;
            }
            lista[j + 1] = chave;
            if (j != i - 1) {
                qtd_trocas++;
            }
        }

        System.out.println("Ordenação por Inserção:");
        System.out.println("Quantidade de comparações: " + qtd_comparacoes);
        System.out.println("Quantidade de trocas: " + qtd_trocas);
    }
}
