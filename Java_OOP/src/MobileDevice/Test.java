package MobileDevice;

public class Test {
	public String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Test(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Test [model=" + model + "]";
	}
	

}
