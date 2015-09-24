package br.ufg.inf.es.construcao.mod;

import org.junit.Test;
import org.junit.Assert;


public class ModTest {

    @Test (expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Mod.mod(0, 5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Mod.mod(1, 0);
    }

    @Test
    public void testCasosDeFronteira() throws Exception {
        Assert.assertEquals(0, Mod.mod(1, 1));
        Assert.assertEquals(0, Mod.mod(2, 1));
    }

    @Test
    public void testCasosTriviais() throws Exception {
        Assert.assertEquals(2, Mod.mod(5, 3));
        Assert.assertEquals(2, Mod.mod(7, 5));
        Assert.assertEquals(0, Mod.mod(6, 3));
        Assert.assertEquals(0, Mod.mod(81, 9));
        Assert.assertEquals(2, Mod.mod(83, 9));
        Assert.assertEquals(1, Mod.mod(10, 3));
        Assert.assertEquals(2, Mod.mod(30, 7));
    }

}