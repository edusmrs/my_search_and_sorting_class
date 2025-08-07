package desafio07_08;

import java.io.File;

public class principal {
    public static void main(String[] args) {
        File arquivoPalavras = new File("src/desafio07_08/palavras.txt");
        File arquivoNumeros = new File("src/desafio07_08/numeros.txt");

        if (!arquivoNumeros.exists()) {
            System.out.println("--- Execução 1: Gerando e salvando números ---");
            Utils.gerarEExibirNumeros("numeros.txt", 10, 1, 100);

            System.out.println("\n--- Execução 2: Lendo números do arquivo existente ---");
            Utils.gerarEExibirNumeros("numeros.txt", 10, 1, 100);
        }else {
            System.out.println("--- Execução 1: Lendo números do arquivo existente ---");
            Utils.gerarEExibirNumeros("numeros.txt", 10, 1, 100);
        }

        if (!arquivoPalavras.exists()) {
            System.out.println("\n--- Execução 1: Gerando e salvando palavras ---");
            Utils.gerarEExibirPalavras("palavras.txt", 5, 8);

            System.out.println("\n--- Execução 2: Lendo palavras do arquivo existente ---");
            Utils.gerarEExibirPalavras("palavras.txt", 5, 8);
        } else {
            System.out.println("\n--- Execução 1: Lendo palavras do arquivo existente ---");
            Utils.gerarEExibirPalavras("palavras.txt", 5, 8);
        }
    }
}
