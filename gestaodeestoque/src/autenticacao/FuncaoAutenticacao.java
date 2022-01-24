package autenticacao;

public class FuncaoAutenticacao {
	
	private ConcederAcessoEstoque concederAcessoEstoque;
	
	public boolean autenticarAcesso() {
		return concederAcessoEstoque.Autenticar();
	}
	
	public FuncaoAutenticacao (ConcederAcessoEstoque acesso) {
		this.concederAcessoEstoque = acesso;
	}

}
