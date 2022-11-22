package generic;

public class FindMaximum {
	
	// Method with parameters as float data type
	public static Float findMax(Float a,Float b,Float c) {
		
		Float max = a;//assume initially a is maximum
		// comparing numbers using compareTo method.
		if (b.compareTo(max) > 0 ) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		//FindMaximum maximum = new FindMaximum();
		System.out.println("Maximum of among 3 integers is "+findMax(5.5f, 8.25f, 2.0f));

	}

}
