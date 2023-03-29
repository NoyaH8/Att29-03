package banco;

import java.util.Scanner;

import banco1.ColecaoNumero;
import banco2.Numero;

public class PrincipalSoma {

	
	public static void main(String[] arg) {
		
		ColecaoNumero cm = new ColecaoNumero();
		Scanner sc = new Scanner(System.in);
		
		for (int cont = 0; cont < 10; cont++) {
			
			Numero a = new Numero();
			
			System.out.println("Digite um numero:");
			a.setNum(sc.nextInt());
		    cm.cadastrarContaOtimizado(a);
			
		}
		System.out.println("Soma é: " + cm.SomarNumeros());
	}
}
