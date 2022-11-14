package exe6;

import java.util.Scanner;

public class exe6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		// TODO Auto-generated method stub
		
		System.out.print("Digite o valor da diagonal maior:");
		Double d1 = sc.nextDouble();
		System.out.print("Digite o valor da diagonal menor:");
		Double d2 = sc.nextDouble();
		System.out.print("A área do losango é = " + (d1 * d2) /2);


	}

}
