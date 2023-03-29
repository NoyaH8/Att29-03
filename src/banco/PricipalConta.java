package banco;

import java.util.Arrays;
import java.util.Scanner;

import banco1.ColecaoConta;
import banco2.Conta;

public class PricipalConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColecaoConta con = new ColecaoConta();
		Scanner in = new Scanner(System.in);
		
		for (int cont = 0; cont < 3; cont++) {
			
			Conta a = new Conta();
			
			System.out.println("Digite seu nome:");
			a.setNome(in.next());
			
			System.out.println("Digite o valor:");
			a.setValor(in.nextInt());
			
			con.cadastrarContaOtimizado(a);
			
		}
		
		System.out.println("Qual nome quer procurar?");
		String nome = in.next();
		System.out.println(con.procurarContaNome(nome));
		
		
		
		System.out.println(Arrays.toString(con.retornoConta()));
	}

}
