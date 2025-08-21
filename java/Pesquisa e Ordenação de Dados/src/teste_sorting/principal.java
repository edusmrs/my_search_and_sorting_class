package teste_sorting;

public class principal {
    public static void main(String[] args) {
        int[] lista_normal = new int[10000];
        int[] lista_bolha = new int[10000];
        int[] lista_selecao = new int[10000];
        int[] lista_insercao = new int[10000];
        double start, end;

        Util.popular_lista_aleatoria(lista_normal, 10000, 0, 10000);
        System.arraycopy(lista_normal, 0, lista_bolha, 0, 10000);
        System.arraycopy(lista_normal, 0, lista_selecao, 0, 10000);
        System.arraycopy(lista_normal, 0, lista_insercao, 0, 10000);


        start = System.currentTimeMillis();
        java.util.Arrays.sort(lista_normal);
        end = System.currentTimeMillis();
        System.out.println("Tempo da rotina ordenar sort padrao do java: " + (end - start)/1000 + " s");

        start = System.currentTimeMillis();
        ordenacao.bolha(lista_bolha);
        end = System.currentTimeMillis();
        System.out.println("Tempo da rotina ordenar por bolha: " + (end - start)/1000 + " s");

        start = System.currentTimeMillis();
        ordenacao.insercao(lista_insercao);
        end = System.currentTimeMillis();
        System.out.println("Tempo da rotina ordenar por insercao: " + (end - start)/1000 + " s");

        start = System.currentTimeMillis();
        ordenacao.selecao(lista_selecao);
        end = System.currentTimeMillis();
        System.out.println("Tempo da rotina ordenar por selecao: " + (end - start)/1000 + " s");
    }
}
