package exe7;

import java.util.Scanner;

public class exe7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// TODO Auto-generated method stub
		
		System.out.print("Digite o valor da base maior do trap�zio:");
		Double t1 = sc.nextDouble();
		System.out.print("Digite o valor da base menor do trap�zio:");
		Double t2 = sc.nextDouble();
		System.out.print("Digite o valor da altura do trap�zio:");
		Double h = sc.nextDouble();
		System.out.print("A �rea do trap�zio � = " + (t1 + t2) * h /2);
		
	}

}
