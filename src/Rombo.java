
public class Rombo implements FigurasGeometricas{
	private String nombre;
	private double lado;
	private double diagMenor;
	private double diagMayor;
	
	public Rombo(String nombre, double lado, double diagMenor, double diagMayor) {
		super();
		this.nombre = nombre;
		this.lado = lado;
		this.diagMenor = diagMenor;
		this.diagMayor = diagMayor;
	}//constructor

	public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public double getLado() {
		return lado;
	}//getLado

	public void setLado(double lado) {
		this.lado = lado;
	}//setLado

	public double getDiagMenor() {
		return diagMenor;
	}//getDiagMenor

	public void setDiagMenor(double diagMenor) {
		this.diagMenor = diagMenor;
	}//setDiagMenor

	public double getDiagMayor() {
		return diagMayor;
	}//getDiagMayor

	public void setDiagMayor(double diagMayor) {
		this.diagMayor = diagMayor;
	}//setDiagMayor

	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", lado=" + lado + ", diagMenor=" + diagMenor + ", diagMayor=" + diagMayor
				+ ", getNombre()=" + getNombre() + ", getLado()=" + getLado() + ", getDiagMenor()=" + getDiagMenor()
				+ ", getDiagMayor()=" + getDiagMayor() + ", toString()=" + super.toString() + "]";
	}//toString

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (getDiagMayor() * getDiagMenor())/ 2;
	}//calcularArea

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return (getLado() + getLado() + getLado() + getLado());
	}//calcularPerimetro
	
	
	
}
