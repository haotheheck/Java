package cs380;


import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

public class lab02 {

public static void main(String[] args) {

	//User input to find file 
	Scanner sc = new Scanner(System.in);
	//finding the oringinal file
	//creating a new file if exist
	File oringinalFile = new File (sc.nextLine());
	File newFile = new File (sc.nextLine());
	
	//copy files
	try {
		Files.copy(oringinalFile.toPath(), newFile.toPath());
	}
	catch(Exception e)
	{
	 System.out.println("Error!");
	}
	
	}
} 
