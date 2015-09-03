package br.aeso.exercicio_01.fachada;
import java.util.ArrayList;
import br.aeso.exercicio_01.endereco.ControladorEndereco;
import br.aeso.exercicio_01.endereco.Endereco;
import br.aeso.exercicio_01.fornecedor.ControladorFornecedor;
import br.aeso.exercicio_01.fornecedor.Fornecedor;


public class Fachada {
	
	
	private ControladorFornecedor controladorFornecedor;
	private ControladorEndereco controladorEndereco;
	public static Fachada instance;
	
	
	private Fachada(){
		controladorFornecedor = new ControladorFornecedor();
		controladorEndereco = new ControladorEndereco();
		
	}

	public static Fachada getInstance(){
		if(Fachada.instance == null){
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}
	
	public void cadastrarForn(Fornecedor fornecedor){
		this.controladorFornecedor.cadastrarForn(fornecedor);
	}
	public void cadastrarEnd(Fornecedor fornecedor, String rua, String numero, 
			String complemento, String bairro, String cidade, String cep){
		this.controladorEndereco.cadastrarEnd(fornecedor, rua, numero, complemento, 
				bairro, cidade, cep);		
	}
	
	
	public Fornecedor procurarForn(String cpf){
		return this.controladorFornecedor.procurarForn(cpf);
	}
	public Fornecedor procurarEnd(Fornecedor fornecedor){
		return this.controladorEndereco.procurarEnd(fornecedor);
	}
	
	
	public void atualizarForn(String cpf){
		this.controladorFornecedor.atualizarForn(cpf);
	}
	public void atualizarEnd(Fornecedor fornecedor){
		this.controladorEndereco.atualizarEnd(fornecedor);
	}
	
	
	public void removerForn(String cpf){
		this.controladorFornecedor.removerForn(cpf);
	}
	public void removerEnd(Fornecedor fornecedor){
		this.controladorEndereco.removerEnd(fornecedor);
	}
	
	
	public ArrayList<Fornecedor> listarForn(){
		return this.controladorFornecedor.listarForn();
	}
	public ArrayList<Endereco> listarEnd(){
		return this.controladorEndereco.listarEnd();
	}
}
