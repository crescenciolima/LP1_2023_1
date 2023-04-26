public class Conta {
    private String numero;
    private double saldo;

    public Conta(String n, double s){
        numero = n;
        saldo = s;
    }

    public String getNumero() {
        return numero;
    }

    public void creditar(double valor){
        saldo += valor;
    }

    public void imprimir(){
        System.out.println("-----------------");
        System.out.println("Conta: " + numero);
        System.out.println("Saldo: " + saldo);
    }






}
