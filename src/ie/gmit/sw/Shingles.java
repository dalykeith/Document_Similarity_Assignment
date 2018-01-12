package ie.gmit.sw;

import java.util.HashSet;
import java.util.Set;

 

public class Shingles {
	 
	/**
	 * 
	 * @param content -String type contact of the file
	 * @return Set<Shingles> - Generated Shingles from pass string
	 */
	public static  Set<String>   parsed_constituentShingles(String content){
		Set<String> set = new HashSet<String>();
		String[] splited = content.split("\\s+");
		String line = "";
		try {
			for (int i = 0; i < splited.length; i+=Configuration.SHINGLE_SIZE) {
				line=splited[i];
				for (int j = 1; j < Configuration.SHINGLE_SIZE; j++) {
					line+= (" "+splited[i+j]);
					}
				 set.add(new String(line) );
			}	
			
		} catch (ArrayIndexOutOfBoundsException e) {
			set.add(new String(line));
		}
	 return set;
		
	}
	
 

}
