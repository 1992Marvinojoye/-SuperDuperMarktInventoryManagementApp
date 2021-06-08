package SuperDuperMarkt.Inventory.Management.ObjectHandlers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
import com.opencsv.exceptions.CsvException;

public class UserCSVReader {

	public static void main(String... args) throws IOException, CsvException {
		/*
		 * try {
		 * 
		 * CsvToBean csv = new CsvToBean();
		 * 
		 * String csvFilename = "users-objects.csv";
		 * 
		 * CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
		 * 
		 * // Set column mapping strategy ColumnPositionMappingStrategy strategy = new
		 * ColumnPositionMappingStrategy(); strategy.setType(User.class); String[]
		 * columns = new String[] { "COUNTRY", "EMAIL", "ID", "NAME" };
		 * strategy.setColumnMapping(columns);
		 * 
		 * List<User> users = csv.parse(strategy, csvReader);
		 * 
		 * // iterate through users for (User user : users) { System.out.println("ID: "
		 * + user.getId()); System.out.println("Name: " + user.getName());
		 * System.out.println("Email: " + user.getEmail());
		 * System.out.println("Country: " + user.getCountryCode()); }
		 * 
		 * } catch (IOException ex) { ex.printStackTrace(); }
		 */

		// "src/main/resources/numbers.csv";

		/*
		 * var fileName = "users-objects.csv"; Path myPath = Paths.get(fileName);
		 * 
		 * CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
		 * 
		 * try (var br = Files.newBufferedReader(myPath, StandardCharsets.UTF_8);
		 * 
		 * var reader = new CSVReaderBuilder(br).withCSVParser(parser).build()) {
		 * 
		 * List<String[]> rows = reader.readAll();
		 * 
		 * for (String[] row : rows) {
		 * 
		 * for (String e : row) { System.out.format("%s ", e); } System.out.println(); }
		 * 
		 * rows.forEach(e -> Arrays.asList(e).stream().forEach(System.out::println));
		 * 
		 * }
		 */

		/*
		 * // Set column mapping strategy ColumnPositionMappingStrategy strategy = new
		 * ColumnPositionMappingStrategy(); strategy.setType(User.class);
		 * strategy.setColumnMapping(columns);
		 * 
		 * List<User> beans = new CsvToBeanBuilder(new FileReader(fileName))
		 * .withSeparator(';') .withMappingStrategy(strategy) .withType(User.class)
		 * .build() .parse();
		 * 
		 * beans.forEach(System.out::println);
		 */

		/*
		 * CSVReader reader = new CSVReader(new FileReader(fileName), ';');
		 * ColumnPositionMappingStrategy<User> beanStrategy = new
		 * ColumnPositionMappingStrategy<User>(); beanStrategy.setType(User.class);
		 * beanStrategy.setColumnMapping( new String[] { "COUNTRY", "EMAIL", "ID",
		 * "NAME" });
		 * 
		 * CsvToBean<User> csvToBean = new CsvToBean<User>();
		 * 
		 * List<User> emps = csvToBean.parse(beanStrategy, reader);
		 * 
		 * System.out.println(emps);
		 */

		/*
		 * Path myPath1 = Paths.get(fileName); try (BufferedReader br =
		 * Files.newBufferedReader(myPath1, StandardCharsets.UTF_8)) {
		 * 
		 * HeaderColumnNameMappingStrategy<User> strategy = new
		 * HeaderColumnNameMappingStrategy<>(); strategy.setType(User.class);
		 * 
		 * CsvToBean<User> csvToBean = new CsvToBeanBuilder<User>(br)
		 * .withMappingStrategy(strategy) .withSeparator(';')
		 * .withIgnoreLeadingWhiteSpace(true) .withOrderedResults(false) .build();
		 * 
		 * List<User> users = csvToBean.parse();
		 * 
		 * users.forEach(System.out::println); }
		 */

		// displayCSVRows();
		displayCSVBeansv2();
	}

	public static void displayCSVRows() throws IOException {
		var fileName = "users-objects.csv";
		Path myPath = Paths.get(fileName);

		CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

		try (var br = Files.newBufferedReader(myPath, StandardCharsets.UTF_8);

				var reader = new CSVReaderBuilder(br).withCSVParser(parser).build()) {

			List<String[]> rows = reader.readAll();

			for (String[] row : rows) {

				for (String e : row) {
					System.out.format("%s ", e);
				}
				System.out.println();
			}

			rows.forEach(e -> Arrays.asList(e).stream().forEach(System.out::println));

		}
	}

	public static void displayCSVBeans() throws IOException {
		ColumnPositionMappingStrategy<User> beanStrategy = new ColumnPositionMappingStrategy<User>();
		beanStrategy.setType(User.class);
		beanStrategy.setColumnMapping(new String[] { "COUNTRY", "EMAIL", "ID", "NAME" });

		final String SAMPLE_CSV_FILE_PATH = "users-objects.csv";
		try (Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));) {
			@SuppressWarnings("unchecked")
			CsvToBean<User> csvToBean = new CsvToBeanBuilder<User>(reader).withMappingStrategy(beanStrategy)
					.withSeparator(';').withOrderedResults(false).build();

			Iterator<User> csvUserIterator = csvToBean.iterator();

			while (csvUserIterator.hasNext()) {
				User User = csvUserIterator.next();
				System.out.println("ID : " + User.getId());
				System.out.println("Name: " + User.getName());
				System.out.println("Email : " + User.getEmail());
				System.out.println("Country : " + User.getCountryCode());
				System.out.println("==========================");
			}
		}
	}
	
	public static void displayCSVBeansv2() throws IOException {

        // Hashmap to map CSV data to 
        // Bean attributes.
        Map<String, String> mapping = new 
                      HashMap<String, String>();
        mapping.put("id", "id");
        mapping.put("name", "name");
        mapping.put("email", "email");
        mapping.put("country", "countryCode");
  
        // HeaderColumnNameTranslateMappingStrategy
        // for User class
        HeaderColumnNameTranslateMappingStrategy<User> strategy =
             new HeaderColumnNameTranslateMappingStrategy<User>();
        strategy.setType(User.class);
        strategy.setColumnMapping(mapping);
  
        // Create castobaen and csvreader object
        CSVReader csvReader = null;
        try {
            csvReader = new CSVReader(new FileReader
            ("users-objects.csv"));
        }
        catch (FileNotFoundException e) {
  
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        CsvToBean csvToBean = new CsvToBean();
  
        // call the parse method of CsvToBean
        // pass strategy, csvReader to parse method
        List<User> list = csvToBean.parse(strategy, csvReader);
  
        // print details of Bean object
        for (User e : list) {
            System.out.println(e);
        }
	}

}
