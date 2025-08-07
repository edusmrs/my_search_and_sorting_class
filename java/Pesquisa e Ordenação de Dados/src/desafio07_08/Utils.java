package desafio07_08;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Utils {


    /**
     * gera números aleatórios dentro de um intervalo e os salva em um arquivo.
     * Se o arquivo já existir, lê os números do arquivo e exibe-os.
     *
     * @param nomeArquivo nome do arquivo onde os números serão salvos ou lidos.
     * @param quantidade quantidade de números a serem gerados.
     * @param inicio valor mínimo do intervalo.
     * @param fim valor máximo do intervalo.
     */
    public static void gerarEExibirNumeros(String nomeArquivo, int quantidade, int inicio, int fim) {
        File arquivo = new File(nomeArquivo);
        ArrayList<Integer> numeros = new ArrayList<>();

        if (arquivo.exists()) {
            System.out.println("Lendo números do arquivo '" + nomeArquivo + "':");
            try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
                String linha;
                while ((linha = leitor.readLine()) != null) {
                    numeros.add(Integer.parseInt(linha));
                }
            } catch (IOException e) {
                System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            }
        } else {
            System.out.println("Arquivo '" + nomeArquivo + "' não encontrado. Gerando e salvando novos números:");
            Random gerador = new Random();
            try (PrintWriter escritor = new PrintWriter(new FileWriter(arquivo))) {
                for (int i = 0; i < quantidade; i++) {
                    int numero = gerador.nextInt(fim - inicio + 1) + inicio;
                    numeros.add(numero);
                    escritor.println(numero);
                }
            } catch (IOException e) {
                System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
            }
        }

        exibirListaNumeros(numeros);
    }

    /**
     * gera palavras aleatórias de um determinado tamanho e as salva em um arquivo.
     * Se o arquivo já existir, lê as palavras do arquivo e exibe-as.
     *
     * @param nomeArquivo nome do arquivo onde as palavras serão salvas ou lidas.
     * @param quantidade quantidade de palavras a serem geradas.
     * @param tamanho tamanho de cada palavra gerada.
     */
    public static void gerarEExibirPalavras(String nomeArquivo, long quantidade, int tamanho) {
        File arquivo = new File(nomeArquivo);
        ArrayList<String> palavras = new ArrayList<>();

        if (arquivo.exists()) {
            System.out.println("Lendo palavras do arquivo '" + nomeArquivo + "':");
            try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
                String linha;
                while ((linha = leitor.readLine()) != null) {
                    palavras.add(linha);
                }
            } catch (IOException e) {
                System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            }
        } else {
            System.out.println("Arquivo '" + nomeArquivo + "' não encontrado. Gerando e salvando novas palavras:");
            String letras = "abcdefghijklmnopqrstuvwxyz";
            Random gerador = new Random();
            try (PrintWriter escritor = new PrintWriter(new FileWriter(arquivo))) {
                for (int i = 0; i < quantidade; i++) {
                    StringBuilder palavraGerada = new StringBuilder();
                    for (int j = 0; j < tamanho; j++) {
                        char letraSorteada = letras.charAt(gerador.nextInt(letras.length()));
                        palavraGerada.append(letraSorteada);
                    }
                    palavras.add(palavraGerada.toString());
                    escritor.println(palavraGerada);
                }
            } catch (IOException e) {
                System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
            }
        }

        exibirListaPalavras(palavras);
    }

    /**
     * exibe os números contidos em uma lista.
     *
     * @param lista lista de números a serem exibidos.
     */
    public static void exibirListaNumeros(ArrayList<Integer> lista) {
        for (Integer item : lista) {
            System.out.println(item);
        }
    }

    /**
     * exibe as palavras contidas em uma lista.
     *
     * @param lista lista de palavras a serem exibidas.
     */
    public static void exibirListaPalavras(ArrayList<String> lista) {
        for (String item : lista) {
            System.out.println(item);
        }
    }
}