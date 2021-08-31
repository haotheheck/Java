package Processes;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABasicShell {
    public static void main (String [] args) throws IOException, InterruptedException{
        //SHELL COMMANDS
        String [] command = {"doskey"};
        //String [] command = {"ping", "bing.com "};
	//String [] command = {"cd", "user/haon9", "/picture"};
        
        //DECLARING PROCESSBUILDER
        ProcessBuilder processBuilder = new ProcessBuilder(command); 
        processBuilder.directory(new File(System.getProperty("user.home")));
        
        try {
            Process process = processBuilder.start();
            //DECLARING READER 
            BufferedReader reader = 
                new BufferedReader (new InputStreamReader(process.getInputStream()));
            
            
            
            String line;
            //to read console in line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            int exit = process.waitFor(); 
            
            System.out.println ("\nExited with error code : " + exit);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}