public class Professor extends Participante {
    private int codigoSiape;

    public Professor(String nome, String cpf, int idade, int codigoSiape){
        super(nome, cpf, idade);
        this.codigoSiape = codigoSiape;
    }

    public void emitirCertificado(){
        System.out.println("Declaro para os devidos fins que o professor: " + 
        nome + " numero de CPF: " + cpf + 
        " e codigo siape: " + codigoSiape +
        " participou da Week-IT 2022");
    }



}
