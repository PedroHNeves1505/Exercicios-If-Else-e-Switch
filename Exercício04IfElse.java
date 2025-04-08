import java.util.Scanner;
public class Exercicio04 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double valor1, valor2;

        System.out.print("Digite um valor: ");
        valor1 = entrada.nextDouble();
        System.out.print("DIgite outro valor diferente: ");
        valor2 = entrada.nextDouble();

        if(valor1 > valor2)
        System.out.println(valor1 + " - " + valor2);
        else
        System.out.println(valor2 + " - " + valor1);

        entrada.close();
    }
}
