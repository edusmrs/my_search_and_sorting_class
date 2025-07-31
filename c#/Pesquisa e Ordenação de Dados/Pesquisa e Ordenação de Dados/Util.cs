namespace PERD_31_07;

public class Util
{
    
    /// <summary>
    /// método de classe que popula uma lista de números aleatórios
    /// </summary>
    /// <param name="lista"> Lista de inteiros que vai armazenar os números</param>
    /// <param name="quantidade"> Quantidade de números gerados </param>
    /// <param name="inicio"> valor inicial</param>
    /// <param name="fim"></param>
    public static void popularAleatorioNumeros(List<int> lista, long quantidade, int inicio, int fim)
    {
        Random gerador = new Random();
        for (; quantidade > 0; quantidade--)
        {
            int numero = gerador.Next(inicio, fim);
            lista.Add(numero);
        }
    }
    
    /// <summary>
    ///  Método de classe que exibe uma lista de números inteiros   
    /// </summary>
    /// <param name="lista"> Lista que contém números inteiros</param>
    public static void exibirListaNumeros(List<int> lista)
    {
        foreach (int numero in lista)
        {
            Console.WriteLine(numero);
        }
    }
    public static void popularAleatorioPalavras(List<string> lista, long quantidade, int tamanho)
    {
        string letras = "abcdefghijklmnopqrstuvwxyz";
        Random gerador = new Random();

        for (; quantidade > 0; quantidade--)
        {
            string palavraGerada = "";
            char letraSorteada;
            for (int i = 0; i < tamanho; i++)
            {
                letraSorteada = letras[gerador.Next(letras.Length)];
                palavraGerada += palavraGerada + letraSorteada;
            }
            
            lista.Add(palavraGerada);
        }
    }

    public static void exibirListaPalavras(List<string> lista)
    {
        foreach (string palavra in lista)
        {
            Console.WriteLine(palavra);
        }
    }
}