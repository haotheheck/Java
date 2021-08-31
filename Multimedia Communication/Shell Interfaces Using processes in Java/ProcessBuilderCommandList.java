package Processes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class ProcessBuilderCommandList {

	public static void main(String[] args) {

		/*
		 * that launching the command prompt to
		 * execute directory listing of shell commands 
		 */

		List shell = new ArrayList<>();

		// add the list of commands and start the application 
		shell.add("cmd.exe");
		shell.add("/C");
		shell.add("start;");



		// initialize the processbuilder
		ProcessBuilder builder = new ProcessBuilder();
		builder.command(shell);
		try {
			// start the process
			builder.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}