public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("123", 100.0);
        c1.creditar(10.0);
        c1.debitar(20.0);
        //c1.relatorio();

        ContaImposto ci1 = new ContaImposto("456", 100.0);
        ci1.creditar(10.0);
        ci1.debitar(20.0);
        //ci1.relatorio();

        Poupanca p1 = new Poupanca("999", 10.0);
        p1.creditar(100.0);
        p1.debitar(30.0);
        p1.renderJuros(0.01);
        //p1.relatorio();

        Repositorio bd = new Repositorio();
        bd.inserir(c1);
        bd.inserir(ci1);
        bd.inserir(p1);

        bd.inserir(p1);
        bd.remover(p1);

        bd.imprimir();








    }
}
