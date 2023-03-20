public class App {
    public static void main(String[] args) throws Exception {
        int max, a, b, c;
        String resultado;
        a = 6;
        b = 5;
        c = 20;

        max = (a > b) ? a : b;

        resultado = (a > b) ? "verdade" : "falso";

        System.out.println("Maior: " + max);
        System.out.println(resultado);

        max = (a > b) ? ((a > c) ? a : c) : b;

        System.out.println("maior: " + max);

        System.out.println("Maior: " + ((a > b) ? ((a > c) ? a : c) : b));


        int num = 0;
        double valor = 10.5;

        num = (int)valor;
        System.out.println(num);




    }
}
