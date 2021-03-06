package executavel;

import javax.swing.JOptionPane;

import autenticacao.FuncaoAutenticacao;
import gestaodeestoque.DescricaoProduto;
import gestaodeestoque.Estoque;

public class Programa {
	public static void main(String[] args) {
		
		Estoque estoque = new Estoque();
		
		
		String login = JOptionPane.showInputDialog("Entre com o login: ");
		String senha = JOptionPane.showInputDialog("Entre com a senha: ");

		
		if (new FuncaoAutenticacao(new Estoque(login, senha)).autenticarAcesso()) {
			String operacao = JOptionPane.showInputDialog(null, "\n Olá, o que deseja fazer ?"
					+ "											 \n Digite 1 para adicionar um ou mais itens do estoque"
					+ "											 \n Digite 0 para remover um ou mais itens do estoque"
					+ "											 \n ");
			
			estoque.setSaldo(500);
		int processamento = 0;
		while (processamento < 1) {

			if (Integer.valueOf(operacao) == 1) {

				String inserirProdutos = JOptionPane.showInputDialog("Quantos itens deseja inserir ? ");
				if (Integer.valueOf(inserirProdutos) > 1) {
					int contador = 0;
					while (contador < Integer.valueOf(inserirProdutos)) {

						String nomeProduto = JOptionPane.showInputDialog("Nome do Produto: ");
						String IdItem = JOptionPane.showInputDialog("Id item: ");

						DescricaoProduto descricaoProduto = new DescricaoProduto();

						descricaoProduto.setNome(nomeProduto);
						descricaoProduto.setId((Integer.valueOf(IdItem)));
						estoque.getDescricaoItem().add(descricaoProduto);
						contador += 1;
					}

				}
				estoque.transferMais(Integer.valueOf(inserirProdutos));

			}

			else if (Integer.valueOf(operacao) == 0) {

				String removerProdutos = JOptionPane.showInputDialog("Quantos itens deseja remover ? ");
				if (Integer.valueOf(removerProdutos) > 1) {
					int contador = 0;
					while (contador < Integer.valueOf(removerProdutos)) {

						String nomeProduto = JOptionPane.showInputDialog("Nome do Produto: ");
						String IdItem = JOptionPane.showInputDialog("Id item: ");

						DescricaoProduto descricaoProduto = new DescricaoProduto();

						descricaoProduto.setNome(nomeProduto);
						descricaoProduto.setId((Integer.valueOf(IdItem)));
						estoque.getDescricaoItem().add(descricaoProduto);
						contador += 1;
					}
					
				}
				
				estoque.transferMenos(Integer.valueOf(removerProdutos));
			}
			
			int continuarOperacao = JOptionPane.showConfirmDialog(null, "Voce deseja realizar uma nova operação ?");
			if (continuarOperacao == 0) {
				String novaOperacao = JOptionPane.showInputDialog(null, "\n Olá, o que deseja fazer ?"
						+ "												 \n Digite 1 para adicionar um ou mais itens do estoque"
						+ "											 	 \n Digite 0 para remover um ou mais itens do estoque"
						+ "											 	 \n ");
				
				
				
				if (Integer.valueOf(operacao) == 1) {

					String inserirProdutos = JOptionPane.showInputDialog("Quantos itens deseja inserir ? ");
					if (Integer.valueOf(inserirProdutos) > 1) {
						int contador = 0;
						while (contador < Integer.valueOf(inserirProdutos)) {

							String nomeProduto = JOptionPane.showInputDialog("Nome do Produto: ");
							String IdItem = JOptionPane.showInputDialog("Id item: ");

							DescricaoProduto descricaoProduto = new DescricaoProduto();

							descricaoProduto.setNome(nomeProduto);
							descricaoProduto.setId((Integer.valueOf(IdItem)));
							estoque.getDescricaoItem().add(descricaoProduto);
							contador += 1;
						}

					}
					estoque.transferMais(Integer.valueOf(inserirProdutos));

				}

				else if (Integer.valueOf(operacao) == 0) {

					String removerProdutos = JOptionPane.showInputDialog("Quantos itens deseja remover ? ");
					if (Integer.valueOf(removerProdutos) > 1) {
						int contador = 0;
						while (contador < Integer.valueOf(removerProdutos)) {

							String nomeProduto = JOptionPane.showInputDialog("Nome do Produto: ");
							String IdItem = JOptionPane.showInputDialog("Id item: ");

							DescricaoProduto descricaoProduto = new DescricaoProduto();

							descricaoProduto.setNome(nomeProduto);
							descricaoProduto.setId((Integer.valueOf(IdItem)));
							estoque.getDescricaoItem().add(descricaoProduto);
							contador += 1;

						}

					}
					estoque.transferMenos(Integer.valueOf(removerProdutos));

				}

			}
			
			
			int desejaSair = JOptionPane.showConfirmDialog(null, "Deseja sair ? ");
			if (desejaSair != 0) {
				break;
			}
			
			processamento += 1;
		 }
		
		}else
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		
		System.out.println(estoque.toString());
	}

}
