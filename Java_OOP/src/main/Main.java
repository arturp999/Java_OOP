package main;

import java.sql.Date;

import MobileDevice.CPU;
import MobileDevice.MobilePhone;
import MobileDevice.MobilePhone.Network;
import MobileDevice.MobilePhone.MobileProvider;


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
		
		
//		Circle c = new Circle(10,15,15);
//		c.setName("Circle");
//		System.out.println(c.toString());
//		System.out.println("This is the circle area: " + c.CalculateCircleArea(15));
//		System.out.println(c.CalculateObjectArea());
//		
		
	
		MobilePhone mobile = new MobilePhone("S8+", "Samsung", 2006 , "#4563", new CPU(16,8,3600), MobileProvider.MEO, Network.network3G);
		System.out.println(mobile);
		
		
	}

}
