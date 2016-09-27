package workshop_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Member {
	private  String name;
	private  int iD;									
	private  String securityNumber;					// YYYYMMDD-xxxx or YYMMDD-xxxx
	public  Boat[] listOfBoats = new Boat[5]; // Limits number of boats to 5 per member.
	public int numberOfBoats;

	public Member( int inputID, String inputName, String inputSecurityNumber){
		name = inputName;
		iD = inputID;
		securityNumber = inputSecurityNumber;
		numberOfBoats = Registry.numberOfBoats();
	}

	public String getName(){
		return name;
	}
	public int getID(){
		return iD;
	}
	public String getSecurityNumber(){
		return securityNumber;
	}

	public void setName(String nameChange){
		name = nameChange;
	}
	public void setID(int idChange){
		iD = idChange;
	}
	public void setSecurityNumber(String securityNumberChange){
		securityNumber = securityNumberChange;
	}
	public void addBoat(String inputType, String inputLength){
		try {
			if(correctLength(inputLength)){
				listOfBoats[numberOfBoats] = new Boat(inputType, inputLength);
				//TODO numberOfBoats = Registry.numberOfBoats();
				numberOfBoats+=1;
				writeBoatToRegistry(numberOfBoats,inputType,inputLength);
			}
			else{
				throw new Exception();
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	public void manageBoat(int boatID, String inputType, String inputLength){

		try {
			if(correctLength(inputLength) && boatID<=numberOfBoats && boatID>=1){
				if(!inputType.equals(listOfBoats[boatID-1].typeOfBoat)){
					listOfBoats[boatID-1].setType(inputType);
				}
				if(!inputLength.equals(listOfBoats[boatID-1].lengthOfBoat)){
					listOfBoats[boatID-1].setLength(inputLength);
				}
				writeBoatToRegistry(boatID, listOfBoats[boatID-1].getType(),listOfBoats[boatID-1].getLength());
			}
			else{
				System.out.println("Error");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static Boolean correctLength(String input) {
		try{
			if( input.matches("[0-9 . ,]+")){
				return true;	
			}
			else{
				throw new Exception();
			}	
		}catch (Exception e) {
			System.err.println("Not acceptable length!");
			return false;
		}

	}
	private void writeBoatToRegistry(int numberOfBoats,String inputType, String inputLength) throws FileNotFoundException{
		File file = new File(iD+"/boat_"+numberOfBoats+".txt");
		PrintWriter writer= new PrintWriter(file);

		writer.println(numberOfBoats);
		writer.println(inputType);
		writer.println(inputLength);
		writer.close();
	}


}
