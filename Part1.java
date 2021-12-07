package day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Part1 {
	public static void main(String[] args) {
		//goes through each letter of the byte in order, not first of each
		//second of each ect.
		File input = new File("day3Input");
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
			int gamma = myPowerLevel.calculateGamma(binary);
			int epsilon = myPowerLevel.calculateEpsilon(binary);
			int PowerConsumption = gamma * epsilon;
			System.out.println(PowerConsumption);
			
		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
