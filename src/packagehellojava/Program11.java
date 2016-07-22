package packagehellojava;

public class Program11 {

	public static void main(String argv[]) {
		Square s1 = new Square(12);	
		System.out.println("s1的面積: "+s1.area());
		System.out.println("方形的邊數: "+ Square.edges);
	}
}
