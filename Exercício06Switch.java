import java.util.Scanner;
public class Exercicio06 {
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int codigo, quantidade;
       double valor100, valor101, valor102, valor103, valor104, valor105;
       

        System.out.println("=======================================");
        System.out.println("CÓDIGO      PRODUTO           PREÇO");
        System.out.println("=======================================");
        System.out.println("100     Cachorro Quente      R$1,20");
        System.out.println("101     Bauru Simples        R$1,30");
        System.out.println("102     Bauru com Ovo        R$1,50");
        System.out.println("103     Hambúrguer           R$1,20");
        System.out.println("104     Cheeseburguer        R$1,30");
        System.out.println("105     Refrigerante         R$1,00");
        System.out.println("======================================");

        System.out.print("Digite o código do produto: ");
        codigo = entrada.nextInt();
        System.out.print("Qual a quantidade que você quer desse produto?: ");
        quantidade =entrada.nextInt();

        valor100 = 1.20 * quantidade;
        valor101 = 1.30 * quantidade;
        valor102 = 1.50 * quantidade;
        valor103 = 1.20 * quantidade;
        valor104 = 1.30 * quantidade;
        valor105 = 1 * quantidade;


        switch (codigo) {
            case 100:
                System.out.println("Serão " + quantidade + "Cachorro(s) quente(S), o preço final será R$" + valor100);
                    break;
            case 101:
                System.out.println("Serão " + quantidade + "Bauru(s) simples, o preço final será R$" + valor101);
                    break;
            case 102:
                System.out.println("Serão " + quantidade + "Bauru(s) com ovo, o preço final será R$" + valor102);
                    break;
            case 103:
                System.out.println("Serão " + quantidade + "Hambúrguer(s), o preço final será R$" + valor103);
                    break;
            case 104:
                System.out.println("Serão " + quantidade + "Cheeseburguer(s), o preço final será R$" + valor104);
                    break;
            case 105:
                System.out.println("Serão " + quantidade + "Refrigerante(s), o preço final será R$" + valor105);
                    break;
            default:
            System.out.println("Opção inválida!");
                break;
        }



       entrada.close();

    }
}
