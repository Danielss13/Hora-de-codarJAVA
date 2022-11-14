package exe12;

import java.util.Scanner;

public class exe12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// TODO Auto-generated method stub
		
		System.out.print("Informe um número:");
		int n1 = sc.nextInt();
		System.out.print("Informe o segundo número:");
		int n2 = sc.nextInt();
		System.out.print("Informe o terceiro número:");
		int n3 = sc.nextInt();
		
		if(n1 > n3 && n2 > n3) {
			System.out.print("A soma entre os dois maiores é = " + (n1 + n2));
			
		}
		
		else if (n2 > n1 && n3 > n1) {
			System.out.print("A soma entre os maiores é = " + (n2 + n3));
			
		}
		
		else if (n3 > n2 && n1 > n2) {
			System.out.print("A soma entre os maiores é = " + (n3 + n1));
			
		}else if(n1 == n2 || n1 == n3 || n2 == n1 || n2 == n3 || n3 == n1 || n3 == n2) {
			System.out.print("ERRO -- Digite números diferentes");
			
		}

	}

}
