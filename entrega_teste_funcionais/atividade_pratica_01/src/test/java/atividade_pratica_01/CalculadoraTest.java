package atividade_pratica_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    //Função teste onde realiza uma das funções basicas e verifica se o valor bate. Definimos o valor no asserEquals, onde o primeiro valor é o resultado esperado e o segundo é o valor é o obtido.

    @Test
    public void somarDoisValores1() throws Exception {
        int valorA = 1;
        int valorB = 2;
        int soma = 0;

        assertEquals(3, soma);
    }

    @Test
    public void somarDoisValores2() throws Exception {
        int valorA = -10;
        int valorB = 2;
        int soma = -8;

        assertEquals(0, soma);
    }

    @Test
    public void somarDoisValores3() throws Exception {
        int valorA = 1;
        int valorB = 100;
        int soma = 101;

        assertEquals(0, soma);
    }
}
