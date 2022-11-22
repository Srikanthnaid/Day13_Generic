package generic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindMaximumTest {
	static FindMaximum findMaximum;

	@Test
	void findMaximum_Of_3Integers() {
		findMaximum = new FindMaximum();
		Integer currentMood = findMaximum.findMax(5, 8, 2);
	}

}
