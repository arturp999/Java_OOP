package main;

public class Rectangle extends Shape{

	final static int SHAPE_TYPE = 2;
	
	
	public Rectangle(int iWidth, int iLength) {
		super(iWidth, iLength);
		// TODO Auto-generated constructor stub
	}


	@Override
	public float CalculateObjectArea() {
		float area = width * length;
		return area;
	}

}
