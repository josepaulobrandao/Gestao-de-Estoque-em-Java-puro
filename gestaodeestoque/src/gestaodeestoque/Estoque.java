package gestaodeestoque;

import java.util.ArrayList;
import java.util.List;

import autenticacao.ConcederAcessoEstoque;

public class Estoque implements ConcederAcessoEstoque {
	private Integer saldo;
	
	private DescricaoProduto descricaoProduto;
	
	private List<DescricaoProduto> descricaoItem = new ArrayList<DescricaoProduto>();

	private String login;

	private String senha;

	
	public List<DescricaoProduto> getDescricaoItem() {
		return descricaoItem;
	}
	public void setDescricaoItem(List<DescricaoProduto> descricaoItem) {
		this.descricaoItem = descricaoItem;
	}
	public Estoque(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	public Estoque(Integer saldo) {
		this.saldo = saldo;
	}
	
	public Estoque() {

	}
	public Integer getSaldo() {
		return saldo;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}

	public DescricaoProduto getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(DescricaoProduto descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	
	public void transferMais (Integer quantidadeEntrada) {
		this.saldo += quantidadeEntrada;
	}
	
	public void transferMenos(Integer quantidadeSaida) {
		this.saldo -= quantidadeSaida;
	}
	@Override
	public String toString() {
		return "########### Estoque Geral ###########"
				+ "\n saldo total: " + saldo + "" 
				+ "\n descricaoItem: " + descricaoItem  + "";
		
	}
	
	@Override
	public boolean Autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return Autenticar();
	}
	
	public boolean Autenticar() {
		return login.equals("admin") && senha.equals("admin");
	}

	
	
	
}	
