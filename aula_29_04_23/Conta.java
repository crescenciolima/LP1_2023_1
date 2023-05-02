import javax.annotation.processing.SupportedSourceVersion;

public class Conta {
    protected String numero;
    protected double saldo;

    public Conta(String numero ,double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public void creditar(double valor){
        saldo += valor;
    }

    public void debitar(double valor){
        if(saldo >= valor){
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }



}
