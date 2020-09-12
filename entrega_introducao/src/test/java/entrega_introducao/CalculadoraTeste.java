package entrega_introducao;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTeste {
    @Test
    public void somarDoisValores() throws Exception {
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