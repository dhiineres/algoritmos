package br.ufg.inf.es.construcao.divisao;

/**
 * Implementa��o de divis�o simples com uso de subtra��es.
 */
public class Divisao {

    /**
     * verifica divis�o
     * @param x divisor
     * @param y dividendo
     * @return resultado da divis�o
     */

    public static int div(int x, int y) {
        if (x < 0 || y <= 0) {
            throw new IllegalArgumentException("Parametros invalidos");
        }

        int d = 0;
        int s = x;

        while (s >= y) {
            s = s - y;
            d = d + 1;
        }

        return d;
    }
}