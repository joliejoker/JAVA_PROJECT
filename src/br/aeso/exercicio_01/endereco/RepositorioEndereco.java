package br.aeso.exercicio_01.endereco;
import java.util.ArrayList;

import br.aeso.execicio_01.generico.IRepositorioArrayList;
import br.aeso.exercicio_01.fornecedor.Fornecedor;


public class RepositorioEndereco<T> implements IRepositorioArrayList<T>{
	
	private ArrayList repositorioEndereco;
	private Endereco endereco;
	
	public RepositorioEndereco() {
		repositorioEndereco = new ArrayList<Endereco>();
	}

	@Override
	public void cadastrar(T endereco) {
		this.repositorioEndereco.add(endereco);
		
	}

	@Override
	public T procurar(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(String cpf, T obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<T> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
