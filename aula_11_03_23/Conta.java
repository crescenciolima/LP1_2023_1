public class Conta {
    private String numero;
    private double saldo;

    public void creditar(double valor){
        saldo = saldo + valor;
    }

    public void setNumero(String n){
        numero = n;
    }

    public void setSaldo(double s){
        saldo = s;
    }

    public String getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public void debitar(double valor){
        if(saldo >= valor){
            saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void imprimir(){
        System.out.println("------------------");
        System.out.println("---- Extrato -----");
        System.out.println("Numero conta: " + numero);
        System.out.println("Saldo: " + saldo);
    }

}
