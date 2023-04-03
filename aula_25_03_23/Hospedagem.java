public class Hospedagem {
    private int codigo, aposento;
    private Data data_entrada, data_saida;
    private Hospede cliente;
    
    public Hospedagem(int codigo, int aposento, Data data_entrada, Data data_saida, Hospede cliente){
        this.codigo = codigo;
        this.aposento = aposento;
        this.data_entrada = data_entrada;
        this.data_saida = data_saida;
        this.cliente = cliente;
    }

    public void relatorio(){
        System.out.println("Código da reserva: " + codigo);
        System.out.println("Aposento: "+aposento);
        System.out.print("Data de entrada: ");
        data_entrada.imprimir_data();
        System.out.print("Data de Saída: ");
        data_saida.imprimir_data();
        cliente.imprimir_hospede();
        data_entrada.imprimir_data();
        System.out.print("Data de Saída: ");
        data_saida.imprimir_data();
        cliente.imprimir_hospede();
        data_entrada.imprimir_data();
        System.out.print("Data de Saída: ");
        data_saida.imprimir_data();
        cliente.imprimir_hospede();
    }
}
