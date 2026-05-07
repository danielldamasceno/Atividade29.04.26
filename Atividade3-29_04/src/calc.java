
public class calc {
	double x, y, z, area, p, area0;
	
	public calc (double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double calcArea() {
		
		p = (x+y+z)/2;
		area = Math.sqrt((p * (p-x) * (p-y) * (p-z)));
		return area;
	}

	
	public static void bigTri (double a, double b) {
		System.out.println("Área do 1º triangulo: "+ a + "Área do 2º triangulo:" + b);
		if (a > b) {
			System.out.println("Area do 1º triangulo é maior");
		} else {
			System.out.println("Area do 2º triangulo é maior");
			}
	}
}







/*3 – Crie um programa para ler as medidas dos lados de dois triângulos X e Y. Em seguida, apresente o valor das áreas dos dois triângulos e informe qual dos triângulos possui a maior área. 

A fórmula para calcular a área do triângulo a partir das medidas de seus lados "a", "b" e "c" é a seguinte (fórmula de Heron): 
*/