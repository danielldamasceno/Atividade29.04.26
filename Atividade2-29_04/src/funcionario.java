	import java.util.Scanner;
	
public class funcionario {
	String nome;
	double salario, salarioNovo;
	
	
	public void getInfo() {
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		while(i == 1) {
		System.out.println("Digite seu nome e seu salário:");
		nome = scan.next();
		salario = scan.nextDouble();
		if(salario > 2000) {
			System.out.println("Salário fora do parâmetro.");
		} else { 
			i = 0;
			}
		
		}
		info(1);
	}
	
	public void info(int i) {
		if (i == 1) {
	System.out.println(nome+" "+salario + "\n");
		} else {
	System.out.println(nome+"\nAntigo salário: " + salario + "\nNovo salario: " + salarioNovo);	
	System.exit(0);
		}
	}
	
	public void calcSal() {
		while (true) {
		if (salario > 1 && salario < 1000) {
			salarioNovo = salario + (salario*0.15);
			info(0);
		} else if(salario < 1500) {
			salarioNovo = salario + (salario*0.10);
			info(0);
			} else {
			salarioNovo = salario + (salario*0.05);
			info(0);
				} 		
		}
	}
}








/*Faça um programa que leia os dados de um funcionário (nome e salário). Em seguida, aplique um aumento com base no salário do funcionário a saber: 
Se o salário do funcionário estiver entre 1 e 1000, aplique um aumento de 15%; 
Se o salário do funcionário estiver entre 1001 e 1500, aplique um aumento de 10%; 
Se o salário do funcionário estiver entre 1501 e 2000, aplique um aumento de 5%. 
Ao final imprima o salário antigo e o atual do funcionário, de acordo com o aumento estabelecido.  */
