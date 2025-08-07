import os

from Util import Util



if os.path.exists("numeros.txt"):
    print("--- Exibindo---")
    Util.gerar_e_exibir_numeros('numeros.txt', 10, 1, 100)
else:
    print("--- Gerando e exibindo números ---")
    Util.gerar_e_exibir_numeros('numeros.txt', 10, 1, 100)

    print("\n--- Executando novamente para ler do arquivo ---")
    Util.gerar_e_exibir_numeros('numeros.txt', 10, 1, 100)

    print("\n" + "=" * 40 + "\n")

if os.path.exists("palavras.txt"):
    print("--- Exibindo---")
    Util.gerar_e_exibir_palavras('palavras.txt', 5, 8)
else:
    print("--- Gerando e exibindo palavras ---")
    Util.gerar_e_exibir_palavras('palavras.txt', 5, 8)

    print("\n--- Executando novamente para ler do arquivo ---")
    Util.gerar_e_exibir_palavras('palavras.txt', 5, 8)