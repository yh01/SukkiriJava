package high.extend;

public class Wand {
	private String name;
	private double power;
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		if(power == 0.0){
			throw new IllegalArgumentException();
		}
		if(power <= 0.5){
			throw new IllegalArgumentException();
		}
		if(power >= 100.0){
			throw new IllegalArgumentException();
		}
		this.power = power;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null){
			throw new IllegalArgumentException();
		}
		this.name = name;
	}
}
