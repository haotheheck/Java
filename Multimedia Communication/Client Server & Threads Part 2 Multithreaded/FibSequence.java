package cs380v1;
import java.io.*;
public class FibSequence extends Thread {

	
	
	public void run() {
		try {
			//declaring integer variables for Fibonacci
			int x = 0, y = 1, z = 0;
			
			BufferedReader  read = new BufferedReader (new InputStreamReader(System.in));
			//User input to computed Fibonacci sequence
			System.out.print("Please enter the number of\r\n"
					+ "Fibonacci numbers that the program should generate: ");
			int n = Integer.parseInt(read.readLine());
			
			//S.O.P result 
			System.out.println("Fibonacci result: ");
			while(n>0) {
				//Fibonacci sequence formula 
                System.out.print(z+ " ");
                
                x=y;
                y=z;
                z=x+y;
                n=n-1;
			}
			
		}
		 catch (Exception ex)
        {
             ex.printStackTrace();
        }
		
	}
	
}


