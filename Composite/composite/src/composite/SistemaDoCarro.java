package composite;

import java.util.ArrayList;

public abstract class SistemaDoCarro {
	
	protected String nome;
	public SistemaDoCarro(String nome) {
		this.nome = nome;
	}
	
	public abstract void escreva();
	public abstract void add(SistemaDoCarro arquivo);
	public abstract void remove(SistemaDoCarro arquivo);
	public abstract SistemaDoCarro pegarArquivos(int pos);
	public abstract int QntdePecas();
}


