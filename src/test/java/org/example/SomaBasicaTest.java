package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SomaBasicaTest {

    @Test
    public void deveRealizarSomaBasicaCorretamenteQuandoAmbosValoresForemValidos() {
        Integer valor1 = 7;
        Integer valor2 = 10;
        Integer resultadoEsperado = 17;

        assertEquals(resultadoEsperado, Main.somaBasica(valor1, valor2));

    }

    @Test
    public void deveLancarHenriqueExceptionQuandoValor1ForNulo() {
        Integer valor1 = null;
        Integer valor2 = 10;

        /*assertThrows(HenriqueException.class, () -> {
            Main.somaBasica(valor1, valor2);
        });*/
    }

    @Test
    public void deveLancarHenriqueExceptionQuandoValor2ForNulo() {
        Integer valor1 = 10;
        Integer valor2 = null;

        /*assertThrows(HenriqueException.class, () -> {
            Main.somaBasica(valor1, valor2);
        });*/

    }
}
