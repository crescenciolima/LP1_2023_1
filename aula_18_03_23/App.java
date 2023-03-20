public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("123-4", 100.0);
        Conta c2 = new Conta("456-7");
        Conta c3 = new Conta("777");
        Conta c4 = new Conta("123-4", 100.0);
        //System.out.println(c1);
        //System.out.println(c4);
        c1.creditar(50.0);
        c2.creditar(100.0);
        c3.creditar(9.0);
        c4.creditar(2.0);

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
        c4.imprimir();
    }
}

