package workshop_2;

public class GUI {

	public static void main(String[] args) {
		
		Registry reg = new Registry();
//		for(int i = 0; i <5; i++){
//			System.out.println("Längd: "+reg.listOfMembers.get(i).getName()+" m");
//			}
//		for(int i = 0; i <5; i++){
//		System.out.println("Båttyp: "+reg.listOfMembers.get(i).getID());
//		}
//		for(int i = 0; i <5; i++){
//			System.out.println("Båttyp: "+reg.listOfMembers.get(i).getSecurityNumber());
//			}
		String[][] temp = reg.compactList();
		for(int i=0;i<5;i++){
			System.out.println(temp[i][0]+","+temp[i][1]+","+temp[i][2]);
		}
	}

}
