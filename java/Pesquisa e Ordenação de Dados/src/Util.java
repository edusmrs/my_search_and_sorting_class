import java.util.ArrayList;
import java.util.Random;

public class Util {
    /***
     * Método estático que popula uma lista de números inteiros com valores aleatórios.
     * @param lista Estrutura de armazenamento para os números inteiros.
     * @param quantidade Quantidade de números a serem gerados.
     * @param inicio Valor inicial da extensão do número gerado
     * @param fim Valor final da extensão do número gerado
     */
    public static void popularAleatorioNumeros(ArrayList<Integer> lista, int quantidade, int inicio, int fim){
        Random gerador = new Random();
        for (; quantidade > 0; quantidade--){
            lista.add(gerador.nextInt(inicio, fim));
        }
    }


    /***
     * Método estático que popula uma lista de palavras com palavras aleatórias.
     * @param listaPalavras Estrutura de armazenamento para as palavras.
     * @param quantidade Quantidade de palavras a serem geradas.
     * @param tamanho Tamanho das palavras a serem geradas.
     */
    public static void popularAleatorioPalavras(ArrayList<String> listaPalavras, long quantidade, int tamanho){
        String letras = "abcdefghijklmnopqrstuvwxyz";
        Random gerador = new Random();

        for(; quantidade > 0; quantidade--){
            String palavraGerada = "";
            char letraSorteada;
            for(int i = 0; i < tamanho; i++){
                letraSorteada = letras.charAt(gerador.nextInt(letras.length()));
                palavraGerada = palavraGerada + letraSorteada;
            }
            listaPalavras.add(palavraGerada);
        }
    }


    /***
     * Método estático que exibe os elementos de uma lista de números inteiros.
     * @param lista Estrutura de armazenamento para os números inteiros.
     */
    public static void exibirListaNumeros(ArrayList<Integer> lista){

        for(Integer item : lista){
            System.out.println(item);
        }
    }

    /***
     * Método estático que exibe os elementos de uma lista de palavras.
     * @param lista Estrutura de armazenamento para as palavras.
     */

    public static void exibirListaPalavras(ArrayList<String> lista){

        for(String item : lista){
            System.out.println(item);
        }
    }
}
