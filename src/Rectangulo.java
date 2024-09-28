
public class Rectangulo implements FigurasGeometricas{
	private String nombre;
	private double base;
	private double altura;
	private double lado;
	public Rectangulo(String nombre, double base, double altura, double lado) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}//constructor
	
	public String getNombre() {
		return nombre;
	}//getNombre
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	
	public double getBase() {
		return base;
	}//getBase
	
	public void setBase(double base) {
		this.base = base;
	}//setBase
	
	public double getAltura() {
		return altura;
	}//getAltura
	
	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura
	
	public double getLado() {
		return lado;
	}//getLado
	
	public void setLado(double lado) {
		this.lado = lado;
	}//setLado	
	
	@Override
	public String toString() {
		return "Rectangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + ", lado=" + lado
				+ ", getNombre()=" + getNombre() + ", getBase()=" + getBase() + ", getAltura()=" + getAltura()
				+ ", getLado()=" + getLado() + ", calcularArea()=" + calcularArea() + ", calcularPerimetro()="
				+ calcularPerimetro() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (getBase() * getAltura());
	}
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return (getLado() + getLado() + getLado() + getLado());
	}	
}//class Rectangulo
