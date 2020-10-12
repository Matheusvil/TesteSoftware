package atividade_pratica_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    //Função teste onde realiza uma das funções basicas e verifica e o valor bate. Definimos o valor no asserEquals, onde o primeiro valor é o resultado esperado e o segundo é o valor é o obtido

    @Test
    public void somarDoisValores1() throws Exception {
        //Adicionado a classe Calculadora no teste.
        Calculadora calculadora = new Calculadora();
        int valorA = 1;
        int valorB = 2;
        int soma = calculadora.soma(valorA, valorB);

        assertEquals(3, soma);
    }

    @Test
    public void somarDoisValores2() throws Exception {
        Calculadora calculadora = new Calculadora();
        int valorA = -10;
        int valorB = 2;
        int soma = calculadora.soma(valorA, valorB);

        assertEquals(0, soma);
    }

    @Test
    public void somarDoisValores3() throws Exception {
        Calculadora calculadora = new Calculadora();
        int valorA = 1;
        int valorB = 100;
        int soma = calculadora.soma(valorA, valorB);

        assertEquals(0, soma);
    }
}
