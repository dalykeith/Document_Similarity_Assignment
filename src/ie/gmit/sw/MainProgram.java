package ie.gmit.sw;

import java.util.HashSet;
import java.util.Set;

public class MainProgram {

	public static void main(String[] args) {
		String file_path1 = args[0];
		String file_path2 = args[1];
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		ReadLargeFileRunnable thread1 = new ReadLargeFileRunnable(file_path1,
				set1);
		ReadLargeFileRunnable thread2 = new ReadLargeFileRunnable(file_path2,
				set2);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);

		t1.start();
		t2.start();
		System.out.println("------------------Reading File.....----------------");

		System.out.println("");
		while (!thread1.is_finished && !thread2.is_finished) {
			System.out.println("*");
		}

		MinHashRunnable thread3 = new MinHashRunnable(set1, set2);
		Thread t3 = new Thread(thread3);
		t3.start();
		System.out.println("---------------------Generating Similarity----------------------");
	}

}
