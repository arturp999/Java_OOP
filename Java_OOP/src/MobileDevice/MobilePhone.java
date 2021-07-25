package MobileDevice;

import java.util.Scanner;

public class MobilePhone extends MobileDevice {
		
	Network network;
	MobileProvider provider;
	
	
	public enum MobileProvider{
		MEO,VODAFONE,NOS
	}
		
	

	public MobilePhone(String model, String brand, int year, String serialNumber, CPU cpu, MobileProvider provider, Network network) {
		super(model, brand, year, serialNumber, cpu);
		this.network = network;
		this.provider = provider;
	}
	

	
	public enum Network {
		network3G("3G"), network4G("4G"), network5G("5G");
		private String typeNetwork;
		
		private Network(String typeNetwork) {
			this.typeNetwork = typeNetwork;
		}
		
		public String getNetwork() {
			return typeNetwork;
		}
	}
	

	@Override
	public String toString() {
		return "MobilePhone model: " + model +
				"\nBrand: " + brand +
				"\nYear:" + year + 
				"\nSerial Number: " + serialNumber +
				"\nCPU: " + cpu + 
				"\nProvider: "  + provider +
				"\nNetwork: " + network + "\n";
	}
	
	
	
	

}
