package workshop_2;

public class Authentication {
	private String name;
	private int iD=1;			// TEMPORARY
	private int securityNumber;
	
	public Authentication(int iD){
		if(validateID(iD)){
			
		}
		else{
			createMember();
		}
	}
	public boolean validateID(int iD){
		if(securityNumber==9){
			return Registry.containsID(iD);
		}
		return false;
	}
	public void createMember(){
		iD = Registry.getNextValidID();
	}
	public void celeteMember(){
	}
	private String setName(){
		return name;
		
		
	}
}
