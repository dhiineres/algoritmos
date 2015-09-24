package br.ufg.inf.es.construcao.divisao;

/**
 * Implementação de divisão simples com uso de subtrações.
 */
public class Divisao {

    /**
     * verifica divisão
     * @param x divisor
     * @param y dividendo
     * @return resultado da divisão
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