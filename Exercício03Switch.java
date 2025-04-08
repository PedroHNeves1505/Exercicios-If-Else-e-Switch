import java.util.Scanner;
public class Exercicio03 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String periodo;

        System.out.println("===================");
        System.out.println("M  -  Matutino");
        System.out.println("V  -  Vespertino");
        System.out.println("N  -  Noturno");
        System.out.println("===================");
        System.out.println("Qual o perido que você estuda?");
        periodo = entrada.nextLine();

        switch (periodo) {
            case "M":
                System.out.println("Bom dia!");
                    break;
            case "V":
                System.out.println("Boa tarde!");
                    break;
            case "N":
                System.out.println("Boa noite!");
                    break;
            default:
                System.out.println("Horario indisponível");
                    break;
        }

        entrada.close();
    }
}
