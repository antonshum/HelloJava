package packagehellojava;

public class Program9 {

	public static void main(String argv[]) {
		Rectangle r1 = new Rectangle(7);
		Rectangle r2 = new Rectangle(21, 6);		
		System.out.println("r1�����: "+r1.edges);
		r1.edges = 5;
		System.out.println("r2�����: "+r2.edges);
		System.out.println("�x�Ϊ����: "+Rectangle.edges);
	}
}
