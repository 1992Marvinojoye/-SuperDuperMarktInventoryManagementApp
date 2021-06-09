package CSVOerationTests;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ApacheCSVOperations {

	Map<String, String> AUTHOR_BOOK_MAP;
	String[] HEADERS;
	
	File fcsv = new File("src/main/resources/book.csv");
	
	FileOutputStream s;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		s = FileUtils.openOutputStream(fcsv);
		AUTHOR_BOOK_MAP = new HashMap<>() {
		    {
		        put("Dan Simmons", "Hyperion");
		        put("Douglas Adams", "The Hitchhiker's Guide to the Galaxy");
		    }
		};
		HEADERS = new String [] { "author", "title"};
	}

	@After
	public void tearDown() throws Exception {
	}

	

	@Test
	public void givenCSVFile_whenRead_thenContentsAsExpected() throws IOException {
	    Reader in = new FileReader(fcsv);
	    Iterable<CSVRecord> records = CSVFormat.DEFAULT
	      .withHeader(HEADERS)
	      .withFirstRecordAsHeader()
	      .parse(in);
	    
	    ArrayList<CSVRecord> rows = new ArrayList<CSVRecord>();
	    
	    for (CSVRecord record : records) {
	        String author = record.get("author");
	        String title = record.get("title");
	        assertEquals(AUTHOR_BOOK_MAP.get(author), title);
	        rows.add(record);
	    }
	    
	    rows.stream().forEach(System.out::println);
	    
	}
	
	@Test
	public void readgenericCSVBean() throws IOException {
		Arraylist<User> usercsv =
	}
}
