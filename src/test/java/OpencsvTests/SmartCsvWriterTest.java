package OpencsvTests;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import OpencsvTests.Datamodels.SmartCsvWriter;

import org.junit.*;

import java.io.IOException;

import static org.junit.Assert.*;

public class SmartCsvWriterTest {
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
	public void writeSpaceships()
			throws CsvRequiredFieldEmptyException, IOException, CsvDataTypeMismatchException, InterruptedException {
		new SmartCsvWriter().writeSpaceships();
	}
}