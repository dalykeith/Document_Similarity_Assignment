package ie.gmit.sw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReadLargeFileRunnable implements Runnable{

	private String file_path;
	private Set<String> set = new HashSet<String>();
	public boolean is_finished=false;
	 public ReadLargeFileRunnable(String file_path,Set<String> set) {
	        this.file_path = file_path;
	        this.set = set;
	    }
	@Override
	public void run() {
		try(Scanner scanner = new Scanner(new File(file_path))) {
		    while ( scanner.hasNextLine() ) {
		        String line = scanner.nextLine();
		        set.addAll(Shingles.parsed_constituentShingles(line));
		    }
		    is_finished=true;
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
		
	}

}
