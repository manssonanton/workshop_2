package workshop_2;

public class GUI {

	public static void main(String[] args) {
		Registry reg = new Registry();
		for(int i = 0; i <5; i++){
			System.out.println("L�ngd: "+reg.listOfMembers.get(i).listOfBoats[0].getLength()+" m");
			}
		for(int i = 0; i <5; i++){
		System.out.println("B�ttyp: "+reg.listOfMembers.get(i).listOfBoats[0].getType());
		}
	}

}
