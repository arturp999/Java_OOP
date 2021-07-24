package main;

import java.util.UUID;

public abstract class Shape {

	public String name;
	protected int width, length;
	private String uniqueID;
	
	final static int SHAPE_TYPE = 1;
	
	
	public Shape(int iWidth, int iLength){
		this.uniqueID = UUID.randomUUID().toString();
		this.width = iWidth;
		this.length = iLength;
	}
	
	public abstract float CalculateArea();

		
	public String getUniqueID() {
		return uniqueID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static int getShape() {
		return SHAPE_TYPE;
	}
	
	@Override
	public String toString() {		
		return "The name is: " + this.name + "\nId is: " + this.uniqueID+  "\nThe width is: " +  this.width + "\nThe length is: " +  this.length + "\nThis shape value:" + Shape.SHAPE_TYPE;
	}

}
