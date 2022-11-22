package generic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindMaximumTest {

	@Test
	void findMaximum_Of_3Integers() {
		FindMaximum findMaximum = new FindMaximum();
		String currentMood = findMaximum.findMax("abc", "ghi", "def");
	}

}
