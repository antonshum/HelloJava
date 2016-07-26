package packagehellojava;

public class Oval {
	int a, b, x, y;
	
	public double area_oval(){
		//Source: https://www.math.hmc.edu/funfacts/ffiles/10006.3.shtml
		return a * b * Math.PI;
	}
	
	public double perimeter_oval(){
		//Source: https://www.mathsisfun.com/geometry/ellipse-perimeter.html
		return Math.abs(((3*(a + b)) - Math.sqrt((3*a + b) * (a + 3*b)) *Math.PI));
	}
	
	public void setAB(int a, int b){
		this.a = a;
		this.b = b;
		this.x = 0;
		this.y = 0;
	}
	
	Oval(int a, int b){
		setAB(a, b);
	}
	
	Oval(int a){
		this(a, a);
	}
}

class Circle extends Oval{
	Circle(int radius){
		super(radius);
	}
	
	public double area_circle(){
		return Math.pow(a, 2) * Math.PI;
	}
	
	public double perimeter_circle(){
		return 2 * a * Math.PI;
	}
}