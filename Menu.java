package Calculadora;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true){
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
                    Digite aqui:""");
            int action = teclado.nextInt();
            switch (action){
                case 1:
                Double resultSoma = operacoes.somar(n1, n2);
                    System.out.println("A soma entre " + n1 + " e " + n2 + " é " + resultSoma);
                    break;
                case 2:
                    Double resultSub = operacoes.subtrair(n1, n2);
                    System.out.println("A subtração entre " + n1 + " e " + n2 + " é " + resultSub);
                    break;
                case 3:
                    Double resultMulti = operacoes.multiplicar(n1, n2);
                    System.out.println("A multiplicação entre " + n1 + " e " + n2 + " é " + resultMulti);
                    break;
            }
        }
    }
}
