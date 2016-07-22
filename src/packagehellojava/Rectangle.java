package packagehellojava;

public class Rectangle implements canCompareArea{

	static int edges = 4;
	int w, h;
		
	public int area(){
		return w * h;
	}
	
	public void setWH(int w, int h){
		this.w = w;
		this.h = h;
	}
	
	public void setWH(int w){
		setWH(w, w);
	}
	
	Rectangle(int w, int h){
		setWH(w, h);
	}
	
	Rectangle(int w){
		this(w, w);
	}
	
	public boolean largerThan(Rectangle aRectangle){
		return this.area() > aRectangle.area();
	}
	
	public boolean LargerThan(canCompareArea aShape){
		return this.area()>aShape.area();
	}
}

class Square extends Rectangle{
	Square(int length){
		super(length);
	}
	
	@Override
	public int area(){
		// case-sensitive: public NOT Public
		return super.area();
	}
}