public class Hospede {
    private int codigo;
    private String nome, cpf, rg, telefone;

    public Hospede(int codigo, String nome, String cpf, String rg, String telefone){
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
    }

    public void imprimir_hospede(){
        System.out.println(":::::::Hospede:::::::: ");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Telefone: " + telefone);
    }
}
