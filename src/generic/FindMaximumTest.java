package generic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindMaximumTest {
	@Test
	void findMaximum_Of_3Integers() {
		FindMaximum findMaximum = new FindMaximum();
		assertEquals(8.5f, findMaximum.findMax(5.5f,8.5f,2.0f));
	}


}
