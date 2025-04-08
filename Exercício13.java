import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor1, valor2;
        char operacao;

        System.out.print("Digite o primeiro valor: ");
        valor1 = entrada.nextDouble();

        System.out.print("Digite o segundo valor: ");
        valor2 = entrada.nextDouble();

        System.out.print("Digite o sinal da operação desejada (+, -, *, /): ");
        operacao = entrada.next().charAt(0); 

        if (operacao == '+') {
            System.out.println("O resultado é: " + (valor1 + valor2));
        } else if (operacao == '-') {
            System.out.println("O resultado é: " + (valor1 - valor2));
        } else if (operacao == '*') {
            System.out.println("O resultado é: " + (valor1 * valor2));
        } else if (operacao == '/') {
            if (valor2 != 0) {
                System.out.println("O resultado é: " + (valor1 / valor2));
            } else {
                System.out.println("Impossível dividir por zero.");
            }
        } else {
            System.out.println("Sinal inválido.");
        }
        
        entrada.close();
            
        }
}
