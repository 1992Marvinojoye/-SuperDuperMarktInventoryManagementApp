package OpencsvTests;

import org.junit.*;

import OpencsvTests.Datamodels.SpaceShipCsvWriter;

import java.io.IOException;

import static org.junit.Assert.*;

public class SpaceShipCsvWriterTest {
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
	public void doWrite() throws IOException {
		new SpaceShipCsvWriter().doWrite();
	}
}