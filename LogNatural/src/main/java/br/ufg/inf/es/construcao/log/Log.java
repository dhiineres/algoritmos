package br.ufg.inf.es.construcao.log;

import br.ufg.inf.es.construcao.fatorial.Fatorial;
import br.ufg.inf.es.construcao.potencia.Potencia;

/**
 * Implementação de algoritmo para obtenção de Log natural com uso de operações
 * simples;
 */
public class Log {

    /**
     * verifica log natural;
     * @param n inteiro a ser verificado;
     * @param k base;
     * @return log;
     */
    public static int log(int n, int k) {
        if (n < 1 || k < 2) {
            throw new IllegalArgumentException("Parametros invalidos");
        }

        int i = 2, e = n + 1;
        while (i <= k) {
            int p = Potencia.potencia(n, i);
            int f = Fatorial.fat(i);
            e = e + p / f;
            i = i + 1;
        }

        return e;
    }
}
