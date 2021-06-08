package OpencsvTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import OpencsvTests.Datamodels.SmartCsvReader;
import OpencsvTests.Datamodels.SpaceShip;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.Assert.*;

public class SmartCsvReaderTest {
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
	public void readCsvFile() throws FileNotFoundException {
		List<SpaceShip> spaceShips = new SmartCsvReader().readCsvFile();

		spaceShips.forEach(spaceship -> System.out.println(spaceship));
	}
}