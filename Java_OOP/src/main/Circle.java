package main;

public class Circle extends Shape{
	final static int SHAPE_TYPE = 3;
	protected float radius;
	
	
	
	public double CalculateCircleArea(int iRadius) {
		double result = 3.14 * iRadius ;
		return result;
	};
	
	
	public Circle(int iWidth, int iLength, float iRadius) {
		super(iWidth, iLength);
		this.radius = iRadius;
		
	}
	
	@Override
	public String toString() {
		return "The name: " + this.name + "\nThis id: " + this.getUniqueID() + "\nThe radius: " + this.radius + "\nThis shape value:" + Circle.SHAPE_TYPE;
	}


	@Override
	public float CalculateObjectArea() {
		float area = 3.14f * (radius*radius);
		return area;
	}
	

}
