public class Repositorio {
    private int indice;
    private ContaAbstrata [] bd;

    public Repositorio(){
        bd = new ContaAbstrata[5];
        indice = 0;
    }

    public void inserir(ContaAbstrata ca){
        bd[indice] = ca;
        indice++;
    }

    public void remover(ContaAbstrata ca){
        for(int i = 0; i < indice; i++){
            if(bd[i] == ca){
                bd[i] = bd[indice-1];
                bd[indice-1] = null;
                indice--;
            } 
        }
    }

    public void imprimir(){
        for(int i = 0; i < indice; i++){
            bd[i].relatorio();
        }
    }

}
