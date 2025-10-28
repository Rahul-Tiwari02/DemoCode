package Demo;

class Car {

	int price=50000;

	void Start() {
		System.out.println("Car is started");
	}

}

class Tata extends Car {

	int speed = 70;

	void Drive() {
		System.out.println("Car is in driving mode");
	}

}

public class SingleInheritance {

	public static void main(String[] args) {
		Tata Nexon=new Tata();
		Nexon.Start();
		Nexon.Drive();
		
		System.out.println("Nexon speed is " + Nexon.speed);
		System.out.println("Nexon price is " + Nexon.price);

	}

}
