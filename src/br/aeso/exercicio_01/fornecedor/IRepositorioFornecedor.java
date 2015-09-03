package br.aeso.exercicio_01.fornecedor;

import java.util.ArrayList;

public interface IRepositorioFornecedor {
	
	public void cadastrarForn(Fornecedor fornecedor) throws FornecedorJaCadastradoException;
	public Fornecedor procurarForn(String cpf);
	public void atualizarForn(String cpf);
	public void removerForn(String cpf);
	public ArrayList<Fornecedor> listarForn();
	
}
