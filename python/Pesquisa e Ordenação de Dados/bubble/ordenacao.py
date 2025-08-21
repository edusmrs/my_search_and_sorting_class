from logging import NullHandler


class Ordenacao:
    @staticmethod
    def bolha(lista):
        houve_troca = True
        qtd_comparacoes = 0
        qtd_trocas = 0
        while (houve_troca):
            houve_troca = False
            for i in range(len(lista) - 1):
                qtd_comparacoes += 1
                if (lista[i] > lista[i + 1]):
                    qtd_trocas += 1
                    houve_troca = True
                    tmp = lista[i]
                    lista[i] = lista[i + 1]
                    lista[i + 1] = tmp

        return qtd_comparacoes, qtd_trocas

    @staticmethod
    def selecao(lista):
        qtd_comparacoes = 0
        qtd_trocas = 0
        for i in range(len(lista) - 1):
            posMenor = i
            for j in range(i + 1, len(lista)):
                qtd_comparacoes += 1
                if (lista[j] < lista[posMenor]):
                    posMenor = j
            if (i != posMenor):
                qtd_trocas += 1
                tmp = lista[i]
                lista[i] = lista[posMenor]
                lista[posMenor] = tmp

        return qtd_comparacoes, qtd_trocas

    def insercao(vetor):
        n = len(vetor)
        qtd_comparacoes = 0
        qtd_trocas = 0

        for i in range(1, n):
            tmp = vetor[i]
            j = i - 1

            while j >= 0 and tmp < vetor[j]:
                qtd_comparacoes += 1
                vetor[j + 1] = vetor[j]
                qtd_trocas += 1
                j -= 1

            if j >= 0:
                qtd_comparacoes += 1

            vetor[j + 1] = tmp
            qtd_trocas += 1

        return qtd_comparacoes, qtd_trocas

















