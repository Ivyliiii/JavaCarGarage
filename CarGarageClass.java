package JavaHW;

public class CarGarageClass {
	private Car[] cars;
	private String type;
	
	public CarGarageClass(int n) {
		cars = new Car[n];
	}
	
	public void addCar(int i, String n, int yr, int m) {
		
		cars[i] = new Car(n, yr, m);
		
	}
	
	public double averageMileage() {
		
		double sum = 0, count = 0;
		for(Car c : cars) {
			
			if(c != null) {
				sum += c.getmileage();
				count++;
			}
		}
		return sum / count;
	}
	
	public int totalWorth() {
		int sumWorth = 0;
		for(Car c: cars) {
			if(c != null) {
				sumWorth += c.worth();
			}
		}
		return sumWorth;
	}
	
	public double averageYear() {
		double sum = 0, count = 0;
		for(Car c : cars) {
			if(c != null) {
				sum+= c.getyear();
				count++;
			}
		}
		return sum / count;
	}
	
	public String returnName() {
		String out = "";
		for(Car c: cars) {
			if(c != null) {
				out += c.getname();
				out += "     ";
			}
		}
		return out;
	}

	
	public static void main(String[] args) {
		CarGarageClass garage = new CarGarageClass(30);
		garage.addCar(0, "bestCar", 1, 200);
		garage.addCar(3, "worstCar", 50, 40000);
		System.out.println(garage.averageMileage());
		System.out.println(garage.totalWorth());
		System.out.println(garage.returnName());
		System.out.println(garage.averageYear());
		
	}
	
	
	
}
