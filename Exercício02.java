import java.util.Scanner;
public class Exercicio02 {
    
    public static void main(String[] args) {
        int idade;
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        idade = entrada.nextInt();

        if(idade >= 18)
        System.out.println("Você é maior de idade.");
        else
        System.out.println("Você é menor de idade.");

        entrada.close();
    }
}
