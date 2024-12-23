import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double angulo, resultado, seno, cosseno, tangente, secante, cossecante, cotangente;
        
        System.out.println("Qual o angulo em grau?");
        angulo = ler.nextDouble();
        
        resultado = angulo * (Math.PI / 180);
        System.out.println("Radiano: " + resultado + ".");
        
        seno = Math.sin(resultado);
        System.out.println("Seno: " + seno + ".");
        
        cosseno = Math.cos(resultado);
        System.out.println("Cosseno: " + cosseno + ".");
        
        tangente = Math.tan(resultado);
        System.out.println("Tangente: " + tangente + ".");
        
        secante = 1 / cosseno;
        System.out.println("Secante: " + secante + ".");
        
        cossecante = 1 / seno;
        System.out.println("Cossecante: " + cossecante + ".");
        
        cotangente = 1 / tangente;
        System.out.println("Cotangente: " + cotangente + ".");
    }
}
