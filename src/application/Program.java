package application;

import java.util.Scanner;
//@test 
public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = input.nextInt();
		System.out.println("fatorial de "+ num +" é: "+ fat(num));
		
		input.close();
	}
	
	//fat of a number
	private static int fat(int n) {
		//stop
		if(n==0) {
			return 1;
		}else {
			return n * fat(n-1);
		}		
	}

}
