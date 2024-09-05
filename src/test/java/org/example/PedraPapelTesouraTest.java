package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class PedraPapelTesouraTest {
    @Test
    public void test1() {
        assertEquals("Jogador 2 Venceu!", Main.pedraPapelTesoura("pedra", "papel"));
    }

    @Test
    public void test2() {
        assertEquals("Jogador 1 Venceu!", Main.pedraPapelTesoura("PapEl", "PEDRA"));
    }

    @Test
    public void test3() {
        assertEquals("Jogador 2 Venceu!", Main.pedraPapelTesoura("papeL", "TesOuRa"));
    }

    @Test
    public void test4() {
        assertEquals("Empate!", Main.pedraPapelTesoura("TESOURA", "tesoura"));
    }

    @Test
    public void test5() {
        assertEquals("Jogador 1 Venceu!", Main.pedraPapelTesoura("teSoURa", "Papel"));
    }

    @Test
    public void test6() {
        /*HenriqueException exception = assertThrows(HenriqueException.class, () -> {
            Main.pedraPapelTesoura("robson", "tesoura");
        });
        assertEquals("Opção: robson do Jogador 1 é inválida!", exception.getMessage());*/
    }

    @Test
    public void test7() {
        /*HenriqueException exception = assertThrows(HenriqueException.class, () -> {
            Main.pedraPapelTesoura("Pedra", "Preda");
        });
        assertEquals("Opção: Preda do Jogador 2 é inválida!", exception.getMessage());*/
    }

    @Test
    public void test8() {
        /*HenriqueException exception = assertThrows(HenriqueException.class, () -> {
            Main.pedraPapelTesoura("Paper", "Preda");
        });
        assertEquals("Ambas opções são inválidas, melhorem!", exception.getMessage());*/
    }

}
