
public class Main {
	public static void main(String[] args) {
		System.out.println("*************Triangulo******************");
		Triangulo t1 = new Triangulo("Bermudas", 20, 10, 15);
		Triangulo t = new Triangulo("T", 87, 121, 110);
		imprimirCalculo(t1);
		imprimirCalculo(t);
		
		System.out.println("*************Cuadrado******************");
		Cuadrado cuadrado1 = new Cuadrado("Cuadrado", 8);
		imprimirCalculo(cuadrado1);
		
		System.out.println("*************Rectangulo******************");
		Rectangulo rectangulo1 = new Rectangulo("Rectangulo", 8, 8, 5);
		imprimirCalculo(rectangulo1);
		
		System.out.println("*************Rombo******************");
		Rombo rombo1 = new Rombo("Rombo", 8, 8, 5);
		imprimirCalculo(rombo1);
		
		System.out.println("*************Romboide******************");
		Romboide romboide1 = new Romboide("Romboide", 8, 8);
		imprimirCalculo(romboide1);
		
		System.out.println("*************Trapecio******************");
		Trapecio trapecio1 = new Trapecio("Trapecio", 8, 8, 5, 8, 5, 3, 4);
		imprimirCalculo(trapecio1);		
	}//main
	
	public static void imprimirCalculo(FigurasGeometricas t) {
		System.out.println(t);
		System.out.println("+-----------------------------------");
		System.out.println("El área de [" + t.getNombre() + "] es: " + t.calcularArea());
		System.out.println("El perimetro de [" + t.getNombre() + "] es: " + t.calcularPerimetro());
		System.out.println("+-----------------------------------");
	}//imprimirCalculo
}//class Main
