public class Poupanca extends Conta {
    public Poupanca(String numero, double saldo){
        super(numero, saldo);
    }

    public void renderJuros(double TAXA){
        saldo = saldo + (saldo*TAXA);
    }

}
