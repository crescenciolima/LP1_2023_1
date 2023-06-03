public class Conta extends ContaAbstrata {
    public Conta(String numero, double saldo){
        super(numero, saldo);
    }

    public void debitar(double valor) throws SIException{
        if(saldo > valor){
            saldo -= valor;
        } else {
            SIException e = new SIException();
            throw e;
        }


    }
    
}
