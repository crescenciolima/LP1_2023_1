public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("123-4", 100.0);
        Conta c2 = new Conta("567-8", 35.0);
        Poupanca p1 = new Poupanca("555-5", 200.0);
        Poupanca p2 = new Poupanca("888-8", 10.0);
        c1.creditar(20.0);
        p1.creditar(50.0);
        p1.debitar(10.0);
        p1.renderJuros(0.01);

        Repositorio bd = new Repositorio();
        bd.inserir(c1);
        bd.inserir(c2);
        bd.inserir(p1);
        bd.inserir(p2);
        bd.remover(c2);

        bd.relatorio();

    }
}
