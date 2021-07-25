package MobileDevice;

public class MobileDevice implements Comparable<MobileDevice> {
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


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getSerialNumber() {
		return serialNumber;
	}


	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}


	public CPU getCpu() {
		return cpu;
	}


	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}


	@Override 	//https://dzone.com/articles/how-to-sort-objects-in-java
	public int compareTo(MobileDevice compareDevices) {
		 return  (this.getYear() < ((MobileDevice) compareDevices).getYear() ? -1 : (this.getYear() == ((MobileDevice) compareDevices).getYear() ? 0 : 1)); // fml
	}


}
