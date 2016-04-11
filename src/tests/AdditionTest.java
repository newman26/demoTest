package tests;

import static org.junit.Assert.*;
import math.Addition;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AdditionTest {

	protected Addition op;

	@Before
	public void setUp() throws Exception {
		op = new Addition();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculer() throws Exception {
		assertEquals(new Long(4), op.calculer(new Long(3), new Long(3)));
	}

	@Test
	public void testLireSymbole() throws Exception {
		assertEquals((Character) '+', op.lireSymbole());
	}

}
