package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,b;
        System.out.print("Digite um valor, utilize (,) vírgula p/ decimais: ");
         a = scan.nextDouble();
        System.out.print("Digite um valor, utilize (,) vírgula p/ decimais: ");
         b = scan.nextDouble();
        double somar = somar(a,b);
        double subtrair = subtrair(a,b);
        double multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);


        System.out.printf("somar: " + somar + "\n");
        System.out.printf("subtrair: " + subtrair + "\n");
        System.out.printf("multiplicar: " + multiplicar + "\n");
        System.out.printf("dividir: "+ dividir + "\n");
    }
    public static double somar(double a, double b){
        return a + b;
    }
    public static double subtrair (double a, double b){
        return a - b;
    }
    public static double multiplicar (double a, double b){
        return a * b;
    }
    public static double dividir (double a, double b){
        return a / b;
    }
        
}
