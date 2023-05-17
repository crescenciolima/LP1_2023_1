public abstract class Participante {
    protected String nome;
    protected String cpf;
    protected int idade;

    public Participante(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public abstract void emitirCertificado();
    
    public int calcular(double x){
        return (int)x;
    }
}
