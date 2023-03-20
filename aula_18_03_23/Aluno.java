public class Aluno {
    private String nome, cpf;
    private int idade;
    private Curso cursoAluno;

    public Aluno(String n, String c, int i, Curso ca){
        nome = n;
        cpf = c;
        idade = i;
        cursoAluno = ca;
    }

    public void imprimirAluno(){
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("CPF do aluno: " + cpf);
        System.out.println("Idade: " + idade);
        //System.out.println("Curso: " + cursoAluno);
        cursoAluno.imprimirCurso();
    }


}
