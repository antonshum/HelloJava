package packagehellojava;

public class Program_oval {

	public static void main(String[] args) {
		Oval e1 = new Oval();
		e1.setAB(3, 10);
		System.out.println("e1��a, b�Ȥ��O�N�����b���u�b�q��ߦܶ�P���Z���C");
		System.out.println("e1�����n: "+e1.area_oval());
		System.out.println("e1���P���]����ȡ^: "+e1.perimeter_oval());
	}
}