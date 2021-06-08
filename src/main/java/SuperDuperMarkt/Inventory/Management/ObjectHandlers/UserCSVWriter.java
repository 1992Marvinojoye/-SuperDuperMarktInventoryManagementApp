package SuperDuperMarkt.Inventory.Management.ObjectHandlers;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

public class UserCSVWriter {

	public static void main(String... args) {
		try {
			// create a write
			Writer writer = Files.newBufferedWriter(Paths.get("users-objects.csv"));

			// create a csv writer
			StatefulBeanToCsv<User> csvWriter = new StatefulBeanToCsvBuilder<User>(writer)
					.withSeparator(';').withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
					.withEscapechar(CSVWriter.DEFAULT_ESCAPE_CHARACTER).withLineEnd(CSVWriter.DEFAULT_LINE_END)
					.withOrderedResults(false).build();

			// create a list of objects (`User`)
			List<User> users = new ArrayList<>();
			users.add(new User(1, "Emma Watson", "emma.watson@example.com", "UK"));
			users.add(new User(2, "Nick Jones", "nick.jones@example.com", "DE"));
			users.add(new User(3, "Shanzay Alai", "shanzay.alai@example.com", "US"));

			// write list of objects
			csvWriter.write(users);

			// close the writer
			writer.close();
			
			users.forEach(e -> Arrays.asList(e).stream().forEach(System.out::println));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
