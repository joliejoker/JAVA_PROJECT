package br.aeso.exercicio_01.fornecedor;

import java.util.ArrayList;

public class ControladorFornecedor {
	
	private RepositorioFornecedor repositorioFornecedor;
	private ControladorFornecedor controladorFornecedor;
	
	public ControladorFornecedor(){
		repositorioFornecedor = new RepositorioFornecedor();
		controladorFornecedor = new ControladorFornecedor();
	}
	
	public void cadastrarForn(Fornecedor fornecedor){
		controladorFornecedor.cadastrarForn(fornecedor);
		
	}
	
	public Fornecedor procurarForn(String cpf){
		 return controladorFornecedor.procurarForn(cpf);
		
	}
	
	public void atualizarForn(String cpf){
		controladorFornecedor.atualizarForn(cpf);
		
	}
	
	public void removerForn(String cpf){
		controladorFornecedor.removerForn(cpf);
		
	}
	
	public ArrayList<Fornecedor> listarForn(){
		return null;
	}

}
