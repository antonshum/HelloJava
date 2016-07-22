package packagehellojava;

public class Program15 {

	public static void main(String argv[]) {
		Rectangle r1 = new Rectangle(5, 10);
		Rectangle r2 = new Rectangle(10, 16);
		Square s1 = new Square(10);
		System.out.println("r1比r2大: "+ r1.largerThan(r2));
		System.out.println("r2比s1大: "+ r2.largerThan(s1));
		System.out.println("s1比r1大: "+ s1.largerThan(r1));
	}
}
