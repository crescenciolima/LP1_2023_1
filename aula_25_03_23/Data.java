public class Data {
    private int dia,ano;
    private String mes;
    
    public Data(int dia, String mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    public void imprimir_data(){
        System.out.println("Data: "+ dia + " " + mes + " " + ano);
    }
}
