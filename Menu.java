package Calculadora;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("""
                    Calculadora Simples:
                    Digite o primeiro número:""");
            double n1 = teclado.nextDouble();
            System.out.println("Digite o segundo número: ");
            double n2 = teclado.nextDouble();
            System.out.println("""
                    Escolha qual operação deseja fazer:
                    1 - Adição
                    2 - Subtração
                    3 - Multiplicação
                    4 - Divisão
                    5 - Finalizar programa
                    Digite aqui:""");
            int action = teclado.nextInt();
            switch (action) {
                case 1:
                    double resultSoma = operacoes.somar(n1, n2);
                    System.out.println("A soma entre " + n1 + " e " + n2 + " é " + resultSoma);
                    break;
                case 2:
                    double resultSub = operacoes.subtrair(n1, n2);
                    System.out.println("A subtração entre " + n1 + " e " + n2 + " é " + resultSub);
                    break;
                case 3:
                    double resultMulti = operacoes.multiplicar(n1, n2);
                    System.out.println("A multiplicação entre " + n1 + " e " + n2 + " é " + resultMulti);
                    break;
                case 4:
                    String resultDiv = operacoes.dividir(n1, n2);
                    System.out.println(resultDiv);
                    break;
                case 5:
                    System.out.println("Finalizando o programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Digite um valor válido!");
                    break;
            }
        }
    }
}
