package workshop_2;

public class GUI {

	public static void main(String[] args) {

		Registry reg = new Registry();
		//		for(int i = 0; i <5; i++){
		//			System.out.println("Längd: "+reg.listOfMembers.get(i).getName());
		//		}
		//		for(int i = 0; i <5; i++){
		//			System.out.println("Båttyp: "+reg.listOfMembers.get(i).getID());
		//		}
		//				for(int i = 0; i <5; i++){
		//					System.out.println("Båttyp: "+reg.listOfMembers.get(i).getSecurityNumber());
		//					}
		//				String[][] temp = reg.compactList();
		//				for(int i=0;i<temp.length;i++){
		//					System.out.println(temp[i][0]+","+temp[i][1]+","+temp[i][2]);
		//				}
		String[][] temp = reg.containsSecurityNumber("19921221-52");
		for(int i=0;i<temp.length;i++){
			for (int j = 0; j < 13; j++) {
				if(temp[i][j]!=null){
					System.out.println(temp[i][j]);
				}
			}
				System.out.println("*----*");
		}
//		String[][] temp1 = reg.getVerboseList();
//		for(int i=0;i<temp1.length;i++){
//			for (int j = 0; j < 13; j++) {
//				if(temp1[i][j]!=null){
//					System.out.println(temp1[i][j]);
//				}
//			}
//				System.out.println("*----*");
//		}
	}
}
