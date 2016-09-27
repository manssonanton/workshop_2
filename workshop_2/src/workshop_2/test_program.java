package workshop_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class test_program {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		try {
		
		String line = null;
        FileReader fileReader = new FileReader("testfolder/member.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int i = 0;
        while((line = bufferedReader.readLine()) != null) {
            i++;
        	if(i == 1){
            System.out.println("ID: "+line);
        	}
        	else if (i == 3){
        		System.out.println("Name: "+line);
        	}
        	else if (i == 5){
        		System.out.println("Securitynumber: "+line);
        	}  	
        } 
       
        bufferedReader.close();       
		}
		 catch(FileNotFoundException ex) {
	            System.out.println(
	                "Unable to open file ");                
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error reading file");                  
	        }
	}
}