
public class Quadrado extends FormaGeometrica{
	
	public double calcArea() {
		return Math.pow(getLado1(), 2);
	}
	
	public double calcPerimetro() {
		return 4 * getLado1();
	}

}
