package MobileDevice;

public class Tablet extends MobileDevice{
	
	public boolean suportsPen;

	public Tablet(String model, String brand, int year, String serialNumber, CPU cpu, boolean suportsPen) {
		super(model, brand, year, serialNumber, cpu);
		this.suportsPen = suportsPen;
	}

	
	
	
	@Override
	public String toString() {
		return "Tablet model: " + model +
				"\nBrand: " + brand +
				"\nYear:" + year + 
				"\nSerial Number: " + serialNumber +
				"\nCPU: " + cpu + 
				"\nSuports Pen: "  + suportsPen +
				"\n";
	}
	
	
	
	
	
	
}
