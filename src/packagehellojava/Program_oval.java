package packagehellojava;

public class Program_oval {

	public static void main(String[] args) {
		Oval e1 = new Oval();
		e1.setAB(3, 10);
		System.out.println("e1的a, b值分別代表其長軸／短軸從圓心至圓周的距離。");
		System.out.println("e1的面積: "+e1.area_oval());
		System.out.println("e1的周長（估算值）: "+e1.perimeter_oval());
	}
}