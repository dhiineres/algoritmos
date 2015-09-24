package br.ufg.inf.es.construcao.fatorial;

import org.junit.*;

public class FatorialTest {

    @Test (expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Fatorial.fat(0);
    }

    @Test
    public void testCasosTriviais() throws Exception {
        Assert.assertEquals(1, Fatorial.fat(1));
        Assert.assertEquals(2, Fatorial.fat(2));
        Assert.assertEquals(6, Fatorial.fat(3));
        Assert.assertEquals(24, Fatorial.fat(4));
        Assert.assertEquals(120, Fatorial.fat(5));
        Assert.assertEquals(720, Fatorial.fat(6));
    }
}
