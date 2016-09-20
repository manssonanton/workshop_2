package workshop_2;

public class Boat {
	
	public String typeOfBoat; //Sailboat, Motorsailer, kayak/Canoe, Other 
	public int lengthOfBoat; //Length of boat in cm
	
	public Boat(String typeOfBoat, int lengthOfBoat){
		this.typeOfBoat = typeOfBoat;
		this.lengthOfBoat = lengthOfBoat;
	}
	
	public String getType(){
		return typeOfBoat;
	}
	public int getLength(){
		return lengthOfBoat;
	}
	public void setType(String typeOfBoat){
		this.typeOfBoat = typeOfBoat;
	}
	public void setLength(int lengthOfBoat){
		this.lengthOfBoat = lengthOfBoat;
	}
}
