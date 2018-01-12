package ie.gmit.sw;

import java.util.HashSet;
import java.util.Set;

public class MinHashRunnable implements Runnable{
	private Set<String> set1 = new HashSet<String>();
	private Set<String> set2 = new HashSet<String>(); 
	
	
	public MinHashRunnable(Set<String> set1, Set<String> set2) { 
		this.set1 = set1;
		this.set2 = set2;
		
	}
	
	@Override
	public void run() {
		System.out.println("---------------------------------------------------");
		
		MinHash<String> minHash  = new MinHash<String>(set1.size()+set2.size());
		System.out.println("set1 "+set1.size());
		System.out.println("set2 "+set2.size());
		System.out.println("Document Similiary "+ minHash.similarity(set1, set2)*100+"%");
		System.out.println("---------------------------------------------------");
		
	}

}
