package br.ufg.inf.es.construcao.divisao;

import org.junit.Test;
import org.junit.Assert;

public class DivisaoTest {

    @Test (expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Divisao.div(-1, 5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSegundoparametroInvalido() throws Exception {
        Divisao.div(5, 0);
    }

    @Test
    public void testCasosdeFronteira() throws Exception {
        Assert.assertEquals(1, Divisao.div(1, 1));
        Assert.assertEquals(0, Divisao.div(0, 100));
        Assert.assertEquals(1, Divisao.div(2, 2));
    }

    @Test
    public void testCasosTriviais() throws Exception {
        Assert.assertEquals(2, Divisao.div(4, 2));
        Assert.assertEquals(2, Divisao.div(5, 2));
        Assert.assertEquals(1, Divisao.div(5, 3));
        Assert.assertEquals(2, Divisao.div(100, 50));
        Assert.assertEquals(10, Divisao.div(1000, 100));
        Assert.assertEquals(3, Divisao.div(9, 3));
        Assert.assertEquals(5, Divisao.div(15, 3));
    }
}