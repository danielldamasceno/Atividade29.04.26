
public class App1 {
	
	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		estoque.adicionarEstoque();
		
		while(true) {
		System.out.println("\nDigite:\n1 - Ver produto no estoque.\n2 - Fazer modificação no estoque.\n3 - Sair.");
		switch (estoque.loop()) {
			case 1:
				estoque.quantidadeEstoque();
				break;
			case 2:
				System.out.println("\nDigite:\n1 - Adicionar ao estoque.\n2 - Retirar do estoque.");
				if (estoque.loop() == 1) {
					estoque.adicionarEstoque();
				} else {
					estoque.retirarEstoque();
				}
			    break;
			case 3:
				System.exit(0);
				break;
		}	
		
		}
	}

}
