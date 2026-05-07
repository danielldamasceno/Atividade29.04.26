import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double[] areas = new double [2];
		
		
		for (int i = 0; i < 2; i++) {
			
			System.out.println("Digite os 3 lados do " + (i+1) +"º triangulo (Separado por espaço): ");
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			double z = scan.nextDouble();
			
			calc calc = new calc(x, y ,z);
			areas[i] = calc.calcArea();	
		}
		
		calc.bigTri(areas[0], areas[1]);
		scan.close();
			
			
	}
}







/*3 – Crie um programa para ler as medidas dos lados de dois triângulos X e Y. Em seguida, apresente o valor das áreas dos dois triângulos e informe qual dos triângulos possui a maior área. 

A fórmula para calcular a área do triângulo a partir das medidas de seus lados "a", "b" e "c" é a seguinte (fórmula de Heron): 
*/