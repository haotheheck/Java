package cs380;

import java.net.*;
import java.io.*;

public class ServerThread extends Thread {

	//creating server thread
	  Socket client;
	  ServerThread(Socket socket){
		  this.client = socket;
	  }
	  
	
	
//creating run method to executed this thread

	public void run() {
		String quote = null;
		try {
			//Connecting socket via client
			//using getInputStream to pick up the dateClient
			BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(client.getInputStream()));
			
			//while there is Quote, the serverThread will go ahead and read the quote of the day from the server
			while((quote = bufferedReader.readLine()) != null) {
				System.out.println(quote);
			}
			//close the socket
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
