package main;

import java.sql.Date;
import java.util.Iterator;
import java.util.Scanner;

import MobileDevice.CPU;
import MobileDevice.MobilePhone;
import MobileDevice.MobilePhone.Network;
import MobileDevice.Tablet;
import MobileDevice.Test;
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
		
		
		Circle c = new Circle(10,15,15);
		c.setName("Circle");
		System.out.println(c.toString());
		System.out.println("This is the circle area: " + c.CalculateCircleArea(15));
		System.out.println(c.CalculateObjectArea());
		
		
		MobilePhone mobile = new MobilePhone("S8+", "Samsung", 2006 , "#4563", new CPU(16,8,3600), MobileProvider.MEO, Network.network3G);
		System.out.println(mobile);
		
		Tablet tablet = new Tablet("Tab E", "Samsung", 2001, "#1234", new CPU(8,4,2600),false);
		System.out.println(tablet);
		
		

	
		//Creating an obj from user input
		Scanner obj = new Scanner(System.in);
		
		String model, brand, serialNumber,input;
		int year,cores,speed,bits,inputProvider,inputNetwork;
		boolean penSupport;
		MobileProvider MP = null;
		Network NT = null;
		
		
		
	
		System.out.println("Would you like to add a Phone or a Tablet?");
		do {
			input = obj.next();
			
			if(input.equals("Phone") || input.equals("Tablet") ) {
				
				System.out.println("Enter the Model"); 
				model = obj.next();

				System.out.println("Enter the Brand"); 
				brand = obj.next();
				
				System.out.println("Enter Release Year "); 
				year = obj.nextInt();		
				obj.nextLine();
				
				System.out.println("Enter the Serial Number"); 
				serialNumber = obj.nextLine();
				
				//CPU
				System.out.println("Enter CPU Speed"); 
				speed = obj.nextInt();
				System.out.println("How many Cores"); 
				bits = obj.nextInt();
				System.out.println("How many Bits"); 
				cores = obj.nextInt();
				
				if(input.equals("Phone")) {
					System.out.println("What is the Provider? 1: MEO, 2:VODAFONE, 3:NOS");
					inputProvider = obj.nextInt();
					
					if(inputProvider == 1) {
						MP = MobileProvider.MEO ;
					} else if(inputProvider == 2) {
						MP = MobileProvider.VODAFONE;
					} else if(inputProvider == 3) {
						MP = MobileProvider.NOS;
					}
					
					System.out.println("What is the Provider? 1: 3G, 2:4G, 3:5G");
					inputNetwork = obj.nextInt();
					
					if(inputNetwork == 1) {
						NT = Network.network3G ;
					} else if(inputNetwork == 2) {
						NT = Network.network4G ;
					} else if(inputNetwork == 3) {
						NT = Network.network5G ;
					}
					
					MobilePhone Minput = new MobilePhone(model, brand, year , serialNumber, new CPU(speed,bits,cores), MP, NT);
					System.out.println(Minput);
					break;
				} else {
					System.out.println("Does the Tablet support a PEN? true or false");
					penSupport = obj.nextBoolean();
					Tablet tab = new Tablet(model, brand, year , serialNumber, new CPU(speed,bits,cores),penSupport);
					System.out.println(tab);
				}
				
			} else {
				System.out.println("\nThats not a valid input\nSelect Phone or Tablet");
			}
			
		} while (!input.equals("Phone") || !input.equals("Tablet"));
		
//		
//		for (int i = 0; i < 5; i++) {
//			
//		}
//		
//		
//		
		
	}

}
