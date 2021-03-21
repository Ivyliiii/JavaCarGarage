package JavaHW;
public class Car {
	private String name;
	private int year;
	private int mileage;
	
	public Car(String name, int year, int mileage) {
		this.name = name;
		this.year = year;
		this.mileage = mileage;
	}
	
	public void drive(int distance) {
		mileage += distance;
	}
	
	public int worth() {
		if (year < 100) {
			return (int)(40000*Math.pow(0.9, year)) * (int)(0.9999*mileage);
		}
		else {
			return 100000;
		}
	}
	
	public int getmileage() {
		return mileage;
	}
	
	public int getyear() {
		return year;
	}
	
	public String getname() {
		return name;
	}

}
