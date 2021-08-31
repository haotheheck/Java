package cs380;


import java.net.*;
import java.io.*;
public class DateServer
{
public static void main(String[] args) {
	try {
ServerSocket server = new ServerSocket(6017);
// now listen for connections

String Quote = "Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma – which is living with the results of other people's thinking. "
		+ "\n Stay hungry and Stay foolish! - Steve Jobs";
while (true) {
//start socket to handle server connection 
Socket client = server.accept();
//creating ServerThread to initiate the server from socket   
new ServerThread(client).start();
PrintWriter pout = new
PrintWriter(client.getOutputStream(), true);
// write the Quote to the socket
pout.println("Quote of the day: " + Quote);
// close the socket and resume
// listening for connections
client.close();

}
}
catch (IOException ioe) {
System.err.println(ioe);
}
}
}


