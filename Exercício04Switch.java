import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, salarioA, salarioB, salarioC;
        String plano;

        System.out.print("Digite o seu salario:");
        salario = entrada.nextDouble();

        System.out.println("=====================");
        System.out.println("Plano     Aumento");
        System.out.println("A   -     10% ");
        System.out.println("B   -     15% ");
        System.out.println("C   -     20% ");
        System.out.println("=====================");
        System.out.print("Selecione seu plano:");
        plano = entrada.next();

        salarioA = salario * 1.10;
        salarioB = salario * 1.15;
        salarioC = salario * 1.20;

        switch (plano) {
            case "A":
                System.out.printf("Seu novo salário será: R$%.2f%n", salarioA);
                break;
            case "B":
                System.out.printf("Seu novo salário será: R$%.2f%n", salarioB);
                break;
            case "C":
                System.out.printf("Seu novo salário será: R$%.2f%n", salarioC);
            default:
                System.out.println("Opção inválida");
                break;
        }
        entrada.close();
    }
}
