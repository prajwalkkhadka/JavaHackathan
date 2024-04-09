package java_hackathan;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q31ReadaFile {

	public static void main(String[] args) throws Throwable {
		// Q31. Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1)

		String inputFile = "/Users/prajwalkhadka/eclipse-workspace/Workspace/Automation/files/ReadFile.txt";
		String outputFile = "/Users/prajwalkhadka/eclipse-workspace/Workspace/Automation/files/Writefile.txt";

		//try {
		List<String> lines = readLines(inputFile);
		Collections.reverse(lines);
		writeLines(outputFile, lines);
		System.out.println("Content reversed and written to " + outputFile);
		//} catch(IOException e) {
		//	e.printStackTrace();
	}


		private static List<String> readLines(String inputFile) throws IOException {
			List<String> lines = new ArrayList<>();
			try(BufferedReader reader = new BufferedReader(new FileReader("/Users/prajwalkhadka/eclipse-workspace/Workspace/Automation/files/ReadFile.txt"))){
				String line;	
				while ((line = reader.readLine()) != null) {
					lines.add(line);
				}
			}
			return lines;
		}
		private static void writeLines(String outputFile, List<String> lines) throws IOException {
			try (BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/prajwalkhadka/eclipse-workspace/Workspace/Automation/files/Writefile.txt"))) {
				for (String line : lines) {
					writer.write(line);
					writer.newLine();
					
				}
			}
		
		}
		
		}
