package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ControllerFacadeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	
	public void ControllerFacadeStart() {
		try {
		new ControllerFacade(null, null);
		fail("wrong entries");
		} catch (final Exception e) {
		final String expected = "Strength out of range";
		assertEquals(expected, e.getMessage());
		}
		
		
	}

}
