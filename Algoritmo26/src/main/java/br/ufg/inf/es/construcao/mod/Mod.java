package br.ufg.inf.es.construcao.mod;

/**
 * Algorítmo para verificação de resto de divisão;
 */
public class Mod {

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

    public static int mod(int x, int y){
        if (x <= 0 || y <= 0){
            throw new IllegalArgumentException("x e y devem ser inteiros positivos");
        }
        int d = div(x, y);
        return x - (d * y);
    }
}
