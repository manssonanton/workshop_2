package workshop_2;

public class Authentication {
	private static String name;
	private static int iD;			
	private static String securityNumber;

	public Authentication(int iD){
		validateID(iD);		
	}
	public boolean validateID(int iD){
		System.out.println(iD);
		if(Registry.containsID(iD)){
			System.out.println("ID exist");
			return true;
		}
		else{
			System.out.println("ID does not exist");
			return false;
		}
	}
	public static void createMember(String inputName, String inputSecurityNumber){
		iD = Registry.getNextValidID();
		try {
			if(correctName(inputName)&&correctSecurityNumber(inputSecurityNumber)){
				name = inputName;
				securityNumber = inputSecurityNumber;
				System.out.println("Name: "+name+", Security Number: "+securityNumber+", ID: "+iD);
				//TODO Write Member to File.
			}
			else{
				throw new Exception();
			}
		} catch (Exception e) {
			System.err.println("Name or Security Number are incorrect.");
		}
	}
	private static boolean correctSecurityNumber(String securityNumber) {
		if(securityNumber.matches("\\d{6}-\\d{4}")||securityNumber.matches("\\d{8}-\\d{4}")){
			return true;	
		}
		else{
			System.out.println("Wrong Security Number");
			return false;
		}
	}
	private static Boolean correctName(String name) {
		if( name.matches("[a-zA-Z ]+") && name.length()<30){
			return true;	
		}
		else{
			System.out.println("Wrong Name");
			return false;
		}
	}
	

}
