package packagehellojava;

public class Bread {
	int w, h;
	
	public int area(){
		return w * h;
	}
}
class Toast extends Bread implements canCompareArea{
	int length;
	public Toast(int length){
		this.length=length;
	}
	public int area(){
		return length*length;
	}
}
interface canCompareArea{
	public int area();
}