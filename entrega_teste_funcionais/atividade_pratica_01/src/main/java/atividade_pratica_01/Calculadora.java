package atividade_pratica_01;

import java.util.Scanner;
import org.apache.commons.math3.*;

public class Calculadora {

    //Funções que realizam as contas basicas e foi adicionado um limite para o usuário escolher um numero entre 0 e 99.
    public int soma(int valorA, int valorB) {
        if(valorA<0 || valorA>99 & valorB<0 || valorB>99){
            return 0;
        }else{
            return Math.addExact(valorA, valorB);
        }
    }

    public int subtrai(int valorA, int valorB) {
        if(valorA<0 || valorA>99 & valorB<0 || valorB>99){
            return 0;
        }else{
            return Math.subtractExact(valorA, valorB);
        }
    }

    public int divide(int valorA, int valorB) {
        if(valorA<0 || valorA>99 & valorB<0 || valorB>99){
            return 0;
        }else{
            return valorA / valorB;
        }
    }

    public int multiplica(int valorA, int valorB) {
        if(valorA<0 || valorA>99 & valorB<0 || valorB>99){
            return 0;
        }else{
            return Math.multiplyExact(valorA, valorB);
        }
    }

    //Função main onde o usuário interage
    public static void main(String args[]) throws Exception {
        Calculadora calc = new Calculadora();

        int opc;
        int valorA, valorB;

        Scanner input = new Scanner(System.in);
        System.out.println("-Escolha uma opção-");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("0. Sair");
        System.out.println("Operação: ");

        opc = input.nextInt();  
        
        while (opc != 0 && opc <= 4) {
            Scanner input1 = new Scanner(System.in);    
			
			System.out.println("Qual o primeiro numero: ");  
			valorA = input1.nextInt();  
			System.out.println("Qual o segundo numero: ");  
            valorB = input1.nextInt();

            //caso o valor de A ou B for menor que 0 ou mairo que 99 o usuário tem q digitar outro numero entre 0 e 99.
            if(valorA<0 || valorA>99 & valorB<0 || valorB>99){
                System.out.println("Qual o primeiro numero: ");  
                valorA = input1.nextInt();  
                System.out.println("Qual o segundo numero: ");  
                valorB = input1.nextInt();
            }  
            else{
                if ( opc == 1 ) {
                    int operacao = calc.soma(valorA, valorB);
                    System.out.printf("\nO resultado da soma é: %d\n", operacao);  
                    break;  
                }  
                else if (opc == 2) { 
                    int operacao = calc.subtrai(valorA, valorB);
                    System.out.printf("\nO resultado da subtração é: %d\n", operacao);  
                    break;  
                }  
                else if (opc == 3) {
                    int operacao = calc.multiplica(valorA, valorB); 
                    System.out.printf("\nO resultado da multiplicação é: %d\n", operacao);    
                    break;  
                }  
                else{
                    // caso o valor de B é igual qa zero o usuário precisa digitar novos valores.
                    if (valorB == 0) {
					System.out.printf("\nNão é possivel dividir por zero\n");
					System.out.printf("\nSelecione outro valor\n");
				    }
				    else {
					int operacao = calc.divide(valorA, valorB);  
					System.out.printf("\nO resultado da divisão é: %d\n", operacao);   
					break;
				    }  
                } 
            }
        }
    }
}