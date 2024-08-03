/**
 * Taken directly from assignment 6 instructions.
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DataUpload {

	public static void main(String[] args) throws IOException {
		Library[] data = new Library[17478];
		data = uploadData();
		
		for(int i = 0; i < 10; i++) {
			System.out.print(i + "\t");
			System.out.println(data[i].toString());
		}

	}
	
	static public Library[] uploadData() throws IOException{
		Library[] data = new Library[17478];
		
		String fileName = "LibrariesData.txt";
		File myFile = new File(fileName);
		Scanner fileScan = new Scanner(myFile);
		
		int pos = 0;
		
		while(fileScan.hasNextLine()) {
			String line = fileScan.nextLine();
			
			Scanner lineScanner = new Scanner(line);
			lineScanner.useDelimiter("\t");
			while(lineScanner.hasNext()) {
				String state = lineScanner.next();
				String branch = lineScanner.next();
				String city = lineScanner.next();
				String zip = lineScanner.next();
				String county = lineScanner.next();
				int squareFeet = Integer.parseInt(lineScanner.next());
				int hoursOpen = Integer.parseInt(lineScanner.next());
				int weeksOpen = Integer.parseInt(lineScanner.next());
				data[pos] = new Library(state,branch,city,zip,county,squareFeet,hoursOpen,weeksOpen);
			}
			pos++;
		}
		return data;
	}

}
