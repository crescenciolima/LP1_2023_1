public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("123-4", 100.0);
        Conta c2 = new Conta("555", 150.0);
        Conta c3 = new Conta("567-8", 50.0);
        Conta c4 = new Conta("891-0", 200.0);

        Repositorio BD = new Repositorio();
        BD.inserir(c1);
        BD.inserir(c2);
        BD.inserir(c3);
        System.out.println(BD.procurarConta(c1));
        System.out.println(BD.procurarConta(c4));
        System.out.println(BD.procurarConta("555"));
        System.out.println(BD.procurarConta("123"));

        BD.remover(c4);
        BD.remover(c1);

        BD.relatorio();

    }
}
