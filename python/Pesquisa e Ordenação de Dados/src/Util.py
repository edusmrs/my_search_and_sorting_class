import random as random

class Util:
    """
    Classe Util com métodos estáticos para manipulação de listas e exibição de dados.
    """

    @staticmethod
    def popular_aleatorio_numeros(lista, quantidade, inicio, fim):
        """
        Popula uma lista com números aleatórios dentro de um intervalo especificado.
        :param lista: Lista a ser populada com números aleatórios.
        :param quantidade: Número de elementos a serem adicionados à lista.
        :param inicio: Valor mínimo do intervalo (inclusivo).
        :param fim: Valor máximo do intervalo (inclusivo).
        :return:
        """
        for _ in range(quantidade):
            numero = random.randint(inicio, fim)
            lista.append(numero)

    @staticmethod
    def exibir_lista_numeros(lista):
        """
        Exibe os itens de uma lista de números.
        :param lista: Lista de números a ser exibida.
        """
        for item in lista:
            print(item)


    @staticmethod
    def popular_aleatorio_palavras(lista, quantidade, tamanho):
        """
        Popula uma lista com palavras aleatórias de um tamanho especificado.
        :param lista: Lista a ser populada com palavras aleatórias.
        :param quantidade: Número de palavras a serem adicionadas à lista.
        :param tamanho: Tamanho de cada palavra a ser gerada.
        """
        for _ in range(quantidade):
            palavra = ''.join(random.choices('abcdefghijklmnopqrstuvwxyz', k=tamanho))
            lista.append(palavra)

    @staticmethod
    def exibir_lista_palavras(lista):
        '''
        Exibe os itens de uma lista de palavras.
        :param lista: Lista de palavras a ser exibida.
        :return:
        '''

        for palavra in lista:
            print(palavra)