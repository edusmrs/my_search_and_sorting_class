using Microsoft.VisualBasic.CompilerServices;

if (File.Exists("numeros.txt"))
{
    Console.WriteLine("--- Lendo e exibindo números ---");
    Util.GerarEExibirNumeros("numeros.txt", 10, 1, 100);
}
else
{
    Console.WriteLine("--- Execução 1: Gerando e salvando números ---");
    Util.GerarEExibirNumeros("numeros.txt", 10, 1, 100);

    Console.WriteLine("\n--- Execução 2: Lendo números do arquivo existente ---");
    Util.GerarEExibirNumeros("numeros.txt", 10, 1, 100);
}
        

Console.WriteLine("\n" + new string('=', 40) + "\n");
        
if (File.Exists("palavras.txt"))
{
    Console.WriteLine("--- Lendo e exibindo palavras ---");
    Util.GerarEExibirPalavras("palavras.txt", 5, 8);
}
else
{
    Console.WriteLine("--- Execução 1: Gerando e salvando palavras ---");
    Util.GerarEExibirPalavras("palavras.txt", 5, 8);

    Console.WriteLine("\n--- Execução 2: Lendo palavras do arquivo existente ---");
    Util.GerarEExibirPalavras("palavras.txt", 5, 8);
}