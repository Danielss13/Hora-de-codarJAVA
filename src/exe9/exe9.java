package exe9;
import java.util.Scanner;

public class exe9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// TODO Auto-generated method stub
		
       System.out.println("Escreva o valor do raio");
       double raio = sc.nextDouble();
       double area = sc.nextDouble();
       final double PI = 3.1416;

       area  = PI* (raio*raio);

       System.out.println("O valor da area é " + area);  
  
	}

}
