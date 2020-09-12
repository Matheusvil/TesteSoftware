package entrega_introducao;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTeste {

    //Função teste onde realiza uma das funções basicas e verifica e o valor bate. Definimos o valor no asserEquals, onde o primeiro valor é o resultado esperado e o segundo é o valor é o obtido

    @Test
    public void somarDoisValores() throws Exception {
        //Adicionado a classe Calculadora no teste.
        Calculadora calculadora = new Calculadora();
        int valorA = 1;
        int valorB = 2;
        int soma = calculadora.soma(valorA, valorB);

        assertEquals(3, soma);
    }
    @Test
    public void subtrairDoisValores() throws Exception {
        Calculadora calculadora = new Calculadora();
        int valorA = 5;
        int valorB = 2;
        int subtrai = calculadora.subtrai(valorA, valorB);

        assertEquals(3, subtrai);
    }
}