package Processes;

import java.io.*;
public class AProcess
{
public static void main(String[] args) throws IOException {
if (args.length != 1) {
System.err.println("Usage: java OSProcess <command>");
System.exit(0);
}
// args[0] is the command
ProcessBuilder pb = new ProcessBuilder(args[0]);
Process process = pb.start();
// obtain the input and output streams
InputStream is = process.getInputStream();
InputStreamReader isr = new InputStreamReader(is);
BufferedReader br = new BufferedReader(isr);
String line;
while ( (line = br.readLine()) != null)
System.out.println(line);
br.close();
}
}