package br.ufg.inf.es.construcao.potencia;

/**
 * Implementa��o de algoritmo que calcula a potencia de um n�mero x em um
 * expoente y, utilizando apenas multiplica��es simples;
 */
public class Potencia {

    /**
     * verifica pot�ncia;
     * @param x inteiro a ser elevado;
     * @param y expoente;
     * @return resultado da exponencia��o;
     */
    public static int potencia(int x, int y) {

        if (x <= 0 || y < 0) {
            throw new IllegalArgumentException("x ou y invalido");
        }

        int i = 1;
        int p = 1;
        while ( i <= y) {
            p = p * x;
            i = i + 1;
        }

        return p;
    }
}