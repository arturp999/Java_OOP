package MobileDevice;


public class MobileDevice {
	
	public String model;
	public String brand;
	public int year; 
	public String serialNumber;
	public CPU cpu;
	
	
	public MobileDevice(String model, String brand, int year, String serialNumber, CPU cpu) {
		this.model = model;
		this.brand = brand;
		this.year = year;
		this.serialNumber = serialNumber;
		this.cpu = cpu;
	}
}
