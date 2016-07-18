package ar.com.ar.com.compumundohipermegared;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by reuniones on 15/07/16.
 */
public class ConversorTest {
    private Conversor conversor;

    @Before
    public void before(){

        List<iConverter> lista = new ArrayList<iConverter>();
        lista.add(new DecenasConverter());
        lista.add(new UnidadesConverter());

        conversor = new Conversor(lista);
    }

    @Test
    public void testConvertirUnoToNumeroRomano() {

        String resultado = conversor.convertir(1);

        Assert.assertEquals("I",resultado, "Esperaba 1");

    }

    @Test
    public void testConvertirDosToNumeroRomano() {

        String resultado = conversor.convertir(2);

        Assert.assertEquals("II",resultado);

    }

    @Test
    public void testConvertirTresToNumeroRomano() {

        String resultado = conversor.convertir(3);

        Assert.assertEquals("III",resultado);

    }

    @Test
    public void testConvertirCuatroToNumeroRomano() {

        String resultado = conversor.convertir(4);

        Assert.assertEquals("IV",resultado);

    }

    @Test
    public void testConvertirTenToNumeroRomano() {

        String resultado = conversor.convertir(10);

        Assert.assertEquals("X",resultado);

    }

    @Test
    public void testConvertirVeinteToNumeroRomano() {

        String resultado = conversor.convertir(20);

        Assert.assertEquals("XX",resultado);

    }


}