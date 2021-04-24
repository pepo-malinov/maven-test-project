package uni.pu.fm.st;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CategoryTest {

	@Category(SlowTests.class)
	@Test
	public void testSlowTest() {
		System.out.println("---------SlowTests---------");
		assertTrue(true);
	}

	@Category(FastTests.class)
	@Test
	public void testFastTest() {
		System.out.println("---------FastTests---------");
		assertTrue(true);
	}

}
