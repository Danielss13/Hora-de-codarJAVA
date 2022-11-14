package exe3;

import java.util.Scanner;


public class exe3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// TODO Auto-generated method stub
		
		
		System.out.print("Informe seu nome por favor:");
		String nome = sc.nextLine();
		System.out.print("Qual sua idade?");
		int idade = sc.nextInt();
		System.out.print("Olá, "+ nome + ", sua idade é " + idade + ".");

	}

}
