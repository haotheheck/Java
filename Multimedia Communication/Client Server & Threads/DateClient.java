package cs380;

import java.net.*;
import java.io.*;
public class DateClient
{
public static void main(String[] args) {
try {
//make connection to server socket
//connecting port 17 
Socket server = new Socket("127.0.0.1" ,6017);
InputStream in = server.getInputStream();
BufferedReader bin = new
BufferedReader(new InputStreamReader(in));
// read the date from the socket
String line;
while ( (line = bin.readLine()) != null)
System.out.println(line);
// close the socket connection
server.close();
}
catch (IOException ioe) {
System.err.println(ioe);
}
}
}