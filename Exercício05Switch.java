import java.util.Scanner;
public class Exercicio05 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2, media, subtracao, produto, divisao;
        String escolha;

        System.out.print("Digite um valor: ");
        num1 = entrada.nextInt();
        System.out.print("Digite outro valor: ");
        num2 = entrada.nextInt();

        System.out.println("============================================================");
        System.out.println("OPÇÃO            MENSAGEM");
        System.out.println("  M        -     média entre os números digitados ");
        System.out.println("  S        -     diferença do maior pelo menor ");
        System.out.println("  P        -     produto entre os números digitados ");
        System.out.println("  D        -     divisão do primeiro pelo segundo ");
        System.out.println("============================================================");
        System.out.print("Escolha sua opção: ");
        escolha = entrada.next();

        media = (num1 + num2) / 2;
        produto = num1 * num2;
        divisao = num1 / num2;

        if (num1 < num2)
        subtracao = num2 - num1;
        else 
        subtracao = num1 - num2;

        switch (escolha) {
            case "M":
                System.out.println("A média é: " + media);
                    break;
            case "S":
                System.out.println("A subtração deu: " + subtracao);
                    break;
            case "P":
            System.out.println("O produto deu: " + produto);
                break;
            case "D":
            System.out.println("A divisão deu: " + divisao);
            default:
            System.out.println("Opção inválida!");
                break;
        }
        entrada.close();
    }
}
