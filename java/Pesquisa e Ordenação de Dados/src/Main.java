import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        ArrayList<Integer> lista2Numeros = new ArrayList<>();

        ArrayList<String> listaPalavras = new ArrayList<>();

        Util.popularAleatorioNumeros(listaNumeros, 10, 100, 500);
        Util.exibirListaNumeros(listaNumeros);

        lista2Numeros.addAll(listaNumeros);
        // lista2Numeros = (ArrayList<Integer>) lista2Numeros.clone();


        Util.popularAleatorioPalavras(listaPalavras, 10, 6);
        Util.exibirListaPalavras(listaPalavras);
    }
}