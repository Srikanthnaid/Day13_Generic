package generic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindMaximumTest {
	
	@Test
	void findMaximum_Of_3Integers() {
		FindMaximum findMaximum = new FindMaximum();
		assertEquals(8, findMaximum.findMax(5,8,2));
	}
}
