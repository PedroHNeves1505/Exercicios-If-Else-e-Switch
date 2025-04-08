import java.util.Scanner;
public class Exercicio05 {
     
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print("Digite um valor inteiro: ");
        num = entrada.nextInt();

        if (num >= 50){
        if (num <= 100)
            System.out.println("O valor está no intervalo.");  
        else
            System.out.println("O valor está fora do intervalo.");
        
        }
        else
        System.out.println("O valor está fora do intervalo.");

        entrada.close();
    }
}
