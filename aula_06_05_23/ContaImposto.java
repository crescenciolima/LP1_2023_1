public class ContaImposto extends ContaAbstrata {
    public ContaImposto(String numero, double saldo){
        super(numero, saldo);
    }

    public void debitar(double valor){
        double TAXA = 0.01;
        double temp = valor*TAXA;
        if(saldo >= valor+temp){
            saldo -= (valor+temp);
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
}
