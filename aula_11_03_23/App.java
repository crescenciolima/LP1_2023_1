public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta();
        
        c1.setNumero("123-4");
        c1.setSaldo(100.0);
        
        System.out.println("Numero: " + c1.getNumero());
        System.out.println("Saldo: " + c1.getSaldo());

        c1.creditar(100.0);
        c1.debitar(150.0);

        c1.imprimir();
    }
}
