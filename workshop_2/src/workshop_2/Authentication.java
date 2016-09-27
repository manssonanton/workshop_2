package workshop_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


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
				writeMemberToRegistry();
			}
			else{
				throw new Exception();
			}
		} catch (Exception e) {
			System.err.println("Name or Security Number are incorrect.");
		}
	}
	private static boolean correctSecurityNumber(String securityNumber) {
		try{
		if(securityNumber.matches("\\d{6}-\\d{4}")||securityNumber.matches("\\d{8}-\\d{4}")){
			return true;	
		}
		
		else{
			throw new Exception();
		}
	} catch (Exception e) {
		System.err.println("Wrong Security Number");
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
	private static void writeMemberToRegistry() throws FileNotFoundException{
		File dir = new File(iD+"");
		dir.mkdir();
	
		File file = new File(iD+"/member.txt");
		PrintWriter writer= new PrintWriter(file);
		
		writer.println(iD);
		writer.println(name);
		writer.println(securityNumber);
		writer.close();
	}
	

}
