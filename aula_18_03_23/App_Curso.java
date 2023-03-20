public class App_Curso {
    public static void main(String[] args) throws Exception {
        Curso BSI = new Curso("Sistemas de Informação", 456);
        Curso Eletrica = new Curso("Eng. Eletrica", 333);

        Aluno a1 = new Aluno("Etelvaldo", "123-4", 22, BSI);
        a1.imprimirAluno();
    }
}
