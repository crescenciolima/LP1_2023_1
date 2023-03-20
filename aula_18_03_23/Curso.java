public class Curso {
    private String nome;
    private int codigo;

    public Curso(String nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public void imprimirCurso(){
        System.out.println("Nome do curso: " + nome);
        System.out.println("Codigo do curso: " + codigo);   
    }
    
}
