package exe8;

import java.util.Scanner;

public class exe8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// TODO Auto-generated method stub
		
		System.out.print("Digite o valor da base do paralelogramo:");
		Double base = sc.nextDouble();
		System.out.print("Digite o valor da altura do paralelogramo:");
		Double altura = sc.nextDouble();
		System.out.print("A área do paralelogramo é = " + base * altura);

	}

}
