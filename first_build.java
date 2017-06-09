
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class first_build {
	
	public static void main(String[] args) throws IOException{
		/*
		String[] DAYS_OF_WEEK = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		String[] MONTHS_OF_YEAR = {"JAN","FEB","MAR","APR","MAY","JUN",
								   "JUL","AUG","SEP","OCT","NOV","DEC"};
		int day
		;*/
		/* 
		 * first draft didnt append
		 * 
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter work day info (EX: THR MAR 23 2017 7.5hrs)");
		String info = scan.nextLine();
		
		String filename = "/Users/darnellbradfordjr/Desktop/output.txt";
		double hours;
		try {
			PrintWriter output = new PrintWriter(filename);
			output.println(info);
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		File filename = new File("/Users/darnellbradfordjr/Desktop/output.txt");
		FileWriter f = new FileWriter(filename,true);
		BufferedWriter buffer = new BufferedWriter(f);
		PrintWriter p = new PrintWriter(buffer);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter work day info (EX: THR MAR 23 2017 7.5hrs)");
		String info = scan.nextLine();
		
		p.print(info+"\n");
		p.close();
	}
		

}
