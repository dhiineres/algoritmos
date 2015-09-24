package br.ufg.inf.es.construcao.Produto;

import org.junit.Test;
import org.junit.Assert;

public class ProdutoTest {

    @Test (expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Produto.produto(-1, 1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Produto.produto(1, -10);
    }

    @Test
    public void testCasosDeFronteira() {
        Assert.assertEquals(0, Produto.produto(0, 1));
        Assert.assertEquals(0, Produto.produto(1, 0));
        Assert.assertEquals(10, Produto.produto(1, 10));
        Assert.assertEquals(10, Produto.produto(10, 1));
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(100, Produto.produto(10, 10));
        Assert.assertEquals(1000, Produto.produto(10, 100));
        Assert.assertEquals(987 * 19, Produto.produto(987, 19));
    }
}
