package br.aeso.exercicio_01.fornecedor;
import java.util.ArrayList;
import java.util.Iterator;

import br.aeso.execicio_01.generico.IRepositorioArrayList;

public class RepositorioFornecedor<T> implements IRepositorioArrayList<T>{
	
	private ArrayList repositorioFornecedor;
	private Fornecedor fornecedor;
	
	
	public RepositorioFornecedor(){
		repositorioFornecedor = new ArrayList<Fornecedor>();	
	}
	
	
	private boolean existe(String cpf) {
		boolean resposta = false;
		String novoCpf = null;
		Fornecedor objAtual = null;
		Iterator i = repositorioFornecedor.iterator();
		while(i.hasNext()){
		objAtual = (Fornecedor) i.next();
		novoCpf = objAtual.getCpf();
			if(cpf.equals(novoCpf)){ 
				resposta = true;
				break;
			}
		}
		return resposta;
	}	
	

	@Override
	public void cadastrar(T fornecedor) {
		this.repositorioFornecedor.add(fornecedor);
		
	}

	@Override
	public T procurar(String cpf) {
		T objRetorno = null;
		Fornecedor objAtual = null;
		String novoCpf = null;
		Iterator i = repositorioFornecedor.iterator();
		while(i.hasNext()){
			objAtual = (Fornecedor) i.next();
			novoCpf = objAtual.getCpf();
			if(cpf.equals(novoCpf)){
				objRetorno = (T) objAtual;
				return objRetorno;
			}
		}
		return null;
	}

	@Override
	public void atualizar(String cpf, T obj) {
		
		
	}

	@Override
	public void remover(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<T> listar() {
		ArrayList<Fornecedor> listar = new ArrayList<Fornecedor>();
		return null;
	}
	
	
	

}
