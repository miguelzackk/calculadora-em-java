package Aula02;

import java.util.Scanner;

public class testeAula02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		System.out.print("Digite o Primeiro Número: ");
		num1 = sc.nextInt();

		System.out.print("Digite o Segundo Número: ");
		num2 = sc.nextInt();

		num3 = num1 + num2;
		
		System.out.print("O total da soma é " + num3);
		sc.close();

	}

}
