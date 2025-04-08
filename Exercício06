import java.util.Scanner;
import java.lang.Math;
public class Exercicio06 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double altura, peso, alturacal, contaIMC;
    

    System.out.print("Digite sua altura em m: ");
    altura = entrada.nextDouble();

    System.out.print("Digite seu peso em Kg atual: ");
    peso = entrada.nextDouble();

    alturacal = Math.pow(altura,2);
    contaIMC = peso / alturacal;



    if (contaIMC >= 18.5 & contaIMC <= 24.9)
    System.out.println("Seu IMC atual é: " + contaIMC + " Seu peso está ideal!");
    else if (contaIMC <= 18.4)
    System.out.println("Seu IMC atual é: " + contaIMC + " Você está com falta de peso");
    else
    System.out.println("Seu IMC atual é: " + contaIMC + " Você está com sobrepeso");


    entrada.close();
    }
}
