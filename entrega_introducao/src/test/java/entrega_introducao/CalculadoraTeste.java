package entrega_introducao;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTeste {
    @Test
    public void somarDoisValores() throws Exception {
        int valorA = 1;
        int valorB = 2;
        int soma = 0;

        assertEquals(3, soma);
    }
    @Test
    public void subtrairDoisValores() throws Exception {
        int valorA = 5;
        int valorB = 2;
        int subtrai = 0;

        assertEquals(3, subtrai);
    }
}