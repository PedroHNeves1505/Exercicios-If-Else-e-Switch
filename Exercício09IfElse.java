import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double prestacaodej, salario, prestacaomax;

        System.out.print("Qual é a prestação desejada: ");
        prestacaodej = entrada.nextDouble();

        System.out.print("Digite seu salário: ");
        salario = entrada.nextDouble();


    prestacaomax = salario * 0.3;

    if (prestacaodej <= prestacaomax)
        System.out.println("Emprestimo pode ser concedido.");
    else    
        System.out.println("Emprestimo não pode ser concedido.");



        entrada.close();
    }
}
