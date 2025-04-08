import java.util.Scanner;
public class Exercicio01 {

public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numerodasemana;

    System.out.println("===================================================");
    System.out.println("Digite o número correspondente ao dia da semana!");
    System.out.println(" 1  - Domingo");
    System.out.println(" 2  - Segunda");
    System.out.println(" 3  - Terça");
    System.out.println(" 4  - Quarta");
    System.out.println(" 5  - Quinta");
    System.out.println(" 6  - Sexta");
    System.out.println(" 7  - Sábado");
    System.out.println("===================================================");
    System.out.print("Digite aqui: ");
    numerodasemana = entrada.nextInt();

    switch (numerodasemana) {
        case 1:
            System.out.println("Hoje é domingo!");
                break;
        case 2:
            System.out.println("Hoje é segunda!");
                break;
        case 3:
            System.out.println("Hoje é terça!");
                break;
        case 4:
            System.out.println("Hoje é quarta!");
                break;
        case 5:
            System.out.println("Hoje é quinta!");
                break;
        case 6:
            System.out.println("Hoje é sexta!");
                break;
        case 7:
            System.out.println("Hoje é sabado!");
                break;
        default:
            System.out.println("Valor invalido!");
            break;
        }
        entrada.close();
    }
}
