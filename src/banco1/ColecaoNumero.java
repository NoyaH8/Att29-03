package banco1;

import banco2.Numero;

public class ColecaoNumero {
	
	private Numero[] numero = new Numero[10];
	int cont = 0;
	int soma;
	
	public void cadastrarContaOtimizado(Numero numero) {
		this.numero[cont] = numero;
		this.cont++;
		
	}
 public int SomarNumeros() {
	 for(Numero num : numero) {
		 soma+=num.getNum();
	 }
	 return soma;
 }
}
