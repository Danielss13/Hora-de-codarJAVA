package exe10;

import java.util.Scanner;

public class exe10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// TODO Auto-generated method stub
		
		System.out.print("Digite um número:");
		int n1 = sc.nextInt();
		
		if(n1 > 0) {
			System.out.print("POSITIVOOOOOOOOOOOOOO");	
		}
		
		else if(n1 < 0) {
			System.out.print("NEGATIVOOOOOOOOOOOOOO");	
			
		}else {
			System.out.print("NEUTROOOOOOOOOOOOOOOO");	
		}
		

	}

}
