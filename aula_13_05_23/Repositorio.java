public class Repositorio {
    private Participante [] bd;
    private int indice;

    public Repositorio(){
        bd = new Participante[5];
        indice = 0;
    }

    public void inserir(Participante p){
        bd[indice] = p;
        indice++;
    }

    public void remover(Participante p){
        for(int i = 0; i < indice; i++){
            if(bd[i] == p){
                bd[i] = bd[indice-1];
                bd[indice-1] = null;
                indice--;
            }
        }
    }

    public void printALL(){
        for(int i = 0; i < indice; i++){
            bd[i].emitirCertificado();
        }
    }


}
