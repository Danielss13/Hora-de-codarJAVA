package exe13;

import java.util.Scanner;

public class exe13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// TODO Auto-generated method stub
		
		System.out.print("Informe um valor:");
		int n1 = sc.nextInt();
		System.out.print("Informe o segundo valor:");
		int n2 = sc.nextInt();
		
		while(n2 <= 0 ) {
			System.out.print("Informe o segundo valor:");
			n2 = sc.nextInt();
		}
		if(n2 > 0) {
			System.out.print("O resultado da multiplicao é =:" + n1 * n2);
		}

	}

}
