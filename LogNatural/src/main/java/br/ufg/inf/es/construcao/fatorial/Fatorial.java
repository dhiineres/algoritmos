package br.ufg.inf.es.construcao.fatorial;

/**
 * Created by alunoinf on 24/09/15.
 */
public class Fatorial {
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
