package day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Part1 {
	public static void main(String[] args) {
		File input = new File("day3Test");
		ArrayList<String> binary = new ArrayList<String>();
		Power myPowerLevel = new Power();

		Scanner reader;
		try {
			reader = new Scanner(input);
			while (reader.hasNextLine()) {
				String command = reader.nextLine();
				binary.add(command);
				//System.out.println(binary);
			
			}
			myPowerLevel.calculateGamma(binary);
		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
