public class App_array_simples {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("123-4", 100.0);
        Conta c2 = new Conta("555", 150.0);
        Conta c3 = new Conta("567-8", 50.0);

        Conta [] contas = new Conta[3];
        contas[0] = c1;
        contas[1] = c2;
        contas[2] = c3;

        for(int i = 0; i < contas.length; i++){
            contas[i].imprimir();
        }
    }
}
