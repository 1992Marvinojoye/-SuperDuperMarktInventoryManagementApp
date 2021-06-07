package SuperDuperMarkt.Inventory.Management.App;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;

/**
Read more: https://www.java67.com/2019/05/how-to-read-csv-file-in-java-using-jackson-library.html#ixzz6wi5eV0ia

/**
 * 
 */

/**
 * @author marvin_ojoye
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String args[]) throws IOException {

		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		System.out.println("Reading input from console using Scanner in Java ");
		System.out.println("Please enter your input: ");
		String input = scanner.nextLine();
		System.out.println("User Input from console: " + input);
		System.out.println("Reading int from console in Java: ");
		int number = scanner.nextInt();

	}
}