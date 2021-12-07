package day3;

import java.util.ArrayList;

public class Power {
	int gamma;
	int epsilon;
	int totalPower;

	int totalPower(int gamma, int epsilon) {
		int total = gamma * epsilon;
		return total;
	}
	
	int calculateGamma(ArrayList<String> input) {
		int gamma = 0;
		//Gamma is base-10 value
		String tempGamma = "";
		//tempGamma is string of binary
		System.out.println(input);
		for (int num = 0; num < input.get(1).length(); num++) {
			//System.out.printf("Byte is: %s \n", input.get(num));
			int one = 0;
			int zero = 0;
			for (int inList = 0; inList < input.size(); inList++) {
				String character = Character.toString(input.get(inList).charAt(num));
				if (character.equals("1")) {
					//System.out.print("\nPlus One!");
					one++;
				} else if (character.equals("0")) {
					//System.out.print("\nPlus Zero!");
					zero++;
				} else {
					System.out.print("\nERROR: not one or zero!");
				}
			}
			if (one > zero) {
				tempGamma = tempGamma + "1";
			} else if (zero > one) {
				tempGamma = tempGamma + "0";
			} else {
				System.out.println("ERROR!");
			}
			one = 0;
			zero = 0;
			//System.out.printf("\nGamma:  %s \n", tempGamma);
		}
		gamma = Integer.parseInt(tempGamma, 2);
		return gamma;
	}
	
	int calculateEpsilon(ArrayList<String> input) {
		int Epsilon = 0;
		String tempEpsilon = "";
		System.out.println(input);
		for (int num = 0; num < input.get(1).length(); num++) {
			//System.out.printf("Byte is: %s \n", input.get(num));
			int one = 0;
			int zero = 0;
			for (int inList = 0; inList < input.size(); inList++) {
				String character = Character.toString(input.get(inList).charAt(num));
				if (character.equals("1")) {
					//System.out.print("\nPlus One!");
					one++;
				} else if (character.equals("0")) {
					//System.out.print("\nPlus Zero!");
					zero++;
				} else {
					System.out.print("\nERROR: not one or zero!");
				}
			}
			if (one < zero) {
				tempEpsilon = tempEpsilon + "1";
			} else if (zero < one) {
				tempEpsilon = tempEpsilon + "0";
			} else {
				System.out.println("ERROR!");
			}
			one = 0;
			zero = 0;
			//System.out.printf("\Epsilon:  %s \n", tempEpsilon);
		}
		Epsilon = Integer.parseInt(tempEpsilon, 2);
		return Epsilon;
	}

}
