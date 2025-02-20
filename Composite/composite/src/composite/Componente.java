package composite;

import java.util.ArrayList;

public class Componente extends SistemaDoCarro {

	private ArrayList<SistemaDoCarro> arquivos;
	
	public Componente(String nome) {
		super(nome);
		arquivos = new ArrayList<SistemaDoCarro>();
	}


	@Override
	public void escreva() {
		System.out.println("+" + nome);
		for (SistemaDoCarro arquivo : arquivos) {
			 arquivo.escreva();
		}
	}
     @Override
	public int QntdePecas(){
		int qnt = 1;
		for(SistemaDoCarro arquivo : arquivos){
		 qnt = qnt + arquivo.QntdePecas();
		}
		return qnt;
	}

	@Override
	public void add(SistemaDoCarro arquivo) {
		arquivos.add(arquivo);
		
	}

	@Override
	public void remove(SistemaDoCarro arquivo) {
		arquivos.remove(arquivo);
		
	}

	@Override
	public SistemaDoCarro pegarArquivos(int posicao) {
		// TODO Auto-generated method stub
		return arquivos.get(posicao);
	}
	
}
