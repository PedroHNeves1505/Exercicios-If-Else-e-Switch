import java.util.Scanner;
public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valordomes;

    System.out.println("===================================================");
    System.out.println("Digite o número correspondente ao mês!");
    System.out.println(" 1   - janeiro");
    System.out.println(" 2   - Fevereiro");
    System.out.println(" 3   - Março");
    System.out.println(" 4   - Abril");
    System.out.println(" 5   - Maio");
    System.out.println(" 6   - Junho");
    System.out.println(" 7   - Julho");
    System.out.println(" 8   - Agosto");
    System.out.println(" 9   - Setembro");
    System.out.println(" 10  - Outubro");
    System.out.println(" 11  - Novembro");
    System.out.println(" 12  - Dezembro");
    System.out.println("===================================================");
    System.out.print("Digite aqui: ");
    valordomes = entrada.nextInt();

    switch (valordomes) {
        case 1:
            System.out.println("Estamos em Janeiro!");
                break;
        case 2:
            System.out.println("Estamos em Fevereiro!");
                break;
        case 3:
            System.out.println("Estamos em Março!");
                break;
        case 4:
            System.out.println("Estamos em Abril!");
                break;
        case 5:
            System.out.println("Estamos em Maio!");
                break;
        case 6:
            System.out.println("Estamos em Junho!");
                break;
        case 7:
            System.out.println("Estamos em Julho!");
                break;
        case 8:
            System.out.println("Estamos em Agosto!");
                break;
        case 9:
            System.out.println("Estamos em Setembro!");
                 break;
        case 10:
            System.out.println("Estamos em Outubro!");
                break;
        case 11:
            System.out.println("Estamos em Novembro!");
                break;
        case 12:
            System.out.println("Estamos em Dezembro!");
                break;
        default:
            System.out.println("Valor inválido!");
                break;
        }
        entrada.close();
    }
}
