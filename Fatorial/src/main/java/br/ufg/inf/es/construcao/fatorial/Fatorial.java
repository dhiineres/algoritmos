package br.ufg.inf.es.construcao.fatorial;

import br.ufg.inf.es.construcao.Produto.Produto;

/**
 * Created by alunoinf on 24/09/15.
 */
public class Fatorial {
    public static int fat(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("N deve ser maior que 0");
        }

        int i = 2;
        int f = 1;

        while (i <= n) {
            f = Produto.produto(f, i);
            i = i + 1;
        }

        return f;
    }
}
