package packagehellojava;

public class Oval {
	int a, b;
	
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
	}
}
