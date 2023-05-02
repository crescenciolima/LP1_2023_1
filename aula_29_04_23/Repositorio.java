import java.nio.ReadOnlyBufferException;

public class Repositorio {
    private int indice;
    private Conta [] contas;

    public Repositorio(){
        contas = new Conta[5];
        indice = 0;
    }

    public void inserir(Conta c){
        contas[indice] = c;
        indice++;
    }

    public void remover(Conta c){
        for(int i = 0; i < indice; i++){
            if(contas[i] == c){
                contas[i] = contas[indice-1];
                contas[indice-1] = null;
                indice--;
            }
        }
    }

    public void relatorio(){
        for(int i = 0; i < indice; i++){
            System.out.println("Numero: " + contas[i].numero);
            System.out.println("Saldo: " + contas[i].saldo);
            System.out.println("----------");
        }
    }
}
