
public class Client {

	public static void main(String[] args) {
		Vehicle v = new Boat();
	
		Person p = new Person(v);
		v = new Rocket();
		p.setDrive(v);
		p.drive();

	}

}
