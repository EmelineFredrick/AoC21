package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Part1 {
	public static void main(String[] args) {
		File testInput = new File("day2Test");
		Position myTestPosition = new Position();

		Scanner reader;
		try {
			reader = new Scanner(testInput);
			while (reader.hasNextLine()) {
				String command = reader.nextLine();
				if (command.contains("forward")) {
					command = command.replace("forward ", "");
					myTestPosition.forward(Integer.parseInt(command));
					//System.out.println(String.format("%d, %d", myTestPosition.horizontal, myTestPosition.depth));

				} else if (command.contains("down")) {
					command = command.replace("down ", "");
					myTestPosition.down(Integer.parseInt(command));
					//System.out.println(String.format("%d, %d", myTestPosition.horizontal, myTestPosition.depth));

				} else if (command.contains("up")) {
					command = command.replace("up ", "");
					myTestPosition.up(Integer.parseInt(command));
					//System.out.println(String.format("%d, %d", myTestPosition.horizontal, myTestPosition.depth));
				}
			}

			reader.close();

			System.out.println(String.format("%d, %d", myTestPosition.horizontal, myTestPosition.depth));
			int sum = myTestPosition.horizontal * myTestPosition.depth;
			System.out.println(sum);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
