package workshop_2;

public class GUI {

	public static void main(String[] args) {
		Registry reg = new Registry();
	//	Authentication.createMember("Mikael Andersson","19921221-5298");
		Member test = new Member("Pelle",8,"19921221-5298");
		test.addBoat("Sailboat", "55.5");
		
	}

}
