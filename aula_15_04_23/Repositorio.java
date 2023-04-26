public class Repositorio {
    private Conta [] contas;
    private int indice;
    private static final int MAX = 5;

    public Repositorio(){
        contas = new Conta[MAX];
        indice = 0;
    }

    public void inserir(Conta c){
        contas[indice] = c;
        indice++;
    }

    public void relatorio(){
        for(int i = 0; i < indice; i++){
            contas[i].imprimir();
        }
    }

    public boolean procurarConta(Conta conta) {
        for(int i = 0; i < indice; i++) {
            if (contas[i] == conta) {
                return true;
            }
        }
        return false;
    }

    public boolean procurarConta(String numero) {
        for(int i = 0; i < indice; i++) {
            if (contas[i].getNumero().equals(numero)) {
                return true;
            }
        }
        return false;
    }
    
    public void remover(Conta c){
        if(procurarConta(c)) {
            for(int i = 0; i < indice; i ++){
                if(contas[i] == c){
                    contas[i] = contas[indice - 1];
                    contas[indice - 1] = null;
                    indice --;

                }
            }
        }else{
            System.out.println("Objeto conta não existe!");
    }
        
    }
}
