import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class App {
    
    static int soma(){
        return 0;
    }

    static int soma(int x, int y){
        return x+y;
    }

    static double soma(double x, double y){
        return x + y;
    }

    static void soma(double y){
        System.out.println(y+y);
    }

    static void cabecalho(){
        System.out.println("Aula LP1 - IFBA 2023.1");
    }

    static double sqr(double x){
        return x*x;
    }

    static double somasqr(double x, double y){
        return soma(sqr(x), sqr(y));
    }
    
    public static void main(String[] args) throws Exception {
        cabecalho();
        System.out.println(soma());
        System.out.println(soma(10, 5));
        soma(15.0);
        System.out.println(somasqr(3.0, 3.0));
    }
}
