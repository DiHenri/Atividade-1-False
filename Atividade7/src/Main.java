import java.util.Locale;
import java.util.Scanner;

public class Main {

	
	
	

	public static void main(String[] args) {
		
  
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		
		A = sc.nextDouble();
		B = sc.nextDouble();
        C = sc.nextDouble();
        
        
                triangulo = A * C / 2.0;
        		circulo = 3.14159 * C * C;
        		trapezio = (A + B ) / 2.0 * C;
        		quadrado = B * B ;
        		retangulo = A * B ;
        		
        		
        		System.out.printf("TRIANGULO: %.f3%n", triangulo);
        		
        		System.out.printf("CIRCULO: %.f3%n", circulo);  
        		
        		System.out.printf("TRAPEZIO: %.f3%n", trapezio); 
        		
        		System.out.printf("QUADRADO: %.f3%n", quadrado);
        		
        		System.out.printf(" RETANGULO: %.f3%n", retangulo);
        		
        		
        		sc.close();
        		
        
		

	}

}
