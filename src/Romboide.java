public class Romboide implements FigurasGeometricas{
	private String nombre;
	private double base;
	private double altura;
	public Romboide(String nombre, double base, double altura) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
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
	}//getaltura
	
	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura
	
	@Override
	public String toString() {
		return "Romboide [nombre=" + nombre + ", base=" + base + ", altura=" + altura + ", getNombre()=" + getNombre()
				+ ", getBase()=" + getBase() + ", getAltura()=" + getAltura() + ", toString()=" + super.toString()
				+ "]";
	}//toString
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (getBase() * getAltura());
	}//calcularArea
	
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return ( (getBase() * 2) + (getAltura() * 2) );
	}//calcularPerimetro
	
	
}//class Romboide
