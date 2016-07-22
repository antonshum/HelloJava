package packagehellojava;

public class Program2 {

	public static void main(String argv[]) {
		Rectangle r1=new Rectangle();
		r1.w = 35;
		r1.h = 4;
		System.out.println("r1的面積: "+r1.area());
		
		Rectangle r2 = r1;
		r2.w = 6;
		System.out.println("r1的面積: "+r1.area());
		
		Rectangle r3=new Rectangle();
		r3.w = r1.h;
		r3.h = r2.w;
		System.out.println("r3的面積: "+r3.area());
	}

}