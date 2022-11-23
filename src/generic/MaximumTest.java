package generic;

public class MaximumTest<T> {

	// Class Based Variables
	T x, y, z, a, b;

	// Constructor
	public MaximumTest(T x, T y, T z, T a, T b) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.a = a;
		this.b = b;
	}

	// determines the largest of three Comparable objects
	public static <T extends Comparable<T>> T maximum(T x, T y, T z, T a, T b) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		if (a.compareTo(max) > 0) {
			max = a;
		}
		if (b.compareTo(max) > 0) {
			max = b;
		}

		return max;
	}

	public static void main(String[] args) {

		// integer
		System.out.println("Maximum of " + MaximumTest.maximum(2, 1, 6, 25, 3));

		// Float
		System.out.println("Maximum of " + MaximumTest.maximum(5.0f, 56.8f, 62.4f, 25.5f, 52.2f));

		// String
		System.out.println("Maximum of " + MaximumTest.maximum("abc", "ghu", "efg", "xyz", "zab"));
	}
}
