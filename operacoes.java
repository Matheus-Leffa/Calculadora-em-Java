package Calculadora;

public class operacoes {
    public static double somar(double num1, double num2){
        return num1 + num2;
    }
    public static double subtrair(double num1, double num2){
        return num1 - num2;
    }
    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }
    public static String dividir(double num1, double num2) {
        if (num2 != 0) {
            return "A divisão entre " + num1 + " e " + num2 + " é " + num1/num2;
        } else {
            return "Não é possível divisão por 0!";
        }
    }
    }
