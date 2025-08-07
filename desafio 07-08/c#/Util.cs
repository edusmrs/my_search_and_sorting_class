public class Util
{
    /// <summary>
    /// Gera numeros aleatorios e os salva em um arquivo, ou lê os números de um arquivo existente e os exibe.
    /// </summary>
    /// <param name="nomeArquivo">nome do arquivo para armazenar/ler os numeros.</param>
    /// <param name="quantidade">quantidade de números a serem gerados se o arquivo nao existir.</param>
    /// <param name="inicio">valor inicial do intervalo.</param>
    /// <param name="fim">valor final do intervalo.</param>
    public static void GerarEExibirNumeros(string nomeArquivo, long quantidade, int inicio, int fim)
    {
        List<int> lista = new List<int>();

        if (File.Exists(nomeArquivo))
        {
            Console.WriteLine($"Lendo números do arquivo '{nomeArquivo}':");
            using (StreamReader leitor = new StreamReader(nomeArquivo))
            {
                string? linha;
                while ((linha = leitor.ReadLine()) != null)
                {
                    if (int.TryParse(linha, out int numero))
                    {
                        lista.Add(numero);
                    }
                }
            }
        }
        else
        {
            Console.WriteLine($"Arquivo '{nomeArquivo}' não encontrado. Gerando e salvando novos números:");
            Random gerador = new Random();
            using (StreamWriter escritor = new StreamWriter(nomeArquivo))
            {
                for (long i = 0; i < quantidade; i++)
                {
                    int numero = gerador.Next(inicio, fim);
                    escritor.WriteLine(numero);
                    lista.Add(numero);
                }
            }
        }

        exibirListaNumeros(lista);
    }
    
    /// <summary>
    /// gera palavras aleatorias e as salva em um arquivo, ou le as palavras de um arquivo existente e as exibe.
    /// </summary>
    /// <param name="nomeArquivo">nome do arquivo para armazenar/ler as palavras.</param>
    /// <param name="quantidade">quantidade de palavras a serem geradas se o arquivo não existir.</param>
    /// <param name="tamanho">tamanho de cada palavra a ser gerada.</param>
    public static void GerarEExibirPalavras(string nomeArquivo, long quantidade, int tamanho)
    {
        List<string> lista = new List<string>();

        if (File.Exists(nomeArquivo))
        {
            Console.WriteLine($"Lendo palavras do arquivo '{nomeArquivo}':");
            using (StreamReader leitor = new StreamReader(nomeArquivo))
            {
                string? linha;
                while ((linha = leitor.ReadLine()) != null)
                {
                    lista.Add(linha);
                }
            }
        }
        else
        {
            Console.WriteLine($"Arquivo '{nomeArquivo}' não encontrado. Gerando e salvando novas palavras:");
            string letras = "abcdefghijklmnopqrstuvwxyz";
            Random gerador = new Random();
            using (StreamWriter escritor = new StreamWriter(nomeArquivo))
            {
                for (long i = 0; i < quantidade; i++)
                {
                    string palavraGerada = "";
                    for (int j = 0; j < tamanho; j++)
                    {
                        palavraGerada += letras[gerador.Next(letras.Length)];
                    }
                    escritor.WriteLine(palavraGerada);
                    lista.Add(palavraGerada);
                }
            }
        }

        exibirListaPalavras(lista);
    }
    
    // método de exibição de numeros
    public static void exibirListaNumeros(List<int> lista)
    {
        foreach (int numero in lista)
        {
            Console.WriteLine(numero);
        }
    }

    // método de exibição de palavras
    public static void exibirListaPalavras(List<string> lista)
    {
        foreach (string palavra in lista)
        {
            Console.WriteLine(palavra);
        }
    }
}