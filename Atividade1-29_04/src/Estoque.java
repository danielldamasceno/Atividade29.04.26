	import java.util.Scanner;
	
	
public class Estoque {
	
	String nomeProduto;
	double preço;
	int quantidade;
	
	public void quantidadeEstoque() {
		System.out.println("\nProduto: "+ nomeProduto + "\nPreço: "+ preço + "\nQuantidade em estoque: "+ quantidade);
		}
	
	public void adicionarEstoque() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        nomeProduto = scanner.next();
        System.out.print("Digite o preço: ");
        preço = scanner.nextDouble();
        System.out.print("Digite a quantidade: ");
        quantidade = scanner.nextInt();
        scanner.nextLine();
        quantidadeEstoque();
        
		}
	
	public void retirarEstoque() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Produto: " + nomeProduto);
        System.out.print("\nDigite o quanto quer retirar: ");
        int qtdTemp = scanner.nextInt();
        scanner.nextLine();
        if (qtdTemp > quantidade) {
        	 System.out.print("Entrada inválida!\n");
        	 retirarEstoque();
        } else {
        	quantidade = (quantidade - qtdTemp);
        }
        quantidadeEstoque();
		}
	
	public int loop() {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
			return i;
		} 
	
	}
		
