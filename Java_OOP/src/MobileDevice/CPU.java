package MobileDevice;

public class CPU {
	
	public int cores;
	public int bits;
	public int speed;
	
	public CPU(int iCores, int iBits, int iSpeed) {
		this.cores = iCores;
		this.bits = iBits;
		this.speed = iSpeed;
	}

	@Override
	public String toString() {
		return "CPU [cores=" + cores + ", bits=" + bits + ", speed=" + speed + "]";
	}


	
	
}
