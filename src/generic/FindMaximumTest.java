package generic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindMaximumTest {
	static FindMaximum findMaximum;

	@Test
	void findMaximum_Of_3Integers() {
		findMaximum = new FindMaximum();
		Float currentMood = findMaximum.findMax(5.5f, 8.5f, 2.0f);
	}

}
