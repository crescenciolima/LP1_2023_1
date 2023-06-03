import java.util.Scanner;

public class App {



    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        String numero = input.nextLine();
        System.out.println("Digite o saldo: ");
        double saldo = input.nextDouble();
        Conta c2 = new Conta(numero, saldo);
        System.out.println("Inicio da conta");
        Conta c1 = new Conta("123", 100.0);
        try{
            c1.debitar(200.0);
        } catch (SIException e) {
            System.out.println("Erro: " + e);
        }
        

        System.out.println("Fim da conta");

    }

}
