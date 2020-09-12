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
    @Test
    public void dividirDoisValores() throws Exception {
        Calculadora calculadora = new Calculadora();    
        int valorA = 6;
        int valorB = 2;
        int divisao = calculadora.divide(valorA, valorB);

        assertEquals(3, divisao);
    }
    @Test(expected = ArithmeticException.class)
    public void deveriaLancarUmaExcecaoIndicandoFalhaAoDividirUmNumeroPorZero()
            throws Exception {
        int valorA = 6;
        int valorB = 0;
        Calculadora calculadora = new Calculadora();
        calculadora.divide(valorA, valorB);
    }
    @Test
    public void multiplicaDoisValores() throws Exception {
        Calculadora calculadora = new Calculadora();
        int valorA = 6;
        int valorB = 2;
        int multiplica = calculadora.multiplica(valorA, valorB);

        assertEquals(12, multiplica);
    }
}
