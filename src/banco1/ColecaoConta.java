package banco1;


import banco2.Conta;

public class ColecaoConta {
	
	private Conta[] conta = new Conta[10];
	int cont = 0;
	
	public void CadastrarConta (Conta conta){
		
		for (int cont = 0; cont < this.conta.length; cont++) {

			if (this.conta[cont] == null) {

				this.conta[cont] = conta;
				break;
			}
		}

	}

	public void cadastrarContaOtimizado(Conta conta) {
		this.conta[cont] = conta;
		this.cont++;
	}

	public Conta[] retornoConta() {

		return this.conta;
		
	}
	public Conta procurarContaNome(String nome) {
		
		for(Conta b : this.conta) {
			if(b.getNome().equals(nome)) { 
				return b;
			}
		}
		return null;
	}
	
}