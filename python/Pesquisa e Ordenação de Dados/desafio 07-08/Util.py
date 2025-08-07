import random
import os


class Util:
    """
    Classe Util com metódos estáticos para gerar e exibir números e palavras aleatórias,
    além de ler esses dados de arquivos se eles já existirem.
    """

    @staticmethod
    def gerar_e_exibir_numeros(nome_arquivo, quantidade, inicio, fim):
        """
        Gera uma lista de números aleatórios ou a lê de um arquivo e exibe seu conteúdo.
        :param nome_arquivo: nome do arquivo para armazenar os números.
        :param quantidade: número de elementos a serem adicionados à lista (se o arquivo não existir).
        :param inicio: valor mínimo do intervalo (inclusivo).
        :param fim: valor máximo do intervalo (inclusivo).
        """
        numeros = []

        if os.path.exists(nome_arquivo):
            print(f"Lendo números do arquivo '{nome_arquivo}':")
            with open(nome_arquivo, 'r') as arquivo:
                for linha in arquivo:
                    numeros.append(int(linha.strip()))
        else:
            print(f"Arquivo '{nome_arquivo}' não encontrado. Gerando e salvando novos números:")
            for _ in range(quantidade):
                numero = random.randint(inicio, fim)
                numeros.append(numero)

            with open(nome_arquivo, 'w') as arquivo:
                for numero in numeros:
                    arquivo.write(f"{numero}\n")

        Util.exibir_lista_numeros(numeros)

    @staticmethod
    def exibir_lista_numeros(lista):
        """
        exibe os itens de uma lista de numeros.
        :param lista: lista de numeros a ser exibida.
        """
        for item in lista:
            print(item)

    @staticmethod
    def gerar_e_exibir_palavras(nome_arquivo, quantidade, tamanho):
        """
        gera uma lista de palavras aleatorias ou a le de um arquivo e exibe seu conteudo.
        :param nome_arquivo: nome do arquivo para armazenar as palavras.
        :param quantidade: número de palavras a serem adicionadas a lista (se o arquivo não existir).
        :param tamanho: tamanho de cada palavra a ser gerada.
        """
        palavras = []

        if os.path.exists(nome_arquivo):
            print(f"Lendo palavras do arquivo '{nome_arquivo}':")
            with open(nome_arquivo, 'r') as arquivo:
                for linha in arquivo:
                    palavras.append(linha.strip())
        else:
            print(f"Arquivo '{nome_arquivo}' não encontrado. Gerando e salvando novas palavras:")
            for _ in range(quantidade):
                palavra = ''.join(random.choices('abcdefghijklmnopqrstuvwxyz', k=tamanho))
                palavras.append(palavra)

            with open(nome_arquivo, 'w') as arquivo:
                for palavra in palavras:
                    arquivo.write(f"{palavra}\n")

        Util.exibir_lista_palavras(palavras)

    @staticmethod
    def exibir_lista_palavras(lista):
        """
        exibe os itens de uma lista de palavras.
        :param lista: Lista de palavras a ser exibida.
        """
        for palavra in lista:
            print(palavra)

