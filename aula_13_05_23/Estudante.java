public class Estudante extends Participante {
    private int numeroMatricula;

    public Estudante(String nome, String cpf, int idade, int numeroMatricula){
        super(nome, cpf, idade);
        this.numeroMatricula = numeroMatricula;
    }

    public void emitirCertificado(){
        System.out.println("Declaro para os devidos fins que o estudante " +
        nome + " que possui o CPF: " + cpf + " e numero de matricula: " +
        numeroMatricula + " participou da Week-it 2022");
    }



}
