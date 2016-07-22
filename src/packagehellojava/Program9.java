package packagehellojava;

public class Program9 {

	public static void main(String argv[]) {
		Rectangle r1 = new Rectangle(7);
		Rectangle r2 = new Rectangle(21, 6);		
		System.out.println("r1的邊數: "+r1.edges);
		r1.edges = 5;
		System.out.println("r2的邊數: "+r2.edges);
		System.out.println("矩形的邊數: "+Rectangle.edges);
	}
}
