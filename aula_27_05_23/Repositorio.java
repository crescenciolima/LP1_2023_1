public class Repositorio {  
    private ContaAbstrata [] BD;
    private int indice;

    public Repositorio(){
        BD = new ContaAbstrata[5];
        indice = 0;
    }

    public void inserir(ContaAbstrata c){
        for(int i=0; i < indice; i++){
            if(BD[i] == c){
                
            }
        }

    }
    
}
