package composite;

import java.security.PublicKey;

public class No extends SistemaDoCarro{

	public No(String nome) {
		super(nome);
	}

	@Override
	public void escreva() {
		System.out.println("--" + nome);
	}

	@Override
	public int QntdePecas(){
		return 1;
	}
	@Override
	public void add(SistemaDoCarro arquivo) {
		/*nao faz nada*/
		
	}

	@Override
	public void remove(SistemaDoCarro arquivo) {
		/*nao faz nada*/
		
	}

	@Override
	public SistemaDoCarro pegarArquivos(int pos) {
		return null;
	}

}
