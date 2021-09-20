
public class Person {
	private Vehicle vehicle;
	public Person(Vehicle v) {
		vehicle = v;
	}
	public void setDrive(Vehicle v) {
		vehicle = v;
	}
	public void drive() {
		vehicle.drive();
	}
}
