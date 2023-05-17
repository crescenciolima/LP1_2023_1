public class App {
    public static void main(String[] args) throws Exception {
        Professor p1 = new Professor("Joao", "111", 25, 111);
        Professor p2 = new Professor("Joana", "3121", 30, 222);
        
        Estudante e1 = new Estudante("Pedro", "098", 23, 333);
        Estudante e2 = new Estudante("Teresa", "765", 43, 444);
    
        Repositorio participantes = new Repositorio();
        participantes.inserir(p1);
        participantes.inserir(p2);
        participantes.inserir(e1);
        participantes.inserir(e2);
        participantes.remover(p1);
        participantes.printALL();
    }
}
