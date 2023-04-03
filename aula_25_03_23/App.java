public class App {
    public static void main(String[] args) throws Exception {
        Data d1 = new Data(25,"marco",2023);
        Data d2 = new Data(29,"marco",2023);
        d1.imprimir_data();

        Hospede h1 = new Hospede(123,"Clodoaldo","123456789","987654321","779999999");
        h1.imprimir_hospede();

        Hospedagem cliente1 = new Hospedagem(123,212,d1,d2,h1);   
        
    }
}
