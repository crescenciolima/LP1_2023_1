public class Conta {
    private String numero;
    private double saldo;

    public Conta(String n, double s){
        numero = n;
        saldo = s;
    }

    public Conta(String n){
        numero = n;
        saldo = 0.0;
    }

    // Como seria o construtor padrão
    /*  
    public Conta(){
        numero = null;
        saldo = 0.0;
    }
     */

    public void creditar(double valor){
        saldo += valor;
    }

    public void debitar(double valor){
        if (saldo >= valor){
            saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    public void imprimir(){
        System.out.println("---- Banco LP1 ----");
        System.out.println("Número da Conta: " + numero);
        System.out.println("Saldo da Conta: " + saldo);
    }

}
