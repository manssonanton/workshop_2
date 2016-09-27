package workshop_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Registry {


	public List<Member> listOfMembers;
	private static int iD = 5;
	private static int NextValidID = 6;

	public Registry(){
		listOfMembers = loadRegistry();
	}
	public static int getNextValidID() {
		// TODO Auto-generated method stub
		return NextValidID;
	}

	public static boolean containsID(int loadFromFile) {
		if(iD == loadFromFile){
			return true;
		}
		else{
			return false;
		}

	}
	public void deleteMember(){
	}
	public static int numberOfBoats() {
		// TODO Auto-generated method stub
		return 0;
	}
	public List<Member> loadRegistry(){
		List<Member> arr = new ArrayList<Member>();
		String temp[];
		Member tempMember;
		Boat tempBoat;
		String member = "member";
		String boat = "boat_";
		for(int i = 0; i <20; i++){	
			temp = loadFromFile(member, i);
			if(temp != null){
				tempMember =  new Member( Integer.parseInt(temp[0]),temp[1], temp[2]);
				arr.add(tempMember);
				for (int j = 0; j < 3; j++) {
					temp = loadFromFile(boat+(j+1),i);
					if(temp != null){
						tempBoat = new Boat(temp[1],temp[2]);
						tempMember.listOfBoats[j] = tempBoat;
					}
				}
			}	
		}

		return arr;
	}

	public static String[] loadFromFile(String file, int i){
		String temp[] = new String[3];

		try {
			String line = null;
			FileReader fileReader = new FileReader(i+"/"+file+".txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			int innerCounter = 0;
			while((line = bufferedReader.readLine()) != null) {
				innerCounter++;
				if(innerCounter == 1){
					temp[0] = line;
				}
				else if (innerCounter == 2){
					temp[1] = line;
				}
				else if (innerCounter == 3){
					temp[2] = line;
				}  	

			} 
			bufferedReader.close();    
			return temp;
		}
		catch(FileNotFoundException ex) {            
		}
		catch(IOException ex) {
			System.out.println(
					"Error reading file");                  
		}
		return null;

	}
}
