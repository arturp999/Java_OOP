package main;

public class Main {
	
	public int length;
	public int width;
	
	public static int CalculateP(int iLength, int iWidth) {
		int result = iLength * iWidth;
		
		return result;
	}
	
	
	public static void main(String[] args) {
		
		
//		for(int i = 0 ; i < 7; i++) {
//			System.out.println("sup"); //sysout ctrl + space
//		}
//		int i = 0;
//		while (i < 5) {
//		  System.out.println(i);
//		  i++;
//		}
//		
//		do {
//		  System.out.println(i);
//		  i++;
//		}
//		while (i < 5);
		
		
		Circle c = new Circle(10,15,15);
		c.setName("Circle");
		System.out.println(c.toString());
		System.out.println("This is the circle area: " + c.CalculateCircleArea(15));
		
		System.out.println(c.CalculateArea());
		
		
		//System.out.println(CalculateP(15, 20));
	}

}
