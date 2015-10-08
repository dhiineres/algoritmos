package br.ufg.inf.es.construcao.fatorial;

/**
 * implementações a serem utilizadas;
 */
public class Fatorial {
    /**
     * verifica produto;
     * @param a fator 1;
     * @param b fator 2;
     * @return resultado da multiplicação;
     */
    public static int produto(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a ou b inválido");
        }

        int i = 1;
        int s = 0;
        while (i <= b) {
            s = s + a;
            i = i + 1;
        }

        return s;
    }

    /**
     * verifica fatorial;
     * @param n número a ser verificado;
     * @return fatorial de n;
     */
    public static int fat(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("N deve ser maior que 0");
        }

        int i = 2;
        int f = 1;

        while (i <= n) {
            f = produto(f, i);
            i = i + 1;
        }

        return f;
    }
}
