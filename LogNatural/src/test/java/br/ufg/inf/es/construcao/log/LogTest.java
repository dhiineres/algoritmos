package br.ufg.inf.es.construcao.log;

import org.junit.*;

public class LogTest {
    @Test (expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Log.log(0, 5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Log.log(5, 1);
    }

    @Test
    public void testCasosTriviais() throws Exception {
        Assert.assertEquals(2, Log.log(1, 2));
        Assert.assertEquals(5, Log.log(2, 2));
        Assert.assertEquals(8, Log.log(3, 2));
    }
}
