package workshop_2;

public class GUI {

	public static void main(String[] args) {

		Authentication.createMember("Mikael Anderssondjkasdjksa","19921221-5298");
		Member test = new Member(6,"Pelle","19921221-5298");
		test.addBoat("Sailboat", "55.5");
		test.addBoat("Dingy", "80");
		test.addBoat("Submarine", "60");
		test.manageBoat(3,"Sub","50");
		Registry reg = new Registry();
		System.out.println(reg.listOfMembers.get(1).listOfBoats[1].getLength());
		
	}

}
