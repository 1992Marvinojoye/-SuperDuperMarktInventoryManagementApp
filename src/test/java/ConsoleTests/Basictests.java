/**
 * 
 */
package ConsoleTests;

import SuperDuperMarkt.Inventory.Management.App.*;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.dataformat.csv.CsvSchema.Builder;

/**
 * @author marvin_ojoye
 *
 */
public class Basictests {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	
	public void testMainApp() throws IOException {
		String[] cargs = {"1","2"};
		MainApp.main(cargs);
	}
	
	/*
	public void testCSVProduct() throws IOException {
		
		File fjason = new File("src/main/resources/orderLines.json");
		
		FileOutputStream s = FileUtils.openOutputStream(fjason);

		JsonNode jsonTree = new ObjectMapper().readTree(fjason);
		
		Builder csvSchemaBuilder = CsvSchema.builder();
		JsonNode firstObject = jsonTree.elements().next();
		firstObject.fieldNames().forEachRemaining(fieldName -> {csvSchemaBuilder.addColumn(fieldName);} );
		CsvSchema csvSchema = csvSchemaBuilder.build().withHeader();
		
		CsvMapper csvMapper = new CsvMapper();
		try {
			csvMapper.writerFor(JsonNode.class)
			  .with(csvSchema)
			  .writeValue(new File("src/main/resources/orderLines.csv"), jsonTree);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	*/

}
