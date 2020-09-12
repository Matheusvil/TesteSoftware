package entrega_introducao;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTeste {
    
    //Função teste onde realiza uma das funções basicas e verifica e o valor bate. Definimos o valor no asserEquals, onde o primeiro valor é o resultado esperado e o segundo é o valor é o obtido
    
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